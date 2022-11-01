package com.syntax.Class4082822;

public class NestedifConditions {

	public static void main(String[] args) {
		
		int time=9;
		String day="Monday";
		 /*
		  * it is call outer if-condition if it's true then only inner conditions will be checked if it's
		  * false nothing from inner if-condition will be executed it's like the main door
		  * if main door is closed we can't enter the building
		  */
		
		
		//Outer if-conditions
		if(day.equals("Monday")) {  // as String is a non primitive we can't use == sign we have to use .equals
			
			
			//inner if-conditions
			if(time>7) {
				System.out.println("Lets go to office");
			}
		}
        
		if(time<6) {
		   System.out.println("Lets sleep more");
		}

	}

}
