package org.toubou;

import java.util.Scanner;

public class lesson5Ex1 {

	@SuppressWarnings("resource")
	public static void main(String[] args){
		int x,y;
		do {

			System.out.println("You range must not start with negative interval");
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a min value:");
			 x = input.nextInt(); // reads a string from the user as input 
			System.out.println("You entered min is: " +x);
			Scanner input1 = new Scanner(System.in);
			System.out.println("Enter a max value:");
			 y = input1.nextInt(); // reads a string from the user as input 
			System.out.println("You entered max is: " +y);
		} while(x<0 || y<0);
		/*
		if (x<0 || y<0) {
			do {
				System.out.println("You range must not start with negative interval");
				System.out.println("Enter a min value:");
				x = input.nextInt(); // reads a string from the user as input 
				System.out.println("You entered min is: " +x);
				System.out.println("Enter a max value:");
				y = input1.nextInt(); // reads a string from the user as input 
				System.out.println("You entered max is: " +y);
			} while(x<0 || y<0);*/
		
		
		if (x>y) {
			System.out.println("You min value in the interval is greater than the max");
		    return;
		}
		for (int a=y;a>=x;a--) {
		   int value=a%2;
			switch(value) {
			case 0: System.out.println(a +" est pair");
			        break;
	 
			}
			}
	}
}

