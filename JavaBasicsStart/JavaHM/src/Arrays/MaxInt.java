package Arrays;

public class MaxInt {

	public static void main(String[] args) {

		int[] num = { 967, 2, 3, 46, 5, 36, 7, 758, 9 };
		int max = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) max = num[i];
		}
		System.out.println("The max num is " + max);

	}

}
