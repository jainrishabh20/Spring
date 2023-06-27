package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
	AbstractApplicationContext applicationContext =new	ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
// 	Samosa sa1= (Samosa) applicationContext.getBean("s1");
//	System.out.println(sa1);
	//Registry Shutdown hook
	applicationContext.registerShutdownHook();
	
//	System.out.println("+++++++++++++++++");
//	Pepsi p1= (Pepsi) applicationContext.getBean("p1");
//	System.out.println(p1);
	
	Example example= (Example) applicationContext.getBean("example");
	System.out.println(example);
	
	
	
	}
}


//Setting Price
//Inside init method
//Samosa [price=10.0]
//Inside in desstroy method