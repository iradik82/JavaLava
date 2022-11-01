package LoopsHM;

import java.util.Scanner;

public class triangleForLoop {

	public static void main(String[] args) {
		
		
		
		
		int levels = 8;
		System.out.println("TRIANGLE PRINTED USING LOOPS: \n");
		for (int a = 1; a <= levels; a++) {
			
		for (int b = levels; b >= a; b--) {
			
		System.out.print(" ");
		}
		for (int b = 0; b < a; b++) {
			
		System.out.print("* ");
		}
	 
		System.out.println();
		}
		
	
	}

}
