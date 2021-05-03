package com.r177219068.q3;

public class Hemisphere implements Volume{

	@Override
	public Double Vol(float radius) {
		
		double result = (2*3.14*radius*radius*radius)/3;
		return result;
	}

}
