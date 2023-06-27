package com.springcore;

//POJO Class-> bean
public class Student {
	private int sid;
	private String sname;
	private String saddress;
	
	public Student() {
		super();
	}
	public Student(int sid, String sname, String saddress) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddress = saddress;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		System.out.println("setting the student id");
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		System.out.println("setting the studentName");
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		System.out.println("setting the student student Address");
		this.saddress = saddress;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + "]";
	}
	

}
