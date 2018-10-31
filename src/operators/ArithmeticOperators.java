/**
 * Author Mas73rs
 */


package operators;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 5;
		int sum = a + b;
		
		System.out.println(sum + " is the sum.");
		
		String today = "Today is ";
		String date = "Friday";
		
		System.out.println(today + date + " " + sum + "th.");
		
		int x = 8;
		int y = 12;
		int resultSub = y - x;
		
		System.out.println(y + " - " + x + " = " + resultSub);
		
		
		int resultDiv = y / x;
		System.out.print(y + " / " + x + " = " + resultDiv);
		
		int resultMod1 = y % x;
		System.out.println(" remains " + resultMod1);
		System.out.println(y + " mod " + x + " = " + resultMod1);
		
		int resultMod2 = x % y;
		System.out.println(x + " mod " + y + " = " + resultMod2);
		
		System.out.println("\nMy x is: " + x);
		System.out.println("The new value of my x is: " + ++x);
		System.out.println("Let us go back to the old value of x which is " + --x);
		
		boolean compare = (x > y);
		System.out.println("\nMy x is " + x);
		System.out.println("And my y is " + y);
		System.out.println("Is x > y ? " + compare);
		System.out.println("Ok! But is my x different from my y? " + (x != y));
		System.out.println("Is x >= 100?  " + (x >= 100));
		
		int c = 3;
		System.out.println("\n" + b +" OR " + b + "= " + (b | c));
		System.out.println(b + " AND " + b + "= " + (b & c));
		System.out.println(b + " XOR " + b + "= " + (b ^ c));
		
		//Bitwise operators
		System.out.println(b + "\'s compliment is " +  "= " + ~b); //Complement
		System.out.println(b + " left shifted by 2 is " + (b<<2)); //Left shift
		System.out.println(b + " rignt shifted by 2 is " + (b>>2)); //Right shift
		System.out.println(b + " zero right shifted by 2 is " + (b>>>2));
		
		//Logical operators
		System.out.println("\nx = " + x);
		System.out.println("y = " + y);
		System.out.println("(x == 8) && (y == 5) " + ((x == 8) && (y == 5))); //AND logic
		System.out.println("(x == 8) || (y == 5) " + ((x == 8) || (y == 5))); //OR logic
		System.out.println("(x == 8) " + (!(x == 8))); //NOT logic
		
		//Assignment operators
		System.out.println("\nValue of y is " + y + " but ( y += x ) is " + (y += x));
		System.out.println("New value of y is " + y + " but ( y -= x ) is now " + (y -= x));
		System.out.println("New value of y is " + y + " but ( y *= x ) is now " + (y *= x));
		System.out.println("New value of y is " + y + " but ( y mod x ) is now " + (y %= x));
		System.out.println("\n");
		
		
		//Reading input from the command line
		
		/*
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("Authentication REQUIRED !!! \nWhat\'s your first name ?");
		 * String firstName = input.nextLine();
		 * System.out.println("Your name is : " + firstName);
		 * System.out.println("\nYour name is : " + input.nextLine());
		*/
		
		
		//Miscellaneous operators - Conditional (ternary)
		System.out.println("My x is " + x);
		System.out.println("And my y is " + y);
		
		int max = x < 2 ? x : y;
		System.out.println("Max is " + max);
		
		//Determine if the entered number is even
		//If not even test if the rest is 1
		
		/* Scanner input = new Scanner(System.in);
		 * System.out.println("\n\nEnter a number : ");
		 *
		 * int userNumber;
		 * System.out.println("Your number is " + ((userNumber = input.nextInt()) % 2 == 0? "even !":(userNumber % 2 == 1? "Rest is 1":"Your number is not even and the rest is not 1")));
		 */
		
		//Miscellaneous operators - Instance (instanceof)
		String name = "\'Shadow\'";
		boolean t = name instanceof String;
		System.out.println("\n\nIs " + name + " a string ? " + t);
		
		
		
	}

}
