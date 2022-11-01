package syntax.HomeWork;

import java.util.Scanner;

public class BonusPay {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter numbers of worked years and annual salary.
		 *  If user worked for more or equals to 5 years than user is eligible for the bonus, 
		 *  otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000,
		 *   otherwise bonus=3000.
		 */

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Whats up man! How many years have you alredy worked here?");
		double years=scanner.nextDouble();
		if (years>=5) {
			System.out.println("you know that you are eligble for a bonus!");
			System.out.println("what is your annual salary per mounth?");
			double salary=scanner.nextDouble();
			 if (salary>=5000) {
				 System.out.println("wow look at you! Your bonus is 5000$ Congrats!!!");
			 }else {
				 System.out.println("your bonus is 3000$! Congrats!!!");
			 }
			
		}else {
			System.out.println("Keep working and one day you will be eligible for bonus");
		}
		
	}

}
