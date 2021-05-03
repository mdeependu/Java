package com.r177219068.q5;

public class EmployeeOfOrg {

	String name;
	int empid;
	float salary;

	EmployeeOfOrg(String n, int id, float sal) {
		name = n;
		empid = id;
		salary = sal;
	}

	String printName() {
		return name;
	}
	
	float printId() {
		return empid;
		}
	
	float printSalary() {
		return salary;
	}
	
	static float percentage;
	void increaseSalary() {
		salary = salary+(percentage/100)*salary;
	}

}
