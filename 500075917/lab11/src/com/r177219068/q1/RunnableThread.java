package com.r177219068.q1;

public class RunnableThread implements Runnable {
	
	public void run() {
		
        System.out.println("Runnable is running");
    }
	
    public static void main(String[] args) {
        
    	RunnableThread t = new RunnableThread();
    	
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        
        t1.start();
        t2.start();
    }
}
