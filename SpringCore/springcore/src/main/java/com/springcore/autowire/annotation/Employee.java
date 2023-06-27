package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired          //search bean by type
	@Qualifier("temp1") //Search bean by name
	private Address address;
	
	public Employee() {
		super();
	}
	
	//@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Constructor");
	}

	public Address getAddress() {
		return address;
	}
	
	//@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setting Values");
	}
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	

}
