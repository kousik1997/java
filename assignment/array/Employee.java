package com.Ccc;

public class Employee {
int id,salary;
String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static void main(String[] args) {
	Employee E= new Employee();
	E.setName("Koushik Mondal");
	E.setId(101);
	E.setSalary(25000);
	System.out.println("ID :"+E.getId());
	System.out.println("Name :"+E.getName());
	
	System.out.println("Salary :"+E.getSalary());
}
}

