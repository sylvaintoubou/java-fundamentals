package lesson7;

import java.util.Scanner;

public class Fibonacci {
	
	// Formula fib(n) = fib(n-1) + fib(n-2)
	public static int fibonacci(int n) {
		
		int result;
		System.out.println("fibonacci("+n+")");
		if (n <= 1) return 1;
		else {
			result = fibonacci(n-1) + fibonacci(n -2);
			return result;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanInt = new Scanner(System.in);
		Scanner scanCont = new Scanner(System.in);
		
		int again;
		
		do {
			System.out.println("Enter a number : ");
			int user = scanInt.nextInt();
		
			System.out.println("Fib("+user+") = "+fibonacci(user));
		
			System.out.println("\n\nAgain ? \n(1. Again 0. Exit)\n ");
			again = scanInt.nextInt();
		
		}
		while (again == 1); 
		
		if (again == 0) {
			System.out.println("\n\nExiting!!!!");
		}
	}

}
