package com.syntax.class5030922;

import java.util.Scanner;

public class taskFromAsem {

	public static void main(String[] args) {

		Scanner sup = new Scanner(System.in);

		System.out.println("Please enter your heigts in inches");

		double heights = sup.nextDouble();

		if (heights < 60) {
			System.out.println("Short");
		} else if (heights >= 60 && heights <= 72) {
			System.out.println("Medium");
		} else {
			System.out.println("Tall");
		}
		System.out.println("---------------------------");
		System.out.println("task 2");

		System.out.println("enter a day number");

		int day = sup.nextInt();

		if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
			System.out.println("It is a weekday");
		} else if (day == 6 || day == 7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Invalid day");
		}
		System.out.println("---------------------------");
		System.out.println("task 3");
		System.out.println("enter a number");
		double num = sup.nextDouble();

		if (num >= 1 && num <= 10) {
			System.out.println("Number is small");
		} else if (num >= 11 && num <= 100) {
			System.out.println("Number is medium");
		} else if (num >= 101 && num <= 1000) {
			System.out.println("Number is large");
		} else {
			System.out.println("Number is too large");
		}

		System.out.println("---------------------------");
		System.out.println("task 4");
		System.out.println("What time is that?");

		double time = sup.nextDouble();
		if (time >= 1 && time <= 11.59) {
			System.out.println("Morning time");
		} else if (time >= 12 && time <= 15.59) {
			System.out.println("Afternoon");
		} else if (time >= 16 && time <= 20.59) {
			System.out.println("Evaning");
		} else if (time >= 21 && time <= 24.59) {
			System.out.println("Night");
		}

		System.out.println("---------------------------");
		System.out.println("task 5");
		System.out.println("What is your birth mounth ?");

		String mounth=sup.next();

		if (mounth.equals("march") || mounth.equals("April") || mounth.equals("May")) {
			System.out.println("Spring season");
		} else if (mounth.equals("June") || mounth.equals("July") || mounth.equals("August")) {
			System.out.println("Summer season");
		} else if (mounth.equals("September") || mounth.equals("October") || mounth.equals("November")) {
			System.out.println("autumn season");
		} else if (mounth.equals("December") || mounth.equals("January") || mounth.equals("Fabruary")) {
			System.out.println("Winter season");
		}
	}
}
