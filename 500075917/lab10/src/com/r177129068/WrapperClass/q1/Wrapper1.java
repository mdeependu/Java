package com.r177129068.WrapperClass.q1;

public class Wrapper1 {
	
	public static void main(String[] args) {
		
		int value = 68;
		Integer i1 = new Integer(value);
		String s1 = String.valueOf(i1);
		int value1 = Integer.parseInt(s1);
		String s2 = String.valueOf(value1);
		Integer i2 = Integer.parseInt(s2);
		int i3 = i2.intValue();
		
		System.out.println("Executed Successfully!");
		System.out.println("Final Answer: "+i3);

	}


}
