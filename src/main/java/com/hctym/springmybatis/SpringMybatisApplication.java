package com.hctym.springmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@MapperScan("com.hctym.springmybatis.mapper")
public class SpringMybatisApplication extends SpringBootServletInitializer{

	@RequestMapping("/")
	public String hello(){
		return "hellp springboot!";
	}




	public static void main(String[] args) {
        
		SpringApplication.run(SpringMybatisApplication.class, args);

	}

}
