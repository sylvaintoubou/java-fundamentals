package org.toubou;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson5Ass1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String x;
       String[] vowel= {"a","e","i","o","u","y"};
       boolean contains=false;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a vowel value:");
		 x = input.next(); // reads a string from the user as input 
		System.out.println("You entered vowel is: " +x);
	   do {

	        contains = Arrays.stream(vowel).anyMatch(x::equals);
		   if (contains==true) {
				System.out.println("The value entered is vowel. Type another vowel");
			}
		   else {
				System.out.println("The value entered is not a vowel.Type another vowel");
		   }
				x = input.next();
				System.out.println("You entered vowel is: " +x);
		   
		   if(x.equals("-1")) break;
		
	}while(x.length()>0);
 }
}
