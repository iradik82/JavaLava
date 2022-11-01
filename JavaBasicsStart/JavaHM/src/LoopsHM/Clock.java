package LoopsHM;

public class Clock {

	public static void main(String[] args) {

		String time = null;

		for (int h = 0; h <= 23; h++) {

			for (int m = 0; m <= 59; m++) {
				for (int c = 0; c <= 59; c++) {

					System.out.println(h+":"+m+":"+c);
					}
					
				}

			}
		
	

        for (int h = 0; h < 24; h++) {

            for (int m1 = 0; m1 <= 5; m1++) {

                for (int m2 = 0; m2 <= 9; m2++) {

                    if (h < 10) {
                        System.out.println("0" + h + ":" + m1 + m2);
                    } else {
                        System.out.println(h + ":" + m1 + m2);
                    }
                }
            }
        }

    }
	
}
