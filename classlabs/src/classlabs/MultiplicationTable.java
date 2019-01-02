package classlabs;

import java.util.Scanner;
import static java.lang.Math.*;

public class MultiplicationTable {
	
	String title = "You are now in Multiplication Table";
	
	public void title() {
		System.out.println(title);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int runProgram;
		int tableOf;
		int multiply;
		

		System.out.println("Press 1 to enter the Multiplication Table program! \nPress 0 to exit!");
		Scanner read = new Scanner(System.in);
		runProgram = read.nextInt();
		
		// User enters the program
		if(runProgram == 1)
			System.out.println("\t\tMULTIPLICATION TABLE!\n");
			do {
				System.out.println("Enter a number to know its table: ");
				tableOf = read.nextInt();
			}while(tableOf < 0);
			for (multiply = 1;multiply <= 12;multiply++) {
				System.out.println(tableOf+" x "+multiply+" = "+(tableOf*multiply));
				
			}
			
			
		// User exits the program
		if (runProgram == 0) System.out.println("Exiting the program!");
		
		System.out.println("\n\n");
		System.out.println("Square root of 64 is: "+sqrt(64));
		System.out.println("PI is "+PI);

	}

}
