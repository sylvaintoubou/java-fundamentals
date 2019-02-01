import java.util.Scanner;

public class javaOperators1 {

	public static void main(String[] args) {
	
		int a=10, b = 5, c=3;
		float answer = (a + b);
		float result = a-b;
		float times = a*b;
		float divide = a/b;
		float div=a/c;
		float mod=a%c;
	
		System.out.println("sum of a and b = "+answer);
		System.out.println("difference of a and b = " +result);
		System.out.println("a multiplied by b = "+times);
		System.out.println("a divided by b = "+divide);
		System.out.println("a divided by c = " +div);
		System.out.println("a modulus c = " +mod);
		System.out.println(a++); //increment later
		System.out.println(++a); //instant increment
		System.out.println(a--);
		System.out.println(--a);
		System.out.println(a==b); // equal to
		System.out.println(a!=b); // not equal to
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a); //Bitwise complement
		System.out.println(b<<2); //Bitwise operator-left shift
		
		Scanner input = new Scanner(System.in);
		System.out.println("Hello what is your name? ");
		String inputString = input.nextLine(); //reads a string from the user as input
		System.out.println("Welcome, "+inputString);
		
		System.out.println("How old are you "+inputString+" ? " );
		int inputint = input.nextInt(); //reads an int from the user as input
		System.out.println("You are "+inputint+" years old");
		
		int z=4*(a++)-1+5-(3*2);
		System.out.println(z);
		
		
		
		
		
		
		
		
		
		
	}

}
