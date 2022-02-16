package com.employeinfo;

public class Employee {

	String name;
	String qualification;
	int number;
	String address;
	String class12th = "pass";

	public Employee(String name, String qualification, int number, String address, String class12th) {
		super();
		this.name = name;
		this.qualification = qualification;
		this.number = number;
		this.address = address;
		this.class12th = class12th;
	}

	public Employee(String name, String qualification, String address, int number) {
		super();
		this.name = name;
		this.qualification = qualification;
		this.number = number;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", qualification=" + qualification + ", number=" + number + ", address="
				+ address + "]";
	}

	public String showInfo() {
		return "\nCANDIDATE INFO" + "\nMy name is: " + name + "\nMy Qualifications are: " + qualification
				+ "\nMy number is: " + number + "\nMy Address: " + address;
	}

}
