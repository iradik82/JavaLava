package HMobjectsc;

import java.util.Scanner;

public class ChildName {

	public static void main(String[] args) {
		
		//Write a program that reads two people's first
		//names and if they expecting boy or girl? 
		//Based on the input suggests a name for a baby:
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Dad name please");
		String dad=input.next();
		System.out.println("Mom name please ");
		String mom=input.next();
		
		System.out.println("who do you expect girl or boy?");
		String gender=input.next();
		
		
		
		if (gender.equals("girl")) {
			String child=mom.substring(0,mom.length()/2)+dad.substring(dad.length()/2);
			System.out.println(child + " -awww...What a beautiful name for your girl ");
		} 
		else  {
			String child=dad.substring(0,dad.length()/2)+mom.substring(mom.length()/2);
			System.out.println(child+" -awww..What a beautiful name for your boy ");
			
		}
			
		
		
		

	}

}
