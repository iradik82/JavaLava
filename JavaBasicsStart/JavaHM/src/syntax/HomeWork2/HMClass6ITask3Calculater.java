package syntax.HomeWork2;

import java.util.Scanner;

public class HMClass6ITask3Calculater {

	public static void main(String[] args) {
		/*
		 * Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user. Please
		 * complete this assignment in 2 ways: using if statement and switch case.
		 */

		Scanner cal = new Scanner(System.in);

		System.out.println("Hi! Lets do some calculation! enter a first number ");
		int num1 = cal.nextInt();

		System.out.println("Great! now choose an operation you would like to do + - / *");

		String operation = cal.next();

		System.out.println("Wonderfull ! and last number please");

		int num2 = cal.nextInt();

		long num3 = num1 + num2;
		long num4 = num1 - num2;
		long num5 = num1 * num2;
		long num6 = num1 / num2;

		if (operation.equals("+")) {

			System.out.println("Your resuolts is " + num3);

		} else if (operation.equals("-")) {

			System.out.println("Your resuolts is " + num4);

		} else if (operation.equals("*")) {
			System.out.println("Your resuolts is " + num5);
		} else if (operation.equals("/")) {
			System.out.println("Your resuolts is " + num6);
		}

		long answer;

		switch (operation) {
		case "+":
			answer = num3;
			break;
		case "-":
			answer = num4;
			break;
		case "*":
			answer = num5;
			break;
		case "/":
			answer = num6;
			break;
		default:
			answer = 0;
			break;
		}
		System.out.println("Your resuolts is " + answer);
	}

}
