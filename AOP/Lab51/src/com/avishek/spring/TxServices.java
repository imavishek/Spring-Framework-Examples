package com.avishek.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TxServices {
	
	@Pointcut(value="execution(* com.avishek.spring.AccountService.my*(..))")
	public void PC1(){}
	
	@Pointcut(value="execution(* com.avishek.spring.CustomerService.add*(..))")
	public void PC2(){}
	
	@Around("PC1() || PC2()")
	public void runTx(ProceedingJoinPoint pjp) throws Throwable{
		begin();
		
		pjp.proceed();
		
		commit();
		
	}
	
	
	public void begin(){
		System.out.println("TxServices-begin()");
	}
	
	
	public void commit(){
		System.out.println("TxServices-commit()");
	}
	
	@AfterThrowing("PC1() || PC2()")
	public void rollback(){
		System.out.println("TxServices-rollback()");
	}
}
