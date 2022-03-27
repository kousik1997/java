package com.springdemowithconstructor;

public class Student {
	private String ename;

	public Student(String ename) {
		this.ename = ename;
	}

	public void display() {
		System.out.println("Hello.....I am " + ename);
	}
}
