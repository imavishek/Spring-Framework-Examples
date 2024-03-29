package com.avishek.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Lab36 {
	public static void main(String[] args) {
		
		
	
	
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
	
		System.out.println("----------Spring Container Is Ready----------");
	
		Hello h = (Hello)ctx.getBean("hello");
		h.show();
		
		System.out.println("----------Spring Container Is Going To Shut Down----------");
		ctx.registerShutdownHook();
		
	}
}
