package com.ltts.DemoSpringCons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Employee e =(Employee)context.getBean("kaykay");//constructor injection
        Employee e1 =(Employee)context.getBean("kayykayy");//setter injection
        System.out.println(e);
        System.out.println(e1);        
    }
}