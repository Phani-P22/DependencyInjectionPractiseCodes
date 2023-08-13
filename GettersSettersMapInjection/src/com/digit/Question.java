package com.digit;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	int qid;
	String question;
	Map<String, String> answers;

	public void setQid(int qid) {
		this.qid = qid;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public void setAnswers(Map<String, String> answers) {
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
