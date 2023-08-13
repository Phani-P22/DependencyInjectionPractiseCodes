package com.digit;

public class Parent {

	private String fname;
	private String mname;
	private int fage;
	private int mage;

	public Parent(String fname, String mname, int fage, int mage) {
		super();
		this.fname = fname;
		this.mname = mname;
		this.fage = fage;
		this.mage = mage;
	}
	
	public void displayP() {
		System.out.println(fname);
		System.out.println(mname);
		System.out.println(fage);
		System.out.println(mage);
	}
}
