package com.example.demoUser.conf;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DozerMapper {
	
	    @Bean 
	    public DozerBeanMapper beanMapper() {
	        return new DozerBeanMapper();  
	    }
	
}
