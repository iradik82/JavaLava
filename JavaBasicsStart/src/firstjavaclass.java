import java.util.Scanner;

public class firstjavaclass {

	public static void main(String[] args) {
		  
		 Scanner scanner=new Scanner(System.in);{
			    
			 System.out.println("Please enter two strings");
			    
			 String word1=scanner.next();
			 String word2=scanner.next(); 
			    
			  System.out.println("Please enter two numbers");
			   int num1=scanner.nextInt();
			   int num2=scanner.nextInt();

			   if (word1 == word2 && num1 == num2 ) {
			      System.out.println("AND"); }
			    
			   else if (word1==word2 || num1==num2) {
			      System.out.println("OR");}
			    
			   else if (word1!=word2 && num1!=num2) {
			        System.out.println("NONE");}
			 else {
				 System.out.println("have a nice day");
			 }
		 }
			} }