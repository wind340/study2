package com.cos.jwt.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
	
	@Bean
	public FilterRegistrationBean<MyFilter1> filter1(){
		FilterRegistrationBean<MyFilter1> bean = new FilterRegistrationBean<MyFilter1>(new MyFilter1());
		bean.addUrlPatterns("/*");
		bean.setOrder(1);//낮은 번호가 필터중에서 가장 먼저 실행됨.
		return bean;
	}
	
	@Bean
	public FilterRegistrationBean<MyFilter2> filter2(){
		FilterRegistrationBean<MyFilter2> bean = new FilterRegistrationBean<MyFilter2>(new MyFilter2());
		bean.addUrlPatterns("/*");
		bean.setOrder(0);//낮은 번호가 필터중에서 가장 먼저 실행됨.
		return bean;
	}
	
}
