package com;

//import java.security.KeyStore.Entry;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class question {
	private int qid;
	private String qname;
	private Map<String, String> answer;

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public Map<String, String> getAnswer() {
		return answer;
	}

	public void setAnswer(Map<String, String> answer) {
		this.answer = answer;
	}

	public void displayInfo() {
		System.out.println("Id " + qid + " " + "Question " + qname);
		System.out.println("Answers ");
		Set<Entry<String, String>> set = answer.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<String, String> entry = itr.next();
			System.out.println("Answer : " + entry.getKey() + "Answer by :" + entry.getValue());
		}

	}

}
