package syntax.HomeWork;

import java.util.Scanner;

public class birthSeason {

	public static void main(String[] args) {
		
		
		System.out.println("What is your birth mounth ?");

		Scanner sup = new Scanner(System.in);
		
		String mounth=sup.next();
		
		String season;

		if (mounth.equals("March") || mounth.equals("April") || mounth.equals("May")||mounth.equals("march") || mounth.equals("april") || mounth.equals("may")) {
			season="Spring season";
		} else if (mounth.equals("June") || mounth.equals("July") || mounth.equals("August")||mounth.equals("june") || mounth.equals("july") || mounth.equals("august")) {
			season="Summer season";
		} else if (mounth.equals("September") || mounth.equals("October") || mounth.equals("November")||mounth.equals("september") || mounth.equals("october") || mounth.equals("november")) {
			season="autumn season";
		} else if (mounth.equals("December") || mounth.equals("January") || mounth.equals("Fabruary")||mounth.equals("december") || mounth.equals("january") || mounth.equals("fabruary")) {
			season="Winter season";
		}else {
			season = "invalid";
		}
		System.out.println("You were born in  "+season);

	}

}
