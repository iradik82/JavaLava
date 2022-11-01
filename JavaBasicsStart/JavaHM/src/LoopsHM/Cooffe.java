package LoopsHM;

import java.util.Scanner;

public class Cooffe {

	public static void main(String[] args) {

		Scanner lol = new Scanner(System.in);

		double price=4.5;
		
		double pay = 0;

		double change=0;
		
		 while (pay !=price) {
				System.out.println("Please Pay for your coffee  exact amount");
				  pay=lol.nextDouble();
			if (pay<price) {
				change=price-pay;
				System.out.println("you have to pay "+change+" more");
			}else if(pay>price) {
			change=pay-price;
				System.out.println("you have to pay less for "+change);
			}
		 }
System.out.println("enjoy your coffee");
	}

}
