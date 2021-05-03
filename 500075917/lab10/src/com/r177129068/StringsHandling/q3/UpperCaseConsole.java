package com.r177129068.StringsHandling.q3;

import java.util.Scanner;


public class UpperCaseConsole {

	public static void main(String[] args) {
		
		String str;
		Scanner input = new Scanner(System.in);
        System.out.println("Enter String: ");
        str = input.nextLine();
        
        StringBuffer strbuf = new StringBuffer();
        char c;
       
        for(int i=0;i<str.length();i++)
        {
            if(Character.isAlphabetic(str.charAt(i)))
            {
                if(str.charAt(i) >= 65 && str.charAt(i) <=90)
                    strbuf.append(str.charAt(i));
                else
                {
                    c = (char)(str.charAt(i)-32);
                    strbuf.append(c);
                }
            }
            else
                strbuf.append(str.charAt(i));
              
        }
        System.out.println("String in Upper Case:");
        System.out.println(strbuf.toString());
	}
}