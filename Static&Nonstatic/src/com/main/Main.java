package com.main;

import com.companyinfo.*;
import com.employeinfo.*;

public class Main {
	public static void main(String[] args) {
		System.out.println(Company.displayInfo());

		Employee emp = new Employee("Tom", "12th passed ", "Borivali", 120365);
		Employee emp1 = new Employee("Harry","Graduated","Kandivali",236598);
		// System.out.println(emp);
		System.out.println(emp.showInfo());
		System.out.println(emp1.showInfo());
	}
}
