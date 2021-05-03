package com.r177219068.q4;

public class Calls {
	static String type;
	float duration;
	float rate;
	
	void rate() {
	// Taking rate for Ordinary = 2.5
	// Taking rate for Urgent = 5.8
	// Taking rate for Lightning = 10.75
	
		if (type.matches("ordinary")) 
		{
			rate = 2.5f;
		}
		else if(type.matches("urgent"))
		{
			rate = 5.8f;
		}
		else if(type.matches ("lightning")) 
		{
			rate = 10.75f;
		}
		else
		{
			System.out.println("INVALID") ;
			System.exit(1) ;
		}
	}
}
