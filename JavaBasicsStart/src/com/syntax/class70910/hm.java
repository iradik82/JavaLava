package com.syntax.class70910;

public class hm {

	public static void main(String[] args) {
		/*
		 * Print numbers from 100 to 1

Print even numbers from 20 to 100 

Print only odd numbers from 100 to 1
(2 different ways)
		 */

		
		int b=100;
		while (b>=1) {
			System.out.print(b +" ");
			b--;
		}
		
		int v=20;
		while (v<=100) {
			if (v%2==0) {
				System.out.println(v +" ");
			}
			v++;
		}
		
		int n=100;
		while (n>=1) {
			if (n%2!=0) {
				System.out.println(n+" ");
			}n--;
		}
	}
	

}
