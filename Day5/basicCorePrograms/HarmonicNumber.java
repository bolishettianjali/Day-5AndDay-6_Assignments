package Day5.basicCorePrograms;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number: ");

		int number = scanner.nextInt();
		double harmonicNum = 0.0;

		if (number != 0) {
			for (double i = 1; i <= number; i++) {

				harmonicNum = harmonicNum + 1/i;

			}

		}
		else {
			System.out.println("Enterd number must be greater than 0");
		}
		
		System.out.println(harmonicNum);

	}

}
