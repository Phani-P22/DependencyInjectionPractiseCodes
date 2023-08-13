package com.digit;

import java.util.Iterator;
import java.util.List;

public class Institute {

	int id;
	String statement;
	List<InstituteDtLs> names;

	public void setId(int id) {
		this.id = id;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	public void setNames(List<InstituteDtLs> names) {
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
