package com.digit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		list.add("A");
//		list.add("B");
//		list.add("C");
//		Institute i = new Institute(1, "This is statement", list)
		
		ClassPathXmlApplicationContext cxml = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Institute i = (Institute) cxml.getBean("inst");
		i.display();
	}
}
