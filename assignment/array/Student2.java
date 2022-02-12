package com.Ccc;

public class Student2 {
	
	int id;
	String name;
	Student2(int id,String name){
	this.id=id;
	this.name=name;
	System.out.println("your id is:"+id+" your name "+name);

	}
	public static void main(String[] args) {
		Student2 a=new Student2(1,"Kousik");
		Student2 b=new Student2(2,"Mondal");
		
	}

}
