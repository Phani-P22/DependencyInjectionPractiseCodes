package com.digit;

import java.util.Iterator;
import java.util.List;

public class Institute {

	int id;
	String statement;
	List names;

	public Institute(int id, String statement, List names) {
		super();
		this.id = id;
		this.statement = statement;
		this.names = names;
	}

	public void display() {
		System.out.println(id + ". " + statement);
		Iterator it = names.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
