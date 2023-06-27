package com.springcore.constructorInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContex=new ClassPathXmlApplicationContext("com/springcore/constructorInj/config.xml");
		Person p1= (Person) applicationContex.getBean("person1");
		System.out.println(p1);
		
		Addition add= (Addition) applicationContex.getBean("add");
		add.doSum();
    
	}

}
