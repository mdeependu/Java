package com.r177219068.q5;

public class Manager extends EmployeeOfOrg {
	String department;
	
	Manager(String n, int id, float sal) {
		super(n, id, sal);
		printName();
		printId();
		printSalary();
		increaseSalary();
	}

}
