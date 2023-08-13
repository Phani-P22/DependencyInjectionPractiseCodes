package com.digit;

public class Student {

	private int sid;
	private String sname;
	private Parent p;

	public Student(int sid, String sname, Parent p) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.p = p;
	}

	public void displayS() {
		System.out.println(sid);
		System.out.println(sname);
		p.displayP();
	}
}
