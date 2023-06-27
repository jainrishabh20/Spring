package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


// 2. Implementing Bean lifeCycle using Interfaces InitializingBean & DisposableBean


public class Pepsi implements InitializingBean, DisposableBean{
	private double price;

	public Pepsi() {
		super();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//inti method
		System.out.println("Taking Pepsi: init");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//Destroy method
		System.out.println("Going to put bottle backc to shop: destroy");
	}
	
}
