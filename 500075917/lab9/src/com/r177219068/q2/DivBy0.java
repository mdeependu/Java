package com.r177219068.q2;

public class DivBy0 {
	
	public static void main(String[] arg) {
		int numerator = 10;
		int denominator = 0;
		int result=0; 
		
		try 
		{	
			result=numerator/denominator;	
		}
	
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		System.out.println("Result: "+result);
	}

}
