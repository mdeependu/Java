package com.r177219068.q4;

public class DivBy5 {
	
	public static void main(String [] args) 
    {
         int sum,n;
         sum=0;
         n=41;

         while(n<250)
         {
        	 if (n%5==0)
        	 {
                 sum=sum+n;
             }
             n++;
        }
    System.out.println("Sum of all integers divisible by 5 greater than 40 and less than 250 is: " + sum);

    }
}
