package com.digit;

public class User {

	int id;
	String name;

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
	}
}
