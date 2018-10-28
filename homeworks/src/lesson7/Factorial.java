/**
 * 
 * Lesson 7
 * Program which calculates the factorial of a number
 * Optional : could ask the user to enter that number
 */
/**
 * @author mas73rs
 *
 */

package lesson7;

import java.util.Scanner;

public class Factorial {
	
	

	// Formula n! = n(n-1)(n-2)...0!

	public static int factorial(int num) {
		if (num == 0) return 1;
		else return(num*factorial(num-1));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanInt = new Scanner(System.in);
		Scanner scanCont = new Scanner(System.in);
		
		int again;
		
		do {
			System.out.println("Enter a number : ");
			int user = scanInt.nextInt();
		
			System.out.println(user+"! = "+factorial(user));
		
			System.out.println("\n\nAgain ? \n(1. Again 0. Exit)\n ");
			again = scanInt.nextInt();
		
		}
		while (again == 1); 
		
		if (again == 0) {
			System.out.println("\n\nExiting!!!!");
		}
		
	}

}
