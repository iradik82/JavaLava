package HMobjectsc;

import java.util.Scanner;

public class reverseOrder {

	public static void main(String[] args) {
		
		//Create a String and print it in reverse order 
		
		
	Scanner lol=new Scanner(System.in);
	 System.out.println("enter name");
	 String name=lol.next();
	 
	 for(int i=name.length()-1;i>=0;i--) {
		 String word="";
		 char bob=name.charAt(i);
		 word+=bob;
		 System.out.print(word);
	 }
	 
	 //2ed way 
	 
		for(int i=name.length()-1;i>=0;i--) {
			System.out.println(name.charAt(i));
		}
		
		

	}

}
