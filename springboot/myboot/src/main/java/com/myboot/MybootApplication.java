package com.myboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import com.myboot.config.DBConfig;
import com.myboot.domain.Notice;

@SpringBootApplication
@Import(DBConfig.class)	//xml대신 자바가 설정을 담당하므로..
public class MybootApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = null;
		
		context = SpringApplication.run(MybootApplication.class, args);
		
		
	}
}
