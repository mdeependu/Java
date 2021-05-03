package com.r177219068.q3;

public class Worker {
	String name;
	int empno;
	Worker (int no, String n) {
	empno = no;
	name = n;
	show();
	}

	void show() {
	System.out.println("Employee number : "+empno);
	System.out.println("Employee name : "+name);
	}

	static int rate;
	
	int comPay (int hours) {
		int payment = rate*hours;
		return payment;
	}

}
