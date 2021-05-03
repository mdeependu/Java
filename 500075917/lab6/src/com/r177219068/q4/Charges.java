package com.r177219068.q4;
import java.util.Scanner;

public class Charges extends Calls {
	
	float charge;
	Scanner input = new Scanner(System.in) ;
	
	float calculate() {
	System.out.print("Enter the Type of Call: ");
	type = input.next() ;
	
	rate();
	
	System.out.print("Enter the Duration of Call (in minutes) : ");
	duration = input.nextFloat() ;
	
	return rate*duration;
	}

}
