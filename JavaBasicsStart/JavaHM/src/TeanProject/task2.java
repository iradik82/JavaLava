package TeanProject;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {

		Scanner lol = new Scanner(System.in);

		String[][] countries = { { "Ukraine", "Turkey" }, { "Moldova", "Romonia" } };

		for (int i = 0; i < countries.length; i++) {

			for (String[] count : countries) {
				System.out.print(count[i] + " ");

				if (count[i].equals("Ukraine")) {
					System.out.println("Capital of " + count[i] + " is Kiev");
				}
			}
		}


	}

}
