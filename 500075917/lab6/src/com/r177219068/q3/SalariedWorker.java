package com.r177219068.q3;

public class SalariedWorker extends Worker {
	SalariedWorker (int no, String n) {
		super (no, n);
		System.out.println("Payment to be recieved = "+comPay(40));
		}
}
