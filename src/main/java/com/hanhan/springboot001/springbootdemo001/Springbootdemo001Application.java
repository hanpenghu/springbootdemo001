package com.hanhan.springboot001.springbootdemo001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@MapperScan("com.hanhan.springboot001.springbootdemo001.dao.mapperJava01")
public class Springbootdemo001Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootdemo001Application.class, args);
	}
}
