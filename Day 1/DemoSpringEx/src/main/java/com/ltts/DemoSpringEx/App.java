package com.ltts.DemoSpringEx;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("web.xml");
        Student s =(Student)context.getBean("kaykay");
        //injecting data to app.java file henceforth using bean.xml file
        //bean.xml contains injection data
        //application context is ioc container
        //.getbean method 
        //ioc maintain, execution and creation of object
        //student is bean id henceforth typecasted to student bean class, kaykay is bean id
        //injecting data to bean id
        System.out.println(s);
    }
}
