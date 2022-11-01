package com.syntax.Class3082722;

public class ifElse {

	public static void main(String[] args) {
		
		short box=5555;
		byte box2=(byte)box;
		System.out.println(box2);
		
		/*
		 * What is typr casting?
		 * vonverting one data type to another data type
		 * Why should i learn about type casting?
		 * so that we can use the code written by someone else to make are life easier
		 * or when we will be working in teams we will be able to merge the code
		 * what is the syntax for type casting?
		 * when we are conerting something smaller to large we don;t need to do anything
		 * it happens automatically we just assign the variable for example
		 * 
		 * int box=1234;
		 * 
		 * long box2=box; //this is how it works and it is called implicit or widening automaticaly
		 * 
		 * however when we convert a large data type to smaller data type
		 * then this is how we do it
		 * 
		 * long box=123454;
		 * 
		 * int box2=(int) box; narrowing or explicit or manual conversion
		 */
		
		double money=5;
		boolean isHungry=true;
		double kfcBurger=11;
		
		if(money>kfcBurger) {
			System.out.println("yayy i can enjoy a burger");
		}else {
			System.out.println("i should  make something at home");
		}
         if (isHungry) {
        	 System.out.println("lets eat something yammy");
         }
         else {
        	 System.out.println("lets watch and do some coding from Youtube");
         }
         
         if (3>2) {
        	 System.out.println("There is a true statement inside paranthesis");
         }
         
         double myBankBalance=2000;
         double theAmountThatIwantToTransfer=250;
         
         if (myBankBalance>theAmountThatIwantToTransfer) {
            System.out.println("Funds transfered succesfuly");
            
         }
           
         
      
	}

}
