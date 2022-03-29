package com.entiyy;

import java.util.Iterator;
import java.util.List;

public class question {
	private int qno;
	private String qname;
	private List<String> ansewer;

	public question(int qno, String qname, List<String> ansewer) {
		this.qno = qno;
		this.qname = qname;
		this.ansewer = ansewer;

	}

	public void show() {
		System.out.println(qno + " " + qname);
		System.out.println("-------------");
		Iterator<String> itr = ansewer.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
