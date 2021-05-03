package com.r177129068.StringsHandling.q4;

public class Name {
	
	String name;
	Name(String n)
	{
		name = n; 	
	}
	
	public void disp() {
		
		System.out.println("Name :"+name);
		int count = 0;
		int len = name.length();
		int i;
		for(i=0;i<len;i++)
		{
			if(name.charAt(i)=='A'||name.charAt(i)=='a')
				{
					count++;
					System.out.println("Occurance: "+count);
					System.out.println("Position: "+(i+1));
				}
		}
		
		if(count==0)
		{
		System.out.println("There is no 'A' in the string");
		}
	}
}
