package com.java.io;

public class mutable {
	private String a;

	public mutable(String a) {
		this.a=a;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public static void main(String[] args) {
		mutable b=new mutable("Kousik");
		System.out.println(b.getA());
		b.setA("Mondal");
		System.out.println(b.getA());

	}

}
