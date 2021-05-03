package com.r177129068.StringsHandling.q2;

public class UpperCase {

	public static void main(String[] args) {
		
		String str = "deependu";
		System.out.println("Original String:");
		System.out.println(str);
        
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