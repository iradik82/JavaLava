package TeanProject;

public class task9 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?
		
		
		int [] num= {12,-74,42,43,563,12,-3,33,423};
        int max=0;
        int min=0;
		for (int i=0;i<num.length;i++) {
			if (max<num[i]) {
				max = num[i];
		}
			if (min >num[i]) {
				min = num[i];
			
			
	}
			

}System.out.println("Max num is "+max + " and  min num is "+min);
	}
}
