package com.r177219068.q1;

public class ExtendedThread extends Thread{

	public void run() {
		
        System.out.println("Thread is running");
        
	}
	
     public static void main(String[] args) {
    	 ExtendedThread t1 = new ExtendedThread();
    	 ExtendedThread t2 = new ExtendedThread();
         
         t1.start();
         t2.start();
    }
}
