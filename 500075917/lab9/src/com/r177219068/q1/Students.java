package com.r177219068.q1;

public class Students {
	
	String Name;
    int RollNo;
    Students () {};
    
    public Students(String n, int r)
    {
    	Name = n;
        RollNo = r;
        System.out.println("Name : "+Name+" "+"RollNo : "+RollNo);
    }

    public void print(String x, int y)
    {
        Name = x;
        RollNo = y;
        System.out.println("Name : "+Name+" "+"RollNo : "+RollNo);
    }

}
