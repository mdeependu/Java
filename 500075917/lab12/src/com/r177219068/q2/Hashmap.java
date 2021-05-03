package com.r177219068.q2;

import java.util.HashMap;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
        hashmap.put(10, "deependu"); 
        hashmap.put(20, "mandal"); 
        hashmap.put(30, "hello"); 
        hashmap.put(40, "upes"); 
        hashmap.put(50, "aiml"); 
  
        System.out.println("All key-value pair as Entry objects:");
        System.out.println(hashmap);

        System.out.println("\nDoes key '20' exist?"); 
        System.out.println(hashmap.containsKey(20));
        
        System.out.println("\nDoes value 'hi' exist?");
        System.out.println(hashmap.containsValue("hi"));
        
        Set<Integer> keys = hashmap.keySet();
        System.out.println("\nkeys are:"); 
        for(Integer key: keys)
        {        	
            System.out.println(key);
        }        
	}
}
