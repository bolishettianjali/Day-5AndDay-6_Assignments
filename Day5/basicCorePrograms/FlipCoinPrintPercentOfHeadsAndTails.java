package Day5.basicCorePrograms;

import java.util.Scanner;

public class FlipCoinPrintPercentOfHeadsAndTails {

	static int heads;
	static int tails;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number, for how many times to flip a coin: ");

		int noOfFlips = scanner.nextInt();

		if (noOfFlips > 0) {

			for (int i = 1; i <= noOfFlips; i++) {

				int flipCoin = (int) Math.floor(Math.random() * 10) % 2;
				if (flipCoin == 0) {
					heads++;
				} else if (flipCoin == 1) {
					tails++;
				}

			}

		} else
			System.out.println("The Number should be greater than 0 or should be postive.");

		if (heads > tails) {
			System.out.println("Heads arrived: " + heads);
			System.out.println("Tails arrived: " + tails);
			System.out.println("Heads arrived: " + (heads - tails) + " times more than tails.");
		} else if (heads < tails) {
			System.out.println("Heads arrived: " + heads);
			System.out.println("Tails arrived: " + tails);
			System.out.println("Tails arrived: " + (tails - heads) + " times more than Heads.");
		} else {
			System.out.println("Heads arrived: " + heads);
			System.out.println("Tails arrived: " + tails);
			System.out.println("Heads and Tails arrived equal times.");
		}

	}
}
