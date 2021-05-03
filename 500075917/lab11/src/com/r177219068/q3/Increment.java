package com.r177219068.q3;

public class Increment extends Thread {
	
	static int count;

	public synchronized void increment() {
		
		count = count+1;
		System.out.println("Count is :"+count+"\tThread running is "+Thread.currentThread().getName());
	}

	public void run () {
	
		increment();
	}

}
