package syntax.HomeWork;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask if user has a credit card or not. If you
		 * user does not have a credit card then offer them. If they do have one ask
		 * what is balance on the card? If balance of the card is larger than 1000, tell
		 * them to pay off immediately, otherwise you can tell them that they can spend
		 * more.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Hello! do you have a credit card?");
		boolean answer = scanner.nextBoolean();

		if (answer == false) {
			System.out.println("I would like to offer you one");
			System.out.println("what is your income?");
			double income = scanner.nextDouble();
			if (income > 1000) {
				System.out.println("You are pre approved for our 2000 credit limit card");
			} else {
				System.out.println("work harder! one day you will get it");
			}
		} else {
			System.out.println("What balance is on it?");

			double balance = scanner.nextDouble();
			if (balance >= 1000) {
				System.out.println("You should pay your balance immediately!");
			} else {
				System.out.println("You good!Keep spending more!");
			}

		}

	}

}
