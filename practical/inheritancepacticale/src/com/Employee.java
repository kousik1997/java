package com;

public class Employee {
		int emp_id;
		String emp_name;
		String emp_address;
		long emp_phone;
		double basic_salaray;
		double special_allowance=250.80;
		double hra=1000.50;
		double salaray;

public Employee(int emp_id,String emp_name,String emp_address,long emp_phone) {
	          this.emp_id=emp_id;
	          this.emp_name=emp_name;
	          this.emp_address=emp_address;
	          this.emp_phone=emp_phone;
}
public void calculateSalary() {
	
	System.out.println("Selarye is "+(salaray=basic_salaray + (basic_salaray * special_allowance/100)+( basic_salaray * hra/100)));
	
}

public void calculateTransportAllowance() {
	double y= 10* salaray / 100;
	System.out.println("TransportAllowance "+y);
	
}

}
