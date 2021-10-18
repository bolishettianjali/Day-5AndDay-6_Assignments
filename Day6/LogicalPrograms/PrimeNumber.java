package Day6.LogicalPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String args[]) {
		int m = 0, flag = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter any integer you want to check: ");
		
		int num = scanner.nextInt();
		m = num / 2;
		
		if (num == 0 || num == 1) {
			System.out.println(num + " is not prime number");
		} else {
			
			for (int i = 2; i <= m; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not prime number");
					flag = 1;
					break;
				}
			}
			
			if (flag == 0) {
				System.out.println(num + " is prime number");
			}
		}
	}
}
