package com.cos.jwt.config.jwt;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.cos.jwt.config.auth.PrincipalDetails;
import com.cos.jwt.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.RequiredArgsConstructor;

//스프링 시큐리티에서 UsernamePasswordAuthenticationFilter를 
// login 요청해서 username, password 전송하면 (post)
//UsernamePasswordAuthenticationFilter가 동작함. 
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter{

	private final AuthenticationManager authenticationManager;
	
	//  ("/login")요청을 하면 로그인 시도를 위해서 실행되는 함수
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {
		System.out.println("JwtAuthenticationFilter:로그인 시도중");

		//1.username, password 를 받아서
		try {
//			BufferedReader br = request.getReader();
//			String input = null;
//			while((input=br.readLine()) != null) {
//				System.out.println(input);
//			}
			ObjectMapper om = new ObjectMapper();
			User user = om.readValue(request.getInputStream(), User.class);
			System.out.println(user);
			
		//2.정상인지 로그인을 시도해본다. authenticationManager로 로그인 시도를 하면 PrincipalDetailsService가 호출되고 loadUserByUsername() 함수가 실행됨.
			UsernamePasswordAuthenticationToken authenticationToken = 
			new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword());

		//PrincipalDetailsService가 호출되고 loadUserByUsername() 함수가 실행되는부분
		//DB에 있는 username과 password가 일치한다
			Authentication authentication = authenticationManager.authenticate(authenticationToken);
		
		//3.PrincipalDetails를 세션에 담고 (담는 이유는 권한관리를 위함이다.)
		//authentication 객체가 session영역에 저장됨 => 로그인이 되었다는 뜻
			PrincipalDetails principalDetails = (PrincipalDetails)authentication.getPrincipal();
			System.out.println("로그인 완료됨"+principalDetails.getUser().getUsername());	//로그인이 정상적으로 되었다는 뜻
		//authentication객체가 session영역에 저장을 해야하고 그방법이 return 해주면 됨
		//return의 이유는 권한 관리를 security가 대신 해주기 때문에 편하려고 하는것
		//굳이 JWT토큰을 사용하면서 세션을 만들 이유가 없음. 근데 단지 권한 처리때문에 session넣어 준다.
		return authentication;

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	//4.JWT토큰을 만들어서 응답해주면 됨.
	
	//attemptAuthentication실행후 인증이 정상적으로 되었으면 successfulAuthentication함수가 실행
	//JWT토큰을 만들어서 request 요청한 사용자에게 JWT토큰을 response해주면 됨.
	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		System.out.println("successfulAuthentication실행됨: 인증이 완료되었다는 뜻임.");
		PrincipalDetails principalDetails = (PrincipalDetails)authResult.getPrincipal();
		
		String jwtToken = JWT.create()
				.withSubject(principalDetails.getUsername())
				.withExpiresAt(new Date(System.currentTimeMillis()+JwtProperties.EXPIRATION_TIME))
				.withClaim("id", principalDetails.getUser().getId())
				.withClaim("username", principalDetails.getUser().getUsername())
				.sign(Algorithm.HMAC512(JwtProperties.SECRET));
		
		response.addHeader(JwtProperties.HEADER_STRING, JwtProperties.TOKEN_PREPIX+jwtToken);
	}
}