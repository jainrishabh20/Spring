package com.springcore.constructorInj;

import java.util.List;

public class Person {
	private String pname;
	private int pid;
	private Certi certi;
	
	
	public Person(String pname, int pid, Certi certi) {
		super();
		this.pname = pname;
		this.pid = pid;
		this.certi=certi;
		//this.list=list;
	}


	@Override
	public String toString() {
		return "Person [pname=" + pname + ", pid=" + pid + ", certi=" + certi + "]";
	}

	


	
	
	
	
	

}
