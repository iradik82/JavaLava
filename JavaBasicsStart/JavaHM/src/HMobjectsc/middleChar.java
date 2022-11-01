package HMobjectsc;

import java.util.Scanner;

public class middleChar {

	public static void main(String[] args) {
		/*
		 * Create a String and if the String is not empty perform the following: if the
		 * String has an odd number of characters and has 3 or more characters, print
		 * the character in the middle of the String.
		 * 
		 */
        System.out.println("Enter your name");
		Scanner lol=new Scanner(System.in);
		String word=lol.next();
		
		
		 if(!word.isEmpty()&&word.length()%2!=0&&word.length()>=3) { 
			 int middleIndex=word.length()/2;
			 System.out.println(word.charAt(middleIndex));
			 }
		
	/* 2ed long way
	 * 
	 *  if (word.length()%2!=0) {
	 *		System.out.println("Your word "+word+" have an equel number of character so middle part of it is: "
	 *				+ word.charAt(word.length()/2-1)+ word.charAt(word.length()/2));
	 *	}else if (word.length()<3) {
	 *		System.out.println("inalid input");
	 *	}else if(word.length()==3) {
	 *		System.out.println("your middle character from "+word+" is: "+word.charAt(1));
	 *	}
	 *	
	 *	else {
	 *		System.out.println("your middle character from "+word+" is: "+word.charAt(word.length()/2));
	 *	}
	 *			
	 */
			
		}
		
		
	
	}

