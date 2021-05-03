package com.r177219068.q4;

public class Calculator implements Math {
	
	int div;
	int mod;
	
	public void division (int num1, int num2)
	{
		div = num1/num2;
	}
	
	public void modulus (int num1, int num2)
	{
		mod = num1%num2;
	}
	
	public void print()
	{
		System.out.println("Division = "+div);
		System.out.println("Modulus = "+mod);
	}

}
