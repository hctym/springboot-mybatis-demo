package com.hctym.springmybatis;

import io.swagger.annotations.Api;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.oas.annotations.EnableOpenApi;

@RestController
@SpringBootApplication
@MapperScan("com.hctym.springmybatis.mapper")
@EnableOpenApi
@Api(tags = "startDemo")
public class SpringMybatisApplication extends SpringBootServletInitializer{

	@GetMapping("/")
	public String hello(){
		return "hellp springboot!";
	}




	public static void main(String[] args) {
        
		SpringApplication.run(SpringMybatisApplication.class, args);

	}

}
