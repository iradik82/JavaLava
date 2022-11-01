package com.syntax.class80911;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		Scanner lol = new Scanner(System.in);

		System.out.println("What would you like to buy?");
		String item = lol.next();
		System.out.println("What is the price for that?");
		int price = lol.nextInt();

		System.out.println("Please pay now for your "+item);
		
	
		
		
		
	
			int total=0;
	
		do {
			int pay = lol.nextInt();
			total +=pay;
			int need;
			int change;
			 
			
			if (total<price) {
				need=price-total;
				System.out.println("Your left balance is "+need);
			}else if (total>=price) {
				change=total-price;
				System.out.println("Here is your change"+change);
				break;
			}
		}
		while(total!=price);
		System.out.println("Have a nice day");
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
