package Day5.basicCorePrograms;

import java.util.Scanner;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2, temp;
		
		System.out.println("Enter First Number: ");
		num1 = scanner.nextInt();
		System.out.println("Enter Second Number: ");
		num2 = scanner.nextInt();
		System.out.println("before swapping numbers: " + num1 + "  " + num2);

		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After swapping: " + num1 + "   " + num2);
	}
}
