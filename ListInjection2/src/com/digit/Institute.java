package com.digit;

import java.util.Iterator;
import java.util.List;

public class Institute {

	int id;
	String statement;
	List<InstituteDtLs> names;

	public Institute(int id, String statement, List<InstituteDtLs> names) {
		super();
		this.id = id;
		this.statement = statement;
		this.names = names;
	}

	public void display() {
		System.out.println(id + ". " + statement);
		Iterator<InstituteDtLs> it = names.iterator();
		while (it.hasNext()) {
			InstituteDtLs curI = it.next();
			curI.display();
			System.out.println("==========");
		}
	}
}
