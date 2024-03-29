package com.avishek.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class A {
	private int a;
	private String msg;
	
	
	static{
		System.out.println("Load A Bean");
	}
	
	public  A(){
		System.out.println("Class A Default Constructor");
	}
	
	public void setA(int a) {
		System.out.println("Class A - setA()");
		this.a = a;
	}
	public void setMsg(String msg) {
		System.out.println("Class A - setMsg()");
		this.msg = msg;
	}
	
	@PostConstruct
	public void init1(){
		System.out.println("Class A-init1()");
	}
	
	@PreDestroy
	public void cleanUp(){
		System.out.println("Class A-cleanUp()");
	}
	
	@Override
	public String toString() {
		return  a + "\t" + msg;
	}
	
	
}
