package TeanProject;

import java.util.Scanner;

public class Countrie {

	public static void main(String[] args) {
		
		
		Scanner lol=new Scanner(System.in);
				
				
				String [] countries =new String[4];
				
				System.out.println("Enter the country you wish to vist?");
			
			for (int i=0;i<countries.length;i++) {
				
				countries[i]= lol.next();
				
			}
			
			for (int b=0;b<countries.length;b++) {
				
				System.out.println("The capital of "+countries[b]+" is ");
				countries[b] = lol.next();
				
			}
				System.out.println();
			
				
				
			
				

	}

}
