package com.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainapp {
	//private static ApplicationContext context;

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	    helloworld obj=(helloworld)context.getBean("helloworld");
	    obj.getMessage();		
		
	}

}
