package hw17UseOfNestedIf;

import java.util.Scanner;

public class DiabeticCondition {

	public static void main(String[] args) {
		System.out.println("<-- Please Enter your Hemoglobin A1C value below -->");
		Scanner scanner = new Scanner(System.in);
		double hbA1c = scanner.nextDouble();// nextInt() method -- Reads an int value from the user
		if (hbA1c > 6.4) {
			System.out.println("I am a diabetic patient");
		} else {
			System.out.println("Congratulation! you are not diabetic");

			if (hbA1c >= 5.7) {
				System.out.println("I am a pre-diabetic patient");
			} else {
				System.out.println("I am a healthy person");
			}
		}

	}
}
