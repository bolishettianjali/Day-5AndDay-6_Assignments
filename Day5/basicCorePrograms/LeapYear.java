package Day5.basicCorePrograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		System.out.println("Enter an Year :: ");
		Scanner scanner = new Scanner(System.in);
		year = scanner.nextInt();

		int length = String.valueOf(year).length();
		if (length == 4) {
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
				System.out.println("Specified year is a leap year");
			else
				System.out.println("Specified year is not a leap year");
		}
		else {
			System.out.println("Invalid year Input: " + year + ", is of " + length + " digits.");
			System.out.println("The year sepecifed should be of 4 digit.");
		}
	}

}
