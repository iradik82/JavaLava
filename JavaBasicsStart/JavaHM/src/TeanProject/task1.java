package TeanProject;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		
		Scanner lol=new Scanner(System.in);
		
		int[] num= new int[4];
		
		int sum=0;
		
		System.out.println("Enter  5 numbers ");
		
		
		for(int i=0;i<num.length;i++) {
			
			num[i]=lol.nextInt();
			sum += num[i];
			
			
		}
		
		System.out.println("your total is "+sum);
		

	}

}
