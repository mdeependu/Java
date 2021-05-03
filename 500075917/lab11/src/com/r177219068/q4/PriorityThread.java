package com.r177219068.q4;

public class PriorityThread {
	
	@SuppressWarnings("static-access")
	public static void main(String args[]) throws InterruptedException { 
		 
		Thread T1=new Thread();
		Thread T2=new Thread(); 
		Thread T3=new Thread();
		Thread T4=new Thread();
		Thread T5=new Thread(); 
		 
		T1.setPriority(6);
		T2.setPriority(1); 
		T3.setPriority(9);
		T4.setPriority(10);
		T5.setPriority(4);
		
		T1.sleep(100); 
		 
		if (T1.isAlive()) {
		    
			System.out.println("Thread 1 is alive"); 
		}		
		else {
			
		    System.out.println("Thread 1 is not alive"); 
		}
		
		T2.start(); 
		 
		if (T2.isAlive()) {
			
		    System.out.println("Thread 2 is alive"); 
		}
		else { 
			
		    System.out.println("Thread 2 is not alive"); 
		}
		
		T3.start(); 
		 
		if (T3.isAlive()) {
			
		    System.out.println("Thread 3 is alive"); 
		}
		else {
		    
			System.out.println("Thread 3 is not alive"); 
		}
		
		T4.start(); 
		 
		if (T4.isAlive()) {
		    
			System.out.println("Thread 4 is alive"); 
		}
		else {
		    
			System.out.println("Thread 4 is not alive"); 
		}
		
		T5.sleep(50); 
		 
		if (T5.isAlive()) {
			
		    System.out.println("Thread 5 is alive"); 
		}
		else {
		    
			System.out.println("Thread 5 is not alive");
		} 
	}
}
