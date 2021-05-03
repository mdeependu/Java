package com.r177129068.WrapperClass.q2;

public class Wrapper2 {
	
	public static void main(String[] args) {
		
		float value = 3.14f;
		Float f1 = new Float(value);
		String s1 = String.valueOf(f1);
		float f2 = Float.valueOf(s1);
		String s3 = String.valueOf(f2);
		Float f4 = Float.valueOf(s3);
		float f5 = f4.floatValue();
		
		System.out.println("Executed Successfully!");
		System.out.println("Final Answer: "+f5);
		
		
	}

}
