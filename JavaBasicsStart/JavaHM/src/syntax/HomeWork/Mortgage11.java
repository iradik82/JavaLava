package syntax.HomeWork;

import java.util.Scanner;

public class Mortgage11 {

	public static void main(String[] args) {
		
		/*
		 * Create a Java program and store values of mortgage rate and mortgage price. 
		 * First, program should check if rate is higher than 4.5 user will not buy a house,
		 *  otherwise user will consider buying. Once user decides to buy a house,
		 *   if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash
		 *   You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		 * If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
		 */
		
		Scanner scanner=new Scanner(System.in);
		
		double morgageRate=3.6;
		double mortgagePrice=500000;
		
		System.out.println("Morgage rate is "+morgageRate);
	
		
		if (morgageRate<4.5) {
			System.out.println("Great!I like that!");
		} else  {
			System.out.println("Sorry to see you go. Godd luck");
		}
		System.out.println("House rate is "+ mortgagePrice);
		
		if (mortgagePrice>200000) {
			System.out.println("I have to get a loan");
		}else {
			System.out.println("will pay with cash");
			System.out.println("Thank you!");
			
		}System.out.println("What amount do you need to loan?");
		  double amount=scanner.nextDouble();
		  
		  if (amount<200000) {
			  System.out.println("Your loan request has been approved!");
		  }else {
			  System.out.println("Decline");
		  }
		 
		   
		
	
			
		
			
	
		
		
		

	}
	}

