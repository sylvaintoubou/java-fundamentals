package seven.lesson16;

import java.util.Scanner;

public class Test {


	public static void main(String[] args) {

		/*
		StringBuilder builder1 = new StringBuilder(); // Empty constructor
		
		StringBuilder builder2 = new StringBuilder(6); // Constructor that specifies the capacity
		
		StringBuilder builder3 = new StringBuilder("Je ne suis pas ton bonbon"); // Charsequence parameter based constructor
		
		StringBuilder builder4 = new StringBuilder("Builder"); // String based constructor with a capacity of the lenght of the string plus 16
		
	
		System.out.printf("characters %s\nCapacity %d \nLenght %d", builder1.toString(), builder1.capacity(), builder1.length());
		System.out.printf("characters %s\nCapacity %d \nLenght %d", builder2.toString(), builder2.capacity(), builder2.length());
		System.out.printf("characters %s\nCapacity %d \nLenght %d", builder3.toString(), builder3.capacity(), builder3.length());
		System.out.printf("characters %s\nCapacity %d \nLenght %d", builder4.toString(), builder4.capacity(), builder4.length());
		*/
		
		/*
		printStringBuilder(builder1);
		printStringBuilder(builder2);
		printStringBuilder(builder3);
		printStringBuilder(builder4);
		*/
		
		/*
		// builder4.setLength(10);
		builder4.setCharAt(5, 'e');
		System.out.println();
		
		Integer myInt = new Integer(10);
		Integer myInt2 = new Integer(16);
		String myStr = String.valueOf(myInt2);
		Integer myInt3 = Integer.valueOf(myStr, 2);
		//System.out.printf("%d \n%f \n%f \n%d \n", myInt.byteValue(), myInt.floatValue(), myInt.doubleValue(), myInt.longValue());
		System.out.println(myInt.compareTo(myInt2));
		System.out.println(myStr instanceof String);
		System.out.println(myInt3);
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word to be tested: ");
		String userInput = scan.nextLine();
		
		StringBuilder pulled = new StringBuilder(userInput);
		StringBuilder reversed = new StringBuilder(pulled.reverse());
		//StringBuilder comparer = new StringBuilder();
		//System.out.println(reversed);
		System.out.printf("Is %s a palindrom? %b", userInput, isPalindrom(pulled, reversed));
	
	}
	

	private static void printStringBuilder(StringBuilder builder1) {
		StringBuilder builder = null;
		String display = String.format("characters %s\nCapacity %d \nLenght %d", builder.toString(), builder.capacity(), builder.length());
		System.out.println();
	}
	
	public static boolean isPalindrom (StringBuilder build1, StringBuilder build2) {
		return build1.equals(build2);
	}

}
