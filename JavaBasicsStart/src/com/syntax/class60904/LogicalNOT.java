package com.syntax.class60904;

public class LogicalNOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean boo = true;
		System.out.println(boo);// false

		Boolean boo1 = !false;
		System.out.println(boo1);

		boolean rain = false;
		if (!rain) {
			System.out.println("i will go for a walk");
		}

		String day = "Sunday";
		if (!day.equals("Sunday")) {

			System.out.println("Today is not Sunday");
		}

	}

}
