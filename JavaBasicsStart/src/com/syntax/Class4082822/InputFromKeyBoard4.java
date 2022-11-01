package com.syntax.Class4082822;

import java.util.Scanner;

public class InputFromKeyBoard4 {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter your name");
		// takes a String type input from the keyboard and stores it in name variable
		String name=scanner.nextLine();
		System.out.println("Enter your age");
		int age=scanner.nextInt();
		
		System.out.println("Hi "+name+" you are "+age+" years old");
		
		System.out.println("What is your home address?");
		String address=scanner.nextLine();
		System.out.println("thank you");
		
		

	}

}
