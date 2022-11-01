package TeanProject;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {

		/*
		 * Create a 2D array or integer type where you will store odd and even numbers.
		 * Develop a program which will identify/print the even numbers only.
		 */

		int[][] num = { { 10, 29, 30, 40 }, { 9, 19, 20, 39 } };

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++)
				if (num[i][j] % 2 == 0) {
					System.out.println(num[i][j]);
				}
		}

		// 2ed way

		Scanner scanner = new Scanner(System.in);

		int[][] evenOdd = new int[2][4];

		for (int i = 0; i < evenOdd.length; i++) {
			System.out.println("Please enter the number");
			int number = scanner.nextInt();

			if (number % 2 == 0) {
				evenOdd[0][i] = number;
				System.out.println(number + " is Even number");
			} else {
				evenOdd[1][i] = number;
				System.out.println(number + " is odd number");
			}

		}
		System.out.println("the end");

	}

}
