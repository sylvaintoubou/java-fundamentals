package lesson7;

public class Fibonacci {
	
	// Formula fib(n) = fib(n-1) + fib(n-2)
	public static int fibonacci(int n) {
		
		int result;
		System.out.println("fibonacci("+n+")");
		if (n <= 1) return n;
		else {
			result = fibonacci(n-1) + fibonacci(n -2);
			return result;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fibonacci(10));
	}

}
