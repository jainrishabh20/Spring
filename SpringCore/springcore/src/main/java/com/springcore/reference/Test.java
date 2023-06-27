package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("com/springcore/reference/config.xml");
		A a1= (A) applicationContext.getBean("aref");
		System.out.println(a1);

	}

}
