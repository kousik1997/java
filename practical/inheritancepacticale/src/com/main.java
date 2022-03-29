package com;

public class main {
	public static void main(String[] args) {
		
	
	Manager m=new Manager(1, "peter", "chennai India", 237844, 65000);
	Trainee t=new Trainee(2, "jack", "maumabi India", 442085, 45000);
	
	m.calculateSalary();
	t.calculateSalary();
	
	m.calculateTransportAllowance();
	t.calculateTransportAllowance();
	
	}
}
