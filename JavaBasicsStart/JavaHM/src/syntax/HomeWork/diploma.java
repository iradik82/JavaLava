package syntax.HomeWork;

import java.util.Scanner;

public class diploma {

	public static void main(String[] args) {
		/*
		 *  Write a program to store a boolean value of whether user has diploma or not. 
		 *  If user has a diploma, you should say congratulations, otherwise program should suggest to get a degree.
		 *   Then if user has a degree program should check a gpa score.
		 *    If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship”,
		 *     otherwise → “You should have studied harder” .
		 */

		
		   Scanner scanner=new Scanner(System.in);
		   System.out.println("Do you have Diploma");
		   boolean diploma=scanner.nextBoolean();
		   
		   if (diploma) {
			   System.out.println("Congratulations!!!");
			   System.out.println("What is your gpa");
			   double scoreOfgpa=scanner.nextDouble();
			   
		   
		   if (scoreOfgpa>=3.5) {
			   System.out.println("You are eligble for scholarship!");
		   }else if (scoreOfgpa<3.5) {
			   System.out.println("You should studied harder!");
		   }
			   
		   }
		   
		   
		   else {
			   System.out.println("You should get a degree!");
		   }
	}

}
