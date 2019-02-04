/**
 * @author jeansylvain.toubou
 *
 */
package org.toubou;

import java.util.Scanner;

public class HelloWorld {
	//print "Hello World" to the console. line 2
	/* Multi line comment. line 3 */
	/** 
	 ************* Primitives datatypes_********************
	 * static byte x; 1byte is 1byte 
	 * static short x;  1 short is 2 bytes
	 * static int_ x;  1 intiger_ is 4 bytes
	 * static long x;  1 long is 8 bytes
	 * static float x;  1 long is 4 bytes
	 * static double x;  1 long is 8 bytes
	 * static boolean x; boolean is two values true or false
	 * static char x; char is a single 16-bit uni_code
	 * 
	 * ***********Non-Primitives(composites) datatypes_*******
	 * String,Array,class
	 */

	
	/*
	 * public static int MAX_AGE=100; //class variable private int
	 * _age=25;//instance variable pro
	 tected char type='E';
	*/
	public static  void main(String[] args) { 
		/*int a=10;//local Variable
		int b=5;
		
		String name ="larry";
		String hello="Hi,"+name;
		
		int z=4*3-1+5-(3*2);
		/*
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a x:");
		int x = input.nextInt(); // reads a string from the user as input 
		System.out.println("You entered x: " +x);
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter a y:");
		int y = input1.nextInt(); // reads a string from the user as input 
		System.out.println("You entered x: " +y);
		System.out.println("COND result is "+(x<y?x:y));
       *//*
		System.out.println(z);
		*/
		for (int a =10;a>=0;a--){
			System.out.println(a);
			}
	}
/*	
public void privateage() {
	System.out.println("Age: " +_age);
}

public void protectedage() {
	System.out.println("Age: " +type);
}*/
}