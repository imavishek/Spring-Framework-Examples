package com.avishek.spring;

public class Hello {
	private A ao;
	

	static{
		System.out.println("Load Hello Bean");
	}
	
	public  Hello(){
		System.out.println("Class Hello Default Constructor");
	}
	
	
	public void setAo(A ao) {
		System.out.println("Class Hello - setAo()");
		this.ao = ao;
	}


	public void show()
	{
		ao.showA();
	}
}