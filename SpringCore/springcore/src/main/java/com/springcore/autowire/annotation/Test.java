package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext	=new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/autoconfig.xml");
		
		Employee emp= applicationContext.getBean("emp1", Employee.class);
	    System.out.println(emp);
	}

}
