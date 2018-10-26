package classlabs;

import java.util.Random;
import java.util.Scanner;

public class Factorial {
	

	
	// Formula n! = n(n-1)(n-2)...0!
	
	/*
	public static int factorial(int num) {
		if (num == 0) return 1;
		else return(num*factorial(num-1));
		
	}
	*/
	
	public static int sum(int num) {
		if (num == 0) return 0;
		else return(num+sum(num-1));
		
	}
	
	public static int square(int a) {
		a = a * a;
		return a;
		
	}
	
	public static void rollDice(int a) {
		Random random = new Random();
		for (int i = 0; i < a; i++) {
			System.out.println(random.nextInt(6)+1);
		}
		
	}
	
	public static void rollDice() {
		// This method rolls a dice 6 times
		Random random = new Random();
		for (int k = 0; k < 6; k++) {
			System.out.println(random.nextInt(6)+1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		int user;
		int result;
		float a = (float)5.0;
		String one = (String.valueOf('a'));
		int x = (int)1.2;
		Scanner input = new Scanner(System.in);
		*/
		/*
		System.out.println("Enter a number : ");
		user = input.nextInt();
		
		System.out.println("Sum of numbers between "+user+" and 0 is "+sum(user));
		*/
		
		/*
		// invoke methode
		int x = 5;
		System.out.println("Before square: "+x);
		square(x);
		System.out.println("After square: "+x);
		*/
		
		rollDice(6);
		rollDice();
		
	}

}
