package com.java.io;

public final class ImmutableDemo {
	private String name;
	ImmutableDemo (String name) {
	this.name = name;
	}
	public String getName() {
	return name;
	}


public static void main(String[] args) {
ImmutableDemo obj = new ImmutableDemo("hello");
System.out.println(obj.getName());
//obj.setName("new hello");
System.out.println(obj.getName());
}
}
