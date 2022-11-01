package TeanProject;

import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
	
	
		Scanner lol=new Scanner(System.in);
int num=lol.nextInt();

boolean prime = false;

for (int i1 = 2; i1 <= num/2 ; i1++) { 
  if (num % i1 == 0) {
    prime = true;
    break;
  }
}if (!prime)
  System.out.println(num + " is a prime number.");
else
  System.out.println(num + " is not a prime number.");

	}
}
