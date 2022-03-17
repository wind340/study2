package com.myboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.myboot.domain.Notice;

@Configuration
public class MyConfig {
	//notice dto를 빈으로 등록하기
	
	@Bean
	public Notice notice() {
		Notice notice= new Notice();
		notice.setTitle("저는 xml이아니라 자바설정 클래스로 태어났으요");
		return notice;
	}
}
