package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("config.xml");
        Student st1= (Student) applicationContext.getBean("student1");
        System.out.println(st1.toString());
        
        Student st2= (Student) applicationContext.getBean("student2");
        System.out.println(st2);
        
        Student st3= (Student) applicationContext.getBean("student3");
        System.out.println(st3);
        
        
    }
}
