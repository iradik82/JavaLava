package Arrays;

public class Animals {

	public static void main(String[] args) {
		

		
		String[] animals= {"Dog","Cat","Rat","Bat","Fly"};
		
		for(int b=0;b<animals.length;b++) {
			System.out.print(animals[b]+" ");
		}
		
		for (String a:animals) {
			System.out.println(a);
		}
		
		
	}

}
