package com.digit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxml = new ClassPathXmlApplicationContext("applicationContext.xml");
		Company comp =  (Company) cxml.getBean("comp");
		comp.displayAll();
	}
}
