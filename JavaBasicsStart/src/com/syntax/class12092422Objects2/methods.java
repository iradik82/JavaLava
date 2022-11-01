package com.syntax.class12092422Objects2;

import java.util.Arrays;

public class methods {

	public static void main(String[] args) {
		// Proper way of creating an object
		String str = new String("Java");
		// Simpler and shorter way provided by Java creators to make out life a little
		// easier
		String name = "Java";// Only works for String and Wrapper classes

		/*
		 * Counts the number of char in a string including the spaces
		 */

		System.out.println(str.length());
		System.out.println(name.length());

		if (name.length() > 15) {
			System.out.println("Name cant be more than 15 characters ");
		}
		System.out.println("----------------------------");
		
		String strb="dna";
		System.out.println(strb.toUpperCase()); //converts from lower to upper case
		
		str="Java";
		System.out.println(str.toLowerCase());
		System.out.println("----------------------------");
		
		
		String firstName="Olena";
		String lastName="Dudka";
		System.out.println(firstName+lastName);  //mostly this is used
		System.out.println(firstName.concat(lastName));
		System.out.println("----------------------------");
		
		
		String sdf="";
		System.out.println(sdf.isEmpty()); //Returns true if, and only if, length() is 0.
		System.out.println("----------------------------");
		
		String a=" i love java ";
		System.out.println(a);
        System.out.println(a.trim()); //taking away spaces from start and end of a String 
        
        System.out.println("----------------------------");
        
        
        String a1="Java is very easy";
        System.out.println(a1.startsWith("J"));
        System.out.println(a1.endsWith("y"));
        System.out.println(a1.contains("very"));
        
        /*
         * Method chaining helps us call multiple methods on a single line one method after an other
         */
        System.out.println(a1.toLowerCase().contains("very"));
        
        System.out.println("----------------------------");
        
        String b="Shah";
        
        if (b.equals("shah")) {
        	System.out.println("I found it");
        }
        /*
         * equals checks if two Strings are exactly the same with same case
         * equalsIgnoreCase checks if two Strings are exactly the same with same case but does not care 
         * about the case of letters
         */
        if (b.equalsIgnoreCase("shah")) {
        	System.out.println("I found it with equalsIgnorecase");
        }
        System.out.println("----------------------------");
        
        
        String v="I love java programming";
        for(int i=0;i<v.length();i++) {
        	//print only the charecters not spaces
        	if(!(v.charAt(i)==' ')) 
        		System.out.println(v.charAt(i));
        	}
        
        System.out.println("----------------------------");
        
        String c="I love java programming";
        /*
         * toCharArray will convert a String to an array of chars
         */
        char[] charArray=c.toCharArray();

        System.out.println(Arrays.toString(charArray));
        int counter=0;
        for(char cc:charArray) {

            if(cc=='a') {
                counter++;
            }
        }
        System.out.println("letter a has appread "+counter+" times");

    System.out.println("----------------------------");
   
    
    String d="I am always consfused i was kidding";

    System.out.println(d.indexOf("a"));
    System.out.println(d.indexOf("s"));
    System.out.println(d.indexOf(" "));
    /*
     * substring() gives you smaller string from a String we can start the starting
     * part to this method and it will return us the subString from that index
     */
    System.out.println(d.substring(5));

    System.out.println(d.substring(5,11));
    
    
    
       System.out.println("----------------------------");
        
       String m="szfksKAFBDAJKF11493!@#%$%$$";
       
       // Replace all numbers from 0 to 9 with @
       
      
       System.out.println(str.replaceAll("[0-9]","@"));
      
        
      //  Remove all numbers from 0 to 9 
       
       System.out.println(m.replaceAll("[0-9]",""));
       
        // Remove all letters  from a to z refer the asci table for range info 
        
       System.out.println(m.replaceAll("[a-z]",""));
       
        // Remove all letters  from A to Z refer the asci table for range info 
        
       System.out.println(m.replaceAll("[A-Z]",""));
       
        // Remove all letters  other than A to Z refer the asci table for range info 
        
       System.out.println(m.replaceAll("[^A-Z]",""));
       
        // Remove all letters  other than A to Z and a to z refer
        //the asci table for range info 
        
       System.out.println(m.replaceAll("[^a-zA-Z]",""));
       
        // Remove all letters  other than A to Z and a to z and 0 to 9
        //refer the asci table for range info 
        
       System.out.println(m.replaceAll("[^a-zA-Z0-9]",""));
     
       
       /*
        * split method
        */
       String q = "Batch 14 is really good";
       String[] arr = q.split(" ");
       System.out.println(Arrays.toString(arr));
       System.out.println(arr[0]);

       String q2 = "Today is Sunday. Sunday is good. Java is also good.";

       String[] arr2=q2.split("[.]");
       System.out.println(Arrays.toString(arr2));
   
		
		
		
		
		
		
		
	}

}
