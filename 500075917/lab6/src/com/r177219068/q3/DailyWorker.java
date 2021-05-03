package com.r177219068.q3;

public class DailyWorker extends Worker {
	DailyWorker(int no, String n, int hours) {
		super (no, n);
		System.out.println("Payment to be recieved = "+comPay(hours));
	}
}
