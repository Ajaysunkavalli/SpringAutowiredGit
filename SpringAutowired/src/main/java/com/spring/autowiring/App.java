package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.autowired.Customer;

public class App {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		Customer cust=(Customer) context.getBean("customer");
		System.out.println("Added Sysout");
		System.out.println(cust);
		
	}

}
