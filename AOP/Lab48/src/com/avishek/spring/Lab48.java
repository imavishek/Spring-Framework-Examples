package com.avishek.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab48 {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("----------Spring Container Is Ready----------\n");
		
		/*AccountService as = (AccountService) ctx.getBean("as");
		as.getBal();                                                                                                                                                                                                                                                                                         
		as.myDeposit();
		as.myWithdraw();
		
		CustomerService cs = (CustomerService) ctx.getBean("cs");
		
		cs.addCustomer();
		cs.updateCustomer();*/
		
		
		CustomerService csp = (CustomerService) ctx.getBean("csProxy");
		
		csp.addCustomer();
		csp.updateCustomer();
		
		AccountService asp = (AccountService) ctx.getBean("asProxy");
		
		asp.getBal();
		asp.myDeposit();
		try {
			asp.myWithdraw();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
	}
}
