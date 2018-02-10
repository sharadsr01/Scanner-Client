package com.stormwind.clientscanner;

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
    	ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
    	//runner is the main class to initiate execution
    	Runner r=(Runner)context.getBean("runner");
    	r.execute();
    }
}
