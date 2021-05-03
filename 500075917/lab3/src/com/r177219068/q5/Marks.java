package com.r177219068.q5;

import java.util.Scanner;

public class Marks {
	
	public static void main(String[] args) {
		int temp;
		int marks[]=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter the marks of student "+(i+1)); 
			marks[i]=sc.nextInt();
		}
			
		for (int k = 0; k < 10; k++)
		{
			for (int j = k + 1; j < 10; j++)
			{
				if (marks[k] > marks[j])
				{
					temp = marks[k];
					marks[k] = marks[j];
					marks[j] = temp;
				}
			}
		}
		
	    System.out.println("Marks  |  Grades   ");

		for (int i = 0; i < 10 ; i++)
		{
		    if(marks[i]>=40 && marks[i]<=50)
			    System.out.println(marks[i] + "  |  Pass");
		    else if(marks[i]>50 && marks[i]<=75) 
			    System.out.println(marks[i] + "  |  Merit"); 
		    else if(marks[i]>75 && marks[i]<=100)
		        System.out.println(marks[i] + "  |  Distinction"); 
		    else if(marks[i]<40) 
			    System.out.println(marks[i] + "  |  Fail");
		    else
		        System.out.println(marks[i] + " is an invalid input");
		}
	}
}
