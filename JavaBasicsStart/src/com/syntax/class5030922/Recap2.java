package com.syntax.class5030922;

public class Recap2 {
	public static void main(String[] args) {

		boolean allergy = true;

		String allergyType = ("peanut");

		if (allergy) {
			System.out.println("Let's check you out");

			if (allergyType.equals("Pollen")) {
				System.out.println("stay indoors");
			} else if (allergyType.equals("Peanut")) {
				System.out.println("Stay away from peanuts");
			} else if (allergyType.equals("Dairy")) {
				System.out.println("Stay away from dairy products");
			} else {
				System.out.println("We need to do some test");
			}
		} else {
			System.out.println("you are lucky");
		}

	}
}
