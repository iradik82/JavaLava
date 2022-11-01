package Arrays;

public class reverse {

	public static void main(String[] args) {
		
		
		char [] a= {'A','B','C','D','E'};
		
		for (int b=0;b<a.length;b++) {
			System.out.println(a[b]);
			
		}
		System.out.println();

		
		for (int b=a.length-1;b>=0;b--) {
			System.out.println(a[b]+ " ");
		}
	}

}
