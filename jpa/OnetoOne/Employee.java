package com;
import javax.persistence.*;
@Table(name="emp1")
@Entity

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@PrimaryKeyJoinColumn
	private int id;
	private String name;
	
	@OneToOne(targetEntity=Address.class,cascade = CascadeType.ALL)
	private Address adress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}
}
