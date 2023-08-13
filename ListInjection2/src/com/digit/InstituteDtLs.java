package com.digit;

public class InstituteDtLs {

	String name;
	int yearOfEstablishment;
	int turnOver;

	public InstituteDtLs(String name, int yearOfEstablishment, int turnOver) {
		super();
		this.name = name;
		this.yearOfEstablishment = yearOfEstablishment;
		this.turnOver = turnOver;
	}

	public void display() {
		System.out.println(name);
		System.out.println(yearOfEstablishment);
		System.out.println(turnOver);
	}
}
