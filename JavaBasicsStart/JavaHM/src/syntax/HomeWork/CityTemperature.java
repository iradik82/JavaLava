package syntax.HomeWork;

import java.util.Scanner;

public class CityTemperature {

	public static void main(String[] args) {
		
		/*
		 * Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert F into C and print
		 *  “The temperature in the city  is ” 
		 */
	Scanner scanner=new Scanner(System.in);
	float Fahrenheit, Celsius;
	
	
	System.out.println("Please enter your city");
	String city=scanner.nextLine();
	System.out.println("now what is the wheather over there in F");
	double wheather=scanner.nextDouble();
	
	System.out.println("let me see how much it in C");
	wheather = ((wheather-32)*5)/9;
	System.out.println("The temperature in  "+ city +" "+ wheather+"C" );
	
	if (wheather>30) {
		System.out.println("No way im gonna go out today");
	}else {
		System.out.println("nice day to go for a walk");
	}

	
	
	
	

	}

}
