package TeanProject;

public class task8 {

	public static void main(String[] args) {
		
		//Write a Java Program to print the first 10 numbers of Fibonacci series.
		 int num1 = 0;
	        int num2 = 1;
	        int num3 = 0;

	        System.out.println(num1);
	        System.out.println(num2);
	        for (int i = 0; i < 8; i++) {
	            num3 = num2 + num1;
	            System.out.print(num3+" ");
	            num1 = num2;
	            num2 = num3;

	}

}
}