package com.example.demoUser.conf;

import org.apache.catalina.mapper.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class UserMapper {
	
	@Bean
	public Mapper beanMapper() {
		// (3)
		return new Mapper();
	}
}
