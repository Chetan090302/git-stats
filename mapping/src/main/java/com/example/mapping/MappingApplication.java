package com.example.mapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class MappingApplication
{

	public static void main(String[] args) {
		BCryptPasswordEncoder obj=new BCryptPasswordEncoder();
		System.out.print(obj.encode("1234"));
		SpringApplication.run(MappingApplication.class, args);
	}
}
