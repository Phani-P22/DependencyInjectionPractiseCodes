package com.digit;

public class Employee {
	private int id;
	private String name;
	private boolean status;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void getData() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(status);
	}
}
