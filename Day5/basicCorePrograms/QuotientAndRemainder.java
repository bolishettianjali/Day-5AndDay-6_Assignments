package Day5.basicCorePrograms;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Dividend: ");
		int dividend = scanner.nextInt(); 
		System.out.println("Enter Divisor: ");
		int divisor = scanner.nextInt();

		int quotient = dividend / divisor;
		int remainder = dividend % divisor;

		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);
	}

}
