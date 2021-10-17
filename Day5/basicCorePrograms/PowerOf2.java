package Day5.basicCorePrograms;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number upto 30: ");

		int num = scanner.nextInt();

		int power = 1;

		if (0 <= num && num < 31) {

			for (int i = 1; i <= num; i++) {

				power = power * 2;

				System.out.println("2^" + i + " = " + power);

			}
		} else {
			System.out.println("Enter numner in range of 0 to 30");
		}
	}
}
