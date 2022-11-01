package com.syntax.Class3082722;

public class Сфіештп {

	public static void main(String[] args) {
		
		
		/*
		 * type casting => data type casting = converting
		 */

		byte box1 =127; //smaller box
		short box2=3333; 
		int box3=423;
		long box4=945832;
		float box5 =935434;
		double box6 =543534;
		
		
		int number=(int)15.2; // we can't store the decimal number in a box of type int
		System.out.println(number);
		
		long smallerBox=(long)box2;
		System.out.println(smallerBox);
		
		short biggerBox=box1;
		
		
		long box7=box1; // we can do this because box 7 is larger than box1
		
		//as box6 is larger it is double we need type casting to assign the value
		float box8=(float)box6;
		
		char a=(char)67;
		System.out.println(a);
		
		
	    int box9=(int)box4;
		System.out.println(box9);
		
		
		
		
	}

}
