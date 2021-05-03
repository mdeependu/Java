package com.r177219068.q1;

import java.util.Scanner;

public class Combination {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[3];
		System.out.println("Enter three numbers between 0 and 9:"); 
		Scanner sc=new Scanner(System.in);
		arr[0]=sc.nextInt();
		arr[1]=sc.nextInt();
		arr[2]=sc.nextInt();
		int i;
		int j;
		int k;
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				for(k=0;k<3;k++)
				{
					if(i!=j && j!=k && k!=i)
						System.out.println(arr[i] + "" + arr[j] + "" + arr[k]);
				}			
			}
		}
	}
}
