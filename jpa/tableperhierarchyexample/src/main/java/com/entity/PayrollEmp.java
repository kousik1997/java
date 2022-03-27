package com.entity;


import javax.persistence.*;

@Entity
@DiscriminatorValue("payroll")
public class PayrollEmp extends Employee{
	private double fixed_salary;
	private int increment;
	public double getFixed_salary() {
		return fixed_salary;
	}
	public void setFixed_salary(double d) {
		this.fixed_salary = d;
	}
	public int getIncrement() {
		return increment;
	}
	public void setIncrement(int increment) {
		this.increment = increment;
	}
}
