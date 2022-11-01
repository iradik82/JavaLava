package com.syntax.class11092222Object;

public class Student {

	
	String name;
	String id;
	int age;
	double weight;
	char gender;
	
	void study() {
		System.out.println(" Student is studying");
	}
	
	
	void deleteMessages() {
		System.out.println("Deliting messages from Discord");
	}
	
	void eat() {
		System.out.println("Eating pizzza...");
	}
	
	
	
	public static void main(String[] args) {
		//new Student()=> Creates the object of Student class
		Student friadoonObject=new Student();
		friadoonObject.name="Friadoon";
		friadoonObject.id="123";
		friadoonObject.age=22;
		
		System.out.println(friadoonObject.name);
		System.out.println(friadoonObject.age);
		System.out.println("********");
		Student studen2=new Student();
		studen2.name="Asma";
		studen2.age=25;
		studen2.weight=150;
		System.out.println(studen2.name);
		studen2.eat();
		
		
		
	}
	
	
	
	
	
}
