package syntax.HomeWork2;

import java.util.Scanner;

public class HMClass6ITask1 {

	public static void main(String[] args) {
		
		/*
		 * Ask user to enter their country and capture it. Once values are captured print which language user speaks.
		 */

		Scanner pop = new Scanner(System.in);

		System.out.println("Enter your Country please");

		String country = pop.next();
		String languege;

		switch (country) {
		case "Ukraine":
			languege = "Ukrainian";
			break;
		case "Moldova":
			languege = "Romanian";
			break;
		case "Kazakhstan":
			languege = "Kazakh";
			break;
		case "France":
			languege = "French";
			break;
		case "Germany":
			languege = "German";
			break;
		default:
			languege = "Unknown";
			break;

		}
		System.out.println("ooo wow you speak "+languege);

	}

}
