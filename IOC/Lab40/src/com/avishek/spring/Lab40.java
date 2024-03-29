package com.avishek.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;

public class Lab40 {
	public static void main(String[] args) {
		
		
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("----------Spring Container Is Ready----------\n");
	
		
		TestBean test = (TestBean) ctx.getBean("test");
		test.showEnglish();
		test.showHindi();
		test.showOdia();
		
	}
}
