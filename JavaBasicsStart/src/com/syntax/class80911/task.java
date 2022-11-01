package com.syntax.class80911;

public class task {

	public static void main(String[] args) {

		int odd = 0;
		int sumEv = 0;
		int b;

		b = 0;

		for (b = 0; b <= 50; b++) {
			if (b % 2 == 0) {
				sumEv += b;
			} else {
				odd += b;
			}

		}
		System.out.println(sumEv);
		System.out.println(odd);

	}

}
 