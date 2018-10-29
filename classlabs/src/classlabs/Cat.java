package classlabs;

import java.lang.Math;

import classlab2.Dog;

public class Cat { // Class definition or template

	int legs; // state (fields)
	String color;
	int age; 
	private String name;
	static String hair = "Fury";
	private final int eyes;

	// This is a constructor
	public Cat() {
		this.age = 3;
		this.color = "White";
		this.legs = 4;
		eyes = 2;
	}
	
	// Constructor with one parameter, age
	public Cat(int age) {
		this.age = age;
		eyes = 0;
	
	}
	
	// Constructor with 3 parameters
	public Cat(String name, int age, int legs) {
		this.name = name;
		this.age = age;
		this.legs = legs;
		eyes = 1;
	}
		
	public void meow() { // Behavior (method)
		System.out.println("Meeeeeeeeow !!!!!");
	
	} 
	
	public void meow(String sound) {
		System.out.println(sound);
	}
	
	public void skip() {
		System.out.println();
	}
	
	public void eat() {
		System.out.println(name+" is eating .");
	}
	
	public static void getHair() {
		System.out.println(Cat.hair);
	} 
	
	public static void main(String[] args) {
		Cat myCat = new Cat("Mimi",5,4);
		Cat cat1 = new Cat();
		Cat cat2 = new Cat(5);
		
		System.out.println("First Cat\'s age : "+myCat.age+", name : "+myCat.name+" and number of legs : "+myCat.legs);
		System.out.println("Second Cat\'s age : "+cat1.age+", name : "+cat1.name+" and number of legs : "+cat1.legs);
		System.out.println("Third Cat\'s age : "+cat2.age+", name : "+cat2.name+" and number of legs : "+cat2.legs+"\n\n");

		cat1.meow();
		
		// Calling the meow behavior
		System.out.println("\n");
		myCat.eat();
		cat1.eat();
		cat2.eat();
		
		// Giving names to the other cats
		cat1.name = "Minou";
		cat2.name = "Mina";
		System.out.println("\n");
		cat1.eat();
		cat2.eat();
		
		System.out.println("\n");
		System.out.println(hair);
		
		// Calling hair from getHair
		System.out.println("\n");
		getHair();
		
		// Calling the Dog method from classlab2 package
		Dog dog1 = new Dog();
		System.out.println("\n"); // Calling from the method
		dog1.dogName();
		System.out.println("Dog name : "+dog1.name); // Calling from the variable
		
		System.out.println("\nEquals: "+myCat.equals(cat1));
		
		/*
		 * 
		try {
			Cat clone = (Cat) myCat.clone();
			System.out.println("\nEquals: "+myCat.equals(clone));
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		System.out.println("\nClass Name: "+myCat.getClass().getName());
	}
	
	
	
}
