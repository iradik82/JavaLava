package syntax.HomeWork;

import java.util.Scanner;

public class dmv {

	public static void main(String[] args) {
		
		
		/*
		 * You are DMV representative and you need to ask customer their age. 
		 * If they are 18 and older you will issue a driver license to them, 
		 * otherwise you will offer them to get a learners permit.
		 */
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("What's your age?");
		int age=scanner.nextInt();
		
		if (age>=18) {
		  System.out.println("now i need your ssn , phisical exam, documents from your school, "
		  		+ "2 copy of home residence and maybe then i will issue you a driver license");
		}else {
			System.out.println("hahaha nice try ! go home kid");
		}

	}

}
