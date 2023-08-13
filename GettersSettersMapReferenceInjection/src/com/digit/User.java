package com.digit;

public class User {

	int id;
	String name;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println(id);
		System.out.println(name);
	}
}
