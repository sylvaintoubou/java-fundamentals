package lesson7;

import java.util.ArrayList;
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
	
	public static int iteratedFibonacci(int n) {
		
		int result = n == 1 ? 1 : 0;
		int x = n-1, y=n-2;
		while(x > 0 && y >= 0) {
			x = y--;
			result += ++x + y;
		}
		
		/*for(int i = n; i > 0 ; i--) {
			if (result  == 1) break;
			else result +=  (i - 1) + (i - 2); 
		}*/
		
		return result;
	}
	
	public static int iFibonacci(int user) {
		
		if (user == 1) return 1;
		int fib = 1;
		int prev = 1;
		
		for (int i = 2; i < user; i++) {
			int temp = fib;
			fib += prev;
			prev = temp;
		}
		
		return fib;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanInt = new Scanner(System.in);
		Scanner scanCont = new Scanner(System.in);
		
		int again;
		
		do {
			System.out.println("Enter a number : ");
			int user = scanInt.nextInt();
		
			System.out.println("Fib("+user+") = "+iFibonacci(user));
		
			System.out.println("\n\nAgain ? \n(1. Again 0. Exit)\n ");
			again = scanInt.nextInt();
		
		}
		while (again == 1); 
		
		if (again == 0) {
			System.out.println("\n\nExiting!!!!");
		}
	}

}
