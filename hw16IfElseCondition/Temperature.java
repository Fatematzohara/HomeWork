package hw16IfElseCondition;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		System.out.println("Today's weather");
		Scanner scanner = new Scanner(System.in);
		int todaysTemperature = scanner.nextInt();// nextInt() method -- Reads an int value from the user
		if (todaysTemperature < 32) {
			System.out.println("Freezing");
		} else if (todaysTemperature < 55) {
			System.out.println("Pleasant");
		} else if (todaysTemperature < 73) {
			System.out.println("Getting Warmer");
		} else if (todaysTemperature > 101) {
			System.out.println("Very Hot");
		} else {
			System.out.println("Please put a valid temperature");
		}

		scanner.close();
	}
}
