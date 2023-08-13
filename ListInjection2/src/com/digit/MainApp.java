package com.digit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxml = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Institute i = (Institute) cxml.getBean("inst");
		i.display();
	}
}
