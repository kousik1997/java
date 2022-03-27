package com.entity;
import javax.persistence.*;

@Table(name="PayrollEmp")
@Entity
@AttributeOverrides({
	@AttributeOverride(name="emp_id", column = @Column(name="emp_id")),
	@AttributeOverride(name="emp_name", column = @Column(name="emp_name")),
	@AttributeOverride(name="dept", column = @Column(name="dept"))
})
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
