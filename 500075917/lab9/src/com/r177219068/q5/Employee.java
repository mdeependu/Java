package com.r177219068.q5;

import java.util.Scanner;

public class Employee {
	String name;
	int age;
	

	public static void main(String[] args) throws NonStringExp,Age {
		
		Employee e1 = new Employee();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the name of an Empoyee");
		String temp=input.nextLine();

		Scanner string = new Scanner(temp);
		int i =0;
		while (string.hasNext()) {	
			
			boolean in=string.hasNextInt();
	         
			if(in) {
				throw new NonStringExp("Not a string input");			
				
			}
			else if(i == temp.length()-1) {
				System.out.println();
				e1.name= temp;
		    	break;
		    }
			
			i=i+1;
		}
				
		System.out.println("Enter the age of an Empoyee");

		e1.age=input.nextInt();
		if(e1.age>50) {
			throw new Age("Age greater than 50 not allowed");
		}
		
		
		System.out.println("Name of employee : "+e1.name+"\nAge : "+e1.age);
	}
}