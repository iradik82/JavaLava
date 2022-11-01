package com.syntax.class90917Arrays;

public class AllElementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] iceCream = { "vanilla", "chocolate", "pistashio", "kulfi", "mango" };

		// System.out.println(iceCream[0]);
		// System.out.println(iceCream[1]);

		// how to get all values

		for (int i = 0; i < iceCream.length; i++) {
			System.out.println(iceCream[i]);
		}
		System.out.println("---------------------");

		String[] iceCrea = { "vanilla", "chocolate", };

		for (int m = 00; m < iceCrea.length; m++) { //never use " <= " cannot use cause less varibles
			System.out.println(iceCrea[m]);
		}
		
		System.out.println("---------------------");

		
		char [] letters = {'A','B','C','D','F'};
		  
		for (int i=0; i<letters.length;i++) {
			System.out.print(letters[i]+" ");
		}
		System.out.println("---------------------");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
