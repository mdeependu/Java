package com.r177129068.StringsHandling.q1;

import java.util.Scanner;

public class FirstOccurance {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		String str1;
		String str2;
		
		System.out.println("Enter the String:");
		str1 = input.next();
		System.out.println("Enter string to search:");
		str2 = input.next();
		int i;
		for(i=0;i<str2.length();i++) {
			if((str1.substring(i,i+str2.length()).equals(str2))){
				int end = i+str2.length()-1;
				System.out.println("The substring starts from index postion "+i+" ends at index position "+end+"\n");				
				break;
				
			}
		}
		
		for(i=str1.length();i>=0;i--) {
			if((str1.substring(i-str2.length(),i).equals(str2))){
				int start=i-str2.length();
				System.out.println("The substring starts from index postion "+start+" ends at index position "+(i-1));
				break;
			}
		}
		
	}		
}
