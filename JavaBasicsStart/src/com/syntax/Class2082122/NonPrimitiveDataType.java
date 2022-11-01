package com.syntax.Class2082122;

public class NonPrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is 1 example of non primitive data type
		
		String name="Asma";
		String address="123 address street";
		
		String phone="123 233 9876";
		int age=17;
		//String age="17"//anything you put inside "" -> becomes a String 
		
	    String character="A";
		
	    //cntr+space
		//syso +cntrl+space
		
	    System.out.println(name);
	    
	    //"My name is" + Asma
	    System.out.println("My name is " + name);
	    
	    //Asma is 17
	    System.out.println(name + " is "+age);
	    
	    String fruit ="apple";
	    double price=1.99;
	 
	    //the price of the apple is 1.99
	     
	    System.out.println("The price of the"  + fruit +  " is "  + price);
	    
	    fruit="mango";
	    price=5.99;
	    
	    System.out.println("The price of the"  + fruit +  " is "  + price);
	    

	    /*to attach any value (int, double,boolean, char,String etc)
	     * to a String we use +
	     * + next to the String acts as Concatenation
	     * Rules for Indetifiers=names
	     *
	     * 1. cannot use keywrds as identifiers
	     * string new ="Hello"; -> error
	     * 
	     * 2. cannot have spaces in identifiers
	     * string last name="Smith";
	     * 
	     * 3. identifieers cannot start with number
	     *
	     
	     */
	    int number1=123; //number can be anywhere after 
	    
	    /* 4. indetifiers cannot cantain any special charecter 
	     * except $ or _
	     */
	    
	    double $price=9.98;
	    float _price=1.99F;
	    
	    /*
	     * Naming Conventions
	     * 
	     * Class should start with Uppercase and Follow camel 
	     * 
	     * variebles should start with lowercase and follow camel 
	     */
	   String Weather="hot"; // not preferred
	   String myWeather="cold"; //preferred
	}

}
