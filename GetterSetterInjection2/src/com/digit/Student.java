package com.digit;

public class Student {

	private int sid;
	private String name;
	private Parents parents;

	public void setSid(int sid) {
		this.sid = sid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setParents(Parents parents) {
		this.parents = parents;
	}

	public void display() {
		System.out.println(sid);
		System.out.println(name);
		parents.display();
	}
}
