package syntax.HomeWork2;

import java.util.Scanner;

public class HMClass6ITask2 {
	public static void main(String[] args) {

		/*
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. At
		 * the end your program should print which grade was entered by a user with
		 * explanation.
		 */

		Scanner trap = new Scanner(System.in);

		System.out.println("Please enter your grade");

		char pop = trap.next().charAt(0);

		String grade;

		switch (pop) {
		case 'A':
			grade = "Exellent";
			break;
		case 'B':
			grade = "Good";
			break;
		case 'C':
			grade = "Avarage";
			break;
		case 'D':
			grade = "Bad";
			break;

		default:
			grade = "invalid";
			break;

		}
		System.out.println("You entered "+pop+" grade and it is equals acording to our system to "+grade);

	}

}
