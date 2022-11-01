package TeanProject;

public class task11 {

	public static void main(String[] args) {
		
		//Write a program to print out duplicate elements from an Array of Strings?
		
		String [] lol= {"Pan","Iphone","Mouse","Iphone","Laptop","Table","Pan"};
		
		for (int i=0;i<lol.length;i++) {
			
		for (int b=i+1;b<lol.length;b++) {	
			
			if ((lol[i].equals(lol[b])))
			{
				System.out.println(lol[b]);
			}
		}

	}

}
}