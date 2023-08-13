package com.digit;

public class InstituteDtLs {

	String name;
	int yearOfEstablishment;
	int turnOver;

	public void setName(String name) {
		this.name = name;
	}

	public void setYearOfEstablishment(int yearOfEstablishment) {
		this.yearOfEstablishment = yearOfEstablishment;
	}

	public void setTurnOver(int turnOver) {
		this.turnOver = turnOver;
	}

	public void display() {
		System.out.println(name);
		System.out.println(yearOfEstablishment);
		System.out.println(turnOver);
	}
}
