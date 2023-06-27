package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private Address address;
	
	public Employee() {
		super();
	}
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Constructor");
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address1) {
		this.address = address1;
	}
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	

}
