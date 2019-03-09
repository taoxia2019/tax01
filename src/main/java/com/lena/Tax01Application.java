package com.lena;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lena.mapper")
public class Tax01Application {

	public static void main(String[] args) {
		SpringApplication.run(Tax01Application.class, args);
	}

}
