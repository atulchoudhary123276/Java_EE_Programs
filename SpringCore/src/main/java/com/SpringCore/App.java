package com.SpringCore;

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
//        @SuppressWarnings("resource")
		ApplicationContext context1=new ClassPathXmlApplicationContext("config.xml");
        Student student1= (Student)context1.getBean("student1");
        System.out.println(student1);
}
}
 