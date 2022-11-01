package com.syntax.class100918I2Darrays;

public class task1 {

	public static void main(String[] args) {
		
		
		//Create a 2D array (longer way)where you will store the following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		//After storing values print following String:
		//	Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.

		String[][] name=new String [4][4];
		
		name[0][0]="Mr";
		name[0][1]="Mrs";
		name[0][2]="Ms"; 
		name[0][3]="Miss";
		
		
		name[1][0]="Smith";
		name[1][1]="Jordan"; 
		name[1][2]="Jackson";
		name[1][3]="Obama";
		
		
		System.out.println(name[0][1]+" "+name[1][0]);
		System.out.println(name[0][0]+" "+name[1][3]);
		System.out.println(name[0][2]+" "+name[1][2]);
		System.out.println(name[0][3]+" "+name[1][1]);

		
		
		/*
		 * Create a 2D array(shorter way) in which first array will
		 *  consist of 4 names and second array will contain grades. 
		 *  Then your program should print name of the students that has A and B grade
		 */
		
		String[][]nam= {
				{"Ivan","Roman","Anastasia","Michelle"},
				{"A","B","C","D"}
		};
				
				
				System.out.println(nam[0][1]+" "+ nam[1][1]);
				System.out.println(nam[0][0]+" "+nam[1][0]);
				System.out.println(nam [0][2]+" "+nam[1][0]);
				System.out.println(nam[0][3]+" "+nam[1][1]);
		
				
				// regular loop
				
				for(int i=0; i<nam.length;i++) {
					for(int j=0;j<nam[i].length;j++) {
						System.out.print(nam[i][j]+" ");
					}
					System.out.println();
				}
				
				//encheced loop
				
				for (String[] lol:nam) {      //loops over 1d or single array
					for (String bob:lol) {    //loops over each element of the 1d array
						System.out.print(bob+" ");
					}
					System.out.println();
				} 
				
				
				
	}

}
