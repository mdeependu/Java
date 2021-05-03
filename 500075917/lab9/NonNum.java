import java.util.Scanner;
import java.util.InputMismatchException;

public class NonNum {

	public static void main(String[] args) {
		int add;
		int sub;
		int Mult;
		float div;
		
		Scanner input = new Scanner(System.in);
		
		
		try {
			System.out.println("Enter Number 1:");
			int i = input.nextInt();
			System.out.println("Enter Number 2:");
			int j = input.nextInt();
			add = i+j;
			sub = i-j;
			Mult = i*j;
			div = i/j;
		}
		catch(InputMismatchException e) {
			System.out.println("Exception Caught");
			e.printStackTrace();
		}
	}

}
