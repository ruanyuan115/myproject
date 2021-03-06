package com.tju.myproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tju.myproject.dao")
public class MyprojectApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyprojectApplication.class, args);
	}

}

