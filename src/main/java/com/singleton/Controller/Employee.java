package com.singleton.Controller;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	
	
	private String name;
	public Employee() {
		System.out.println("object created");
	}
	
	
	public String getName() {
		return name;
	}
	@Value("Ashok")
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
	

	
	


}
