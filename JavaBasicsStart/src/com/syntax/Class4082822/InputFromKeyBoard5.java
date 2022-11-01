package com.syntax.Class4082822;

import java.util.Scanner;

public class InputFromKeyBoard5 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("did you solve repl assigments");
		boolean solvedAnyRepls=scanner.nextBoolean();
		
		if (solvedAnyRepls) {
			System.out.println("How many Repls you solved");
			int no0fReplsSolved=scanner.nextInt();
			
			if(no0fReplsSolved>=17) {
				System.out.println("you are doing great ");
			}else if(no0fReplsSolved>10) {
				System.out.println("you are doing ok");
			}else {
				System.out.println("you shold solve some more repls");
			}
		}
		else {
			System.out.println("The are very important please solve them");
		}

	}

}
