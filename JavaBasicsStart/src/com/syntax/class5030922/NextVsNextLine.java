package com.syntax.class5030922;

import java.util.Scanner;

public class NextVsNextLine {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter full name");
		
		
		/*
		 * next vs nextLine
		 * next - store to first space
		 * nextLine - stored whole line
		 */
		String name=scan.next();
		System.out.println(name);
		
		
		
	}

}
