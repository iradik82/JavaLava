package TeanProject;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		
		//. Create a 2D array of integers.
		//Develop a program which will calculate the sum 
		//of even and odd numbers for that array.
		
		int evenSum=0;
        int oddSum=0;
        int [][] numbers= {{1,1,2 },
                           {3,5,8,13},
                           {21,34,55,89},
                           {144, 233}
    };

        for(int[] num:numbers) {
            for(int total:num) {
                if(total%2==0) {
                    evenSum+=total;
                }
                else if(total%2!=0) {
                    oddSum+=total;
                }
            } 
        }System.out.println("The of odd numbers is " + oddSum);
        System.out.println("The sum of even numbers is " +evenSum);
	}
}
