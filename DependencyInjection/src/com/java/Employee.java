package com.java;

public class Employee {
	private int id;
	private String name;
	private boolean status;

	public Employee(int id, String name, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}

	public Employee(int id) {
		super();
		this.id = id;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}
	
	public Employee(boolean status) {
		super();
		this.status = status;
	}

	public Employee() {
		super();
		this.id = 1;
		this.name = "A";
	}
	 
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(status);
	}
}
