package com.r177219068.q2;

import java.util.Scanner;

public class Square {
	
	public static void main(String [] args) {
		// TODO Auto-generated method stub

		int i;
		int arr[]=new int[10];
		System.out.println("Enter 10 Numbers:");
		Scanner sc=new Scanner(System.in);
		
		for (i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
			
		for (i=0;i<10;i++)
		{
		System.out.println((arr[i])*(arr[i]));
		}
			
	}
}
