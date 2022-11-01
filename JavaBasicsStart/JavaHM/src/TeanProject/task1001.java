package TeanProject;

public class task1001 {

	public static void main(String[] args) {
		
		
        int[] number = {30, 27, 15, 20, 25, 35,56,89};

        int largest = 0;
        int secondLargest = 0;

        for (int i=0; i < number.length; i++) {

            if (number[i] > largest ) {

                secondLargest = largest;
                largest = number[i];

            }
        }
        
        System.out.println(secondLargest);
    






	}

}
