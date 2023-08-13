package com.digit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxml = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student stu = (Student) cxml.getBean("sH");
		stu.displayS();
	}
}
