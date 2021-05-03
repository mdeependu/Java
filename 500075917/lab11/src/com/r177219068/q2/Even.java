package com.r177219068.q2;

public class Even extends Thread {
	
	public void run() {
		
		int i;
        for(i=0;i<10;i++) {
        	
            if(i%2==0) {
            	
            	System.out.println(i+" is even");
            }
        }
    }
}
