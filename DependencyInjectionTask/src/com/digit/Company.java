package com.digit;

import java.util.Iterator;
import java.util.List;

public class Company {

	private String name;
	private int yearOfEstablishment;
	private List<Employee> companyEmployees;

	public Company(String name, int yearOfEstablishment, List<Employee> companyEmployees) {
		super();
		this.name = name;
		this.yearOfEstablishment = yearOfEstablishment;
		this.companyEmployees = companyEmployees;
	}

	public void displayAll() {
		System.out.println(name);
		System.out.println(yearOfEstablishment);
		Iterator<Employee> it = companyEmployees.iterator();
		while (it.hasNext()) {
			it.next().displayEmployeeDetails();
		}
	}
}
