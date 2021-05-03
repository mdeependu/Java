package com.r177219068.q5;
import java.util.Scanner;

public class DriverCode {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the Department: ");
			
			Manager employee = new Manager("Deependu Mandal", 75917, 110000);
			employee.department = input.next();
			
			System.out.println("Percentage of Increment: ");
			EmployeeOfOrg.percentage = input.nextFloat();
			
			input.close();

			System.out.println("Name: "+employee.printName());
			System.out.println("Employee ID: "+employee.printId());
			System.out.println("Salary before Increment: "+employee.printSalary());
			System.out.println("Department: "+employee.department);
			employee.increaseSalary();
			System.out.println("Salary after Increment: "+employee.printSalary());
	}
}
