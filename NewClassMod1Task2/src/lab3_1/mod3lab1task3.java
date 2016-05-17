package lab3_1;

import java.util.Scanner;

public class mod3lab1task3 {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number 1");
		int number1 = scanner.nextInt();
		System.out.println("Enter number2 ");
		int number2 = scanner.nextInt();
		display(number1, number2);

	}

	public static void display(int number1, int number2) {
		System.out.println("HCD is :" + findHCD(number1, number2));
	}

	private static int findHCD(int number1, int number2) {
		if (number2 == 0) {
			return number1;
		}
		return findHCD(number2, number1 % number2);
	}
}
