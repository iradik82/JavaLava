package com.syntax.Class3082722;

public class Recap {

	public static void main(String[] args) {
		
		/*
		 * String conactenation helps us combine Strings with any primitive data type together
		 */
		
		String firstName="Mina";
		String lastName="Henen";
		String fullname=firstName+ " "+lastName;
		System.out.println(fullname);
		
		int houseNo=10;
		int apartmentNo=5;
		String streetName="StationSt";
		String city="NewYork";
		String county="USA";
		String fullAddress=(apartmentNo)+" "+(houseNo)+" "+streetName+" "+city+" "+county;
		System.out.println(fullAddress);

		String incompeteAddress=houseNo+city;
		
		String step1="if we subtract 10 from 5 we get ="+10;   //results in a String
				System.out.println(step1);
				
			/*
			 * its is not defined java does not undarstand what to do when we ask her to subtect
			 * a String from sa number it complains
			 * String step2=step1-5;
			 */
				
		System.out.println("if we subtract 10 from 5 we get ="+(10-5)); 
		
	}

}
