package com.entity;
import javax.persistence.*;

@Table(name="ContractEmp")
@Entity
@AttributeOverrides({
	@AttributeOverride(name="emp_id", column = @Column(name="emp_id")),
	@AttributeOverride(name="emp_name", column = @Column(name="emp_name")),
	@AttributeOverride(name="dept", column = @Column(name="dept"))
})
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
