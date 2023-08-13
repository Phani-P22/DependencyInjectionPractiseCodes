package com.digit;

public class Employee {
	private String name;
	private int yearsOfExperience;
	private String role;

	public Employee(String name, int yearsOfExperience, String role) {
		super();
		this.name = name;
		this.yearsOfExperience = yearsOfExperience;
		this.role = role;
	}

	public void displayEmployeeDetails() {
		System.out.println("--Employee Details--");
		System.out.println(name);
		System.out.println(yearsOfExperience);
		System.out.println(role);
	}
}
