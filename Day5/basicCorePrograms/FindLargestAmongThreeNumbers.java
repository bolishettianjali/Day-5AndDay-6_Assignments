package Day5.basicCorePrograms;

import java.util.Scanner;

public class FindLargestAmongThreeNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter value a: ");
		int a = scanner.nextInt();
		System.out.print("Enter value b: ");
		int b = scanner.nextInt();
		System.out.print("Enter value c: ");
		int c = scanner.nextInt();
		
		if (a >= b && a >= c)
			System.out.println(a + " is the largest Number");
		else if (b >= a && b >= c)
			System.out.println(b + " is the largest Number");
		else
			System.out.println(c + " is the largest number");
	}

}
