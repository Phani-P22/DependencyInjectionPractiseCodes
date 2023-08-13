package com.digit;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	int qid;
	String question;
	Map<String, String> answers;

	public Question(int qid, String question, Map<String, String> answers) {
		super();
		this.qid = qid;
		this.question = question;
		this.answers = answers;
	}

	public void display() {
		System.out.println("QID: " + qid);
		System.out.println("Qn: " + question);
		Set<Entry<String, String>> es = answers.entrySet();
		Iterator<Entry<String, String>> it = es.iterator();
		while (it.hasNext()) {
			Entry<String, String> entry = it.next();
			System.out.println(entry.getKey() + "_________________________________" + entry.getValue());
		}
	}
}
