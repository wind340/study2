package com.cos.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.jwt.model.User;

//crud 함수를 repository가 들고있음
//@Repository라는 어노테이션없어도 IoC된다. (JpaRepository를 상속했기때문)
public interface UserRepository extends JpaRepository<User, Long>{
	
	//findBy규칙 -> Username문법
	//select * from user where username = ?
	public User findByUsername(String username);	//Jpa Query method (직접찾아보자)
	
	//select * from user where email =? 이렇게 실행된다.
	//public User findByEmail();

}
