package com;

public class Trainee extends Employee{

	 public Trainee(int id, String name, String address, long phone,double salarye){
	    	super(id, name, address, phone);
			this.emp_id=id;
			this.emp_name=name;
			this.emp_address=address;
			this.emp_phone=phone;
			this.basic_salaray=salarye;
			

}
	 public void calculateTransportAllowance() {
			double y=10 *basic_salaray /100;
			System.out.println("TransportAllowance"+y);
	 }
}
