package com.digit;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	int qid;
	String question;
	Map<User, Answers> answers;

	public void setQid(int qid) {
		this.qid = qid;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public void setAnswers(Map<User, Answers> answers) {
		this.answers = answers;
	}

	public void display() {
		System.out.println("QID: " + qid);
		System.out.println("Qn: " + question);
		Set<Entry<User, Answers>> es = answers.entrySet();
		Iterator<Entry<User, Answers>> it = es.iterator();
		while (it.hasNext()) {
			Entry<User, Answers> entry = it.next();
			User curU = entry.getKey();
			Answers curA = entry.getValue();
			curU.display();
			curA.display();
			System.out.println("============");
		}
	}
}
