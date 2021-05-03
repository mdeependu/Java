package com.r177219068.q3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Sphere s = new Sphere();
		Hemisphere h = new Hemisphere();

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius:");
		float radius = input.nextFloat();
		
		Double result1 = s.Vol(radius);
		System.out.println("Volume of sphere is : "+result1);
		
		Double result2 = h.Vol(radius);
		System.out.println("Volume of Hemisphere is : "+result2);
		
		input.close();	
	}

}
