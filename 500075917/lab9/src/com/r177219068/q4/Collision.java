package com.r177219068.q4;

import java.util.Scanner;

public class Collision{
	String car1;
	String car2;
	
	void crashcheck(String car1,String car2) throws Direction {
		
		if(car1.equals(car2)) 
		{
			System.out.println("Cars moving in same direction NO PROBLEM");
	    }
		else
		{
			throw new Direction("Cars are moving in opposite direction");
	    }

	}

	public static void main(String[] args) {
		
		Collision obj = new Collision();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter direction of car 1:");
		obj.car1=input.nextLine();
		
		System.out.println("Enter direction of car 2:");
		obj.car2=input.nextLine();
		
		try {
			
			obj.crashcheck(obj.car1,obj.car2);
		}
		
		catch (Direction e) {
			
			System.out.println("CARS CRASHED");
		}
	}
}
