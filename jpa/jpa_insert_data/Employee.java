package com.jpaa.jpaaa;

import javax.persistence.*;
@Table(name="emp")
@Entity
public class Employee {
@Id
@Column(name="id")
private int id;
@Column(name="firstName", length=20)
private String firstName;

@Column(name="lastName")
private String lasttName;

@Column(name="phone", length=20)
private long phone;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLasttName() {
	return lasttName;
}

public void setLasttName(String lasttName) {
	this.lasttName = lasttName;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}


}
