package com.syntax.class100918I2Darrays;

public class ЕцщВфккфнВуьщ {

	public static void main(String[] args) {

		String[][] countries = { { "Usa", "Canada" }, // 1 array with index 0
				{ "Peru", "Brazil", "Colombia", "Ecuador" }, // 2 array with index 1
				{ "Ethiopia", "Egypt", "Kenya" }, // 3
				{ "Germany", "Turkiye", "Moldova", "Ukraine" }, // 4
				{ "Kazakhstan", "Afghanistan", "Korea" }// 5
		};

		System.out.println(countries.length); // 5 - total # of arrays or rows

		int elementsof1arr = countries[0].length;

		System.out.println("# of elements from 1 array " + elementsof1arr);

		int elementsof2arr = countries[1].length;

		System.out.println("# of elements from 2 array " + elementsof2arr);
		int elementsof3arr = countries[2].length;

		System.out.println("# of elements from 3 array " + elementsof3arr);
		
		
		System.out.println("getting all values from 2d array-----");
		
		
		for (int r=0;r<countries.length;r++) {
			
			for(int c=0;c<countries[r].length;c++) {
				System.out.print(countries[r][c]+" ");
			}
			System.out.println();
			
			
		}

	}

}
