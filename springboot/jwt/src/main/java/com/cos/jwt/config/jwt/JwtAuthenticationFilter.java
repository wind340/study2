package com.cos.jwt.config.jwt;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

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
			BufferedReader br = request.getReader();
			
			String input = null;
			while((input=br.readLine()) != null) {
				System.out.println(input);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//2.정상인지 로그인을 시도해본다. authenticationManager로 로그인 시도를 하면 PrincipalDetailsService가 호출되고 loadUserByUsername() 함수가 실행됨.

		//3.PrincipalDetails를 세션에 담고 (담는 이유는 권한관리를 위함이다.)

		//4.JWT토큰을 만들어서 응답해주면 됨.

	
		return super.attemptAuthentication(request, response);
	}
}
