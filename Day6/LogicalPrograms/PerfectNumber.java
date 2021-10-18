package Day6.LogicalPrograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int num, sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter any integer you want to check:");
		num = scanner.nextInt();
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == num) {
			System.out.println(num+" is a perfect number.");
		} else {
			System.out.println(num+" is not a perfect number.");
		}
	}
}
