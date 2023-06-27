package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String ename;
	private List<String> phones;
	private Set<String> address;
	private Map<String, String> courses;
	private List<Integer> sub;
	
	private Properties properties;
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	public List<Integer> getSub() {
		return sub;
	}
	public void setSub(List<Integer> sub) {
		this.sub = sub;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", phones=" + phones + ", address=" + address + ", courses=" + courses
				+ ", sub=" + sub + ", properties=" + properties + "]";
	}
	
	
	
	
	

}
