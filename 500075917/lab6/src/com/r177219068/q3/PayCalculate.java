package com.r177219068.q3;
import java.util.Scanner;

public class PayCalculate {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rate for Workers: ");
		Worker.rate = sc.nextInt();
		sc . close();
		
		new SalariedWorker (75917, "Deependu");
		new DailyWorker (17721, "Mandal", 36);
	}

}
