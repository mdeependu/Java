package com.r177219068.q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist {
	
	public static void main(String args[]){  
		
		  ArrayList<String> list = new ArrayList<String>(); 
		  list.add("deependu");
		  list.add("mandal");  
		  list.add("max");  
		  list.add("parker");  
		  
		  Iterator<String> itr1 = list.iterator();
		  System.out.println("Elements in the ArrayList are:");		  
		  while(itr1.hasNext())
		  {    
			  System.out.println(itr1.next());  
		  }

		  ArrayList<String> ArraylistClone = (ArrayList<String>)list.clone();
		  System.out.println("\nDuplicate oblect of ArrayList instance:");
		  System.out.println(ArraylistClone);
	        
		 Collections.reverse(list);
		 System.out.print("\nElements after reversing:\n");
		 Iterator<String> itr2=list.iterator();
		 while(itr2.hasNext())
		 {		 
			 System.out.println(itr2.next()); 
		 }
	}  
}
