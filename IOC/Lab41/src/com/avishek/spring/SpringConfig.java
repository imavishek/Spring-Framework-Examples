package com.avishek.spring;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class SpringConfig {

	@Bean(name="test")
	public TestBean test(){
		return new TestBean();
	}
	
	@Bean(name="messageSource") // Bean name must be "messageSource"
	public MessageSource message(){
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("messages");
		messageSource.setDefaultEncoding("UTF-8");
		
		return messageSource;
	}
}
