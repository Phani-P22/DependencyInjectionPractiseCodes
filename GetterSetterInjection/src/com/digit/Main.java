package com.digit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext cxml = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = (Employee) cxml.getBean("bean1");

		emp.getData();
	}
}
