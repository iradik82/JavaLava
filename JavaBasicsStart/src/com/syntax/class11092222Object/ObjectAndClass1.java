package com.syntax.class11092222Object;

public class ObjectAndClass1 {

	public static class Dog {

		// State
		// atributes /properties/fields

		String name;
		String color;
		String breed;
		double weight;
		int age;

		// this are the behaviors of a dog
		// methods functions
		void bark() {
			System.out.println("Barking........");
		}

		void sleep() {
			System.out.println("Dog is sleping.....");
		}

		public static void main(String[] args) {
			// creating objects from a class
			// new Dog();=> it creates an object of class Dog
			Dog dog1 = new Dog();
			// calling a behaviors on an object
			dog1.bark();
			dog1.sleep();
		}
	}
}
