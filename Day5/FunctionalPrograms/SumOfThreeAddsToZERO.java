package Day5.FunctionalPrograms;

import java.util.Scanner;

public class SumOfThreeAddsToZERO {

	static void findTriplets(int[] arr, int n) {
		boolean found = false;
		int count = 0;
		
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.print(" ");
						System.out.print(arr[i]);
						System.out.print(" ");
						System.out.print(arr[j]);
						System.out.print(" ");
						System.out.print(arr[k]);
						System.out.print("\n");
						found = true;
						count++;
					}
				}
			}
		}

		if (found == false)
			System.out.println(" not exist ");
		else {
			System.out.println("Number of Tripplets were: " + count);
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter How many numbers to Add: ");
		
		int length = scanner.nextInt();
		
		int arr[] = new int[length];
		
		for(int i = 0; i < length; i++) {// 0, -1, 2, -3, 1
			System.out.println("Enter number " + (i+1) + ": ");
			arr[i] = scanner.nextInt();
		}
		
		int n = arr.length;
		findTriplets(arr, n);

	}
}
