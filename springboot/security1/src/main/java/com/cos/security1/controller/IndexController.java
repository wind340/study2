package com.cos.security1.controller;

import org.apache.catalina.authenticator.SpnegoAuthenticator.AuthenticateAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.security1.config.auth.PrincipalDetails;
import com.cos.security1.model.User;
import com.cos.security1.repository.UserRepository;

@Controller
public class IndexController {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@GetMapping("/test/login")
	public @ResponseBody String testLogin(
			Authentication authentication,
			@AuthenticationPrincipal PrincipalDetails userDetails) {	//의존성 주입
		System.out.println("/test/login==========");
		PrincipalDetails principalDetails = (PrincipalDetails)authentication.getPrincipal();
		System.out.println("authontication : "+principalDetails.getUser());
		
		System.out.println("userDetails : "+userDetails.getUser());
		return "세션정보확인하기";
	}
	
	@GetMapping("/test/oauth/login")
	public @ResponseBody String testOAuthLogin(
			Authentication authentication,
			@AuthenticationPrincipal OAuth2User oauth) {	//의존성 주입
		System.out.println("/test/login==========");
		OAuth2User principalDetails = (OAuth2User)authentication.getPrincipal();
		System.out.println("authontication : "+principalDetails.getAttributes());
		System.out.println("oauth2User : "+oauth.getAttributes());
		return "세션정보확인하기";
	}
	
	
	@GetMapping({"","/"})
	public String index() {
		//머스테치 기본폴더 src/main/resources/
		//뷰 리졸버 설정 : templates(prefix), mustache(suffix)생략가능!
		return "index";	//src/main/resources/templates/index.mustache 를 찾는다
	}
	
	//OAuth로그인을 해도 일반로그인을 해도 PrincipalDetails
	@GetMapping("/user")
	public @ResponseBody String user(@AuthenticationPrincipal PrincipalDetails principalDetails) {
		System.out.println("principalDetails : " + principalDetails.getUser());
		return "user";
	}
	
	@GetMapping("/admin")
	public @ResponseBody String admin() {
		return "admin";
	}
	
	@GetMapping("/manager")
	public @ResponseBody String manager() {
		return "manager";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/loginForm")
	public String loginForm() {
		return "loginForm";
	}
	
	@GetMapping("/joinForm")
	public String joinForm() {
		return "joinForm";
	}
	
	@PostMapping("/join")
	public String join(User user) {
		System.out.println(user);
		user.setRole("ROLE_USER");
		String rawPassword=user.getPassword();
		String encPassword=bCryptPasswordEncoder.encode(rawPassword);
		user.setPassword(encPassword);
		userRepository.save(user);	//이렇게 되면 비밀번호가 그대로 저장->시큐리티로 로그인할수 없음. (암호화가 안되서)
		return "redirect:/loginForm";
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/info")
	public @ResponseBody String info() {
		return "개인정보";
	}
	
	//한개를 걸때는 secured 여러개의 권한이 필요할떄 PreAuthorize
	@PreAuthorize("hasRole('ROLE_MANAGER') or hasRole('ROLE_ADMIN')")
	@GetMapping("/data")
	public @ResponseBody String data() {
		return "데이터 정보";
	}
	
}
