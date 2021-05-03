package com.r177219068.q3;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();  
        list.add("deependu");  
        list.add("mandal");  
        list.add("upes");
        
        HashSet<String> set = new HashSet<String>(list);  
        System.out.println("Initial list of elements:"); 
        System.out.println(set);
        
        if(set.contains("mandal"))
        {
			System.out.println("\nYes Set contain the 'mandal' String");
		}
        else
        {
        	System.out.println("\nNo Set does not contain the 'mandal' String");
        }
		
		if(set.contains("aiml"))
		{
			System.out.println("\nYes Set contains the 'aiml' String");
		}
		else
        {
        	System.out.println("\nNo Set does not contain the 'aiml' String");
        }
		
		HashSet<String> newSet = new HashSet<String>(list);  
		newSet.add("b.tech");
		newSet.add("student");
		newSet.addAll(set);
		System.out.println("\nHashSet content after adding another collection:");
		System.out.println(newSet);
		
		set.clear();  
        System.out.println("\nAfter using clear() method:");
        System.out.println(set);
	}
}
