package TeanProject;

public class task6 {

	public static void main(String[] args) {
		
		// Write a program to swap 2 numbers without a temporary variable?
		
		int x=25;//30
		int y=30;//25
		System.out.println("first x ="+x );
		System.out.println("first y ="+y );
	
		// put y into x and x put in to y

		x=x+y; //x=55 y=30
		y=x-y; //y=25
		x=x-y; //x=30
     	System.out.println("Second x ="+x);
    	System.out.println("Second y ="+y);
	}

}
