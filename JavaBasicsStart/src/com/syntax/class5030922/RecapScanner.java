package com.syntax.class5030922;

import java.util.Scanner;

public class RecapScanner {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please entet your name");
		
		String name=input.next();
		
		System.out.println("Nice to meet you "+name);
		System.out.println("How old are you "+name);
		
		int age=input.nextInt();
		
		System.out.println(name+" is "+age+" years old");
		
		 System.out.println("How much money you have "+name);
		double money=input.nextDouble();
		
		System.out.println(name+" has $ "+ money);
		
		System.out.println(name+" what is your grade");
		char grade=input.next().charAt(0);
		
		System.out.println(name+" has grade "+grade);
	}
	

}
