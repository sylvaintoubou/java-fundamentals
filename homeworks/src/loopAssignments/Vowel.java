/**
 * @author Mas73rs
 *
 */
/**
 * @description A program that asks the user to enter a letter
 * then tells the user if it is a vowel or a consonant
 */



package loopAssignments;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userInput;
		int redo = 1;
		
		// One scanner for integers another one for strings
		Scanner scanString = new Scanner(System.in);
		Scanner scanInteger = new Scanner(System.in);
		
		
		while (redo == 1){
			
			
			System.out.println("Vowel or Consonant ?\n");
			System.out.println("Type a key : ");
			userInput = scanString.nextLine();
			
			switch (userInput) {
			case "a": System.out.println(userInput+" is a vowel !");
				break;
			
			case "e": System.out.println(userInput+" is a vowel !");
				break;
				
			case "i": System.out.println(userInput+" is a vowel !");
				break;
			
			case "o": System.out.println(userInput+" is a vowel !");
				break;
			
			case "u": System.out.println(userInput+" is a vowel !");
				break;
				
			default : System.out.println(userInput+" is not a vowel !");
				break;
				
			}
			System.out.println("\n\nAgain?\n(1 for Yes 0 for No)");
			redo = scanInteger.nextInt();
			
		};
		
		if (redo == 0) System.out.println("Bye");
		
	}

}
