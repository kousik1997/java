package com.entity;
import javax.persistence.*;

@DiscriminatorValue("Contract")
@Entity
public class ContractEmp extends Employee{
	private float salary_perhour;
	private String contract_period;
	public float getSalary_perhour() {
		return salary_perhour;
	}
	public void setSalary_perhour(float salary_perhour) {
		this.salary_perhour = salary_perhour;
	}
	public String getContract_period() {
		return contract_period;
	}
	public void setContract_period(String contract_period) {
		this.contract_period = contract_period;
	}
}
