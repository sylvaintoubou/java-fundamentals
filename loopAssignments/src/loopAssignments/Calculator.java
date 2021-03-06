/**
 * @author Mas73rs
 *
 */
/**
 * @description
 * A calculator with 5 operations:
 * addition
 * subtraction
 * multiplication
 * division
 * exponentiation
 *
 */
/**
 * Exponentiation has been updated with the Math.pow
 *
 */



package loopAssignments;

import java.util.Scanner;
import java.lang.Math;





public class Calculator {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		int operation;
		int numb1;
		int numb2;
		int cont;

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Press to 1 start : ");
		cont = input.nextInt();

		System.out.println("\tWelcome to Calculat0r!!\n\n\n\n");
		
		while(cont == 1) {
				
			System.out.println("\nWhich operation would you want to access ? ");
			System.out.println("1. Addition \n2. Multiplication \n3. Division \n4. Substraction \n5. Exponentiation");
				
			operation = input.nextInt();
			switch (operation) {
				case 1: {
					System.out.println("\tADDITION.");
					
					// Getting 2 numbers the user
					System.out.println("Choose a your first number : ");
					numb1 = input.nextInt();
					System.out.println("Choose your second number  : ");
					numb2 = input.nextInt();
					
					// Printing the result
					System.out.println(numb1+" + "+numb2+" = " +(numb1+numb2));
						
				};
				break;
					
				case 2: {
					System.out.println("\tMULTIPLICATION.");
					
					// Getting 2 numbers the user
					System.out.println("Choose a your first number : ");
					numb1 = input.nextInt();
					System.out.println("Choose your second number  : ");
					numb2 = input.nextInt();
					
					// Printing the result
					System.out.println(numb1+" x "+numb2+" = " +(numb1*numb2));
					
				};
				break;
				
				case 3: {
					System.out.println("\tDIVISION.");
					
					// Getting 2 numbers the user
					System.out.println("Choose a your first number : ");
					numb1 = input.nextInt();
					System.out.println("Choose your divider  : ");
					numb2 = input.nextInt();
					
					// Testing if the divider = 0
					if (numb2 == 0) {
						System.out.println("Is it possible to divide by 0?\nEnter a divider different from 0!");
						numb2 = input.nextInt();
						
					}
					
					// printing the result
					System.out.println(numb1+" / "+numb2+" = " +(numb1/numb2));
						
				};
				break;
				
				case 4: {
					System.out.println("\tSUBSTRACTION.");
					
					// Getting 2 numbers the user
					System.out.println("Choose a your first number : ");
					numb1 = input.nextInt();
					System.out.println("Choose your second number  : ");
					numb2 = input.nextInt();
					
					// Printing the result
					System.out.println(numb1+" - "+numb2+" = " +(numb1-numb2));
						
				};
				break;
				
				case 5: {
					
					
					System.out.println("\tEXPONENTIATION.");
					
					// Getting 2 numbers from the user
					System.out.println("Choose a your first number : ");
					numb1 = input.nextInt();
					System.out.println("Choose your second number  : ");
					numb2 = input.nextInt();
					//int result = 1;
					
					/*
					for (int i = 0; i < numb2; i++) {
						result *= numb1;
					}
		
					System.out.println(numb1+" ^ "+numb2+" = " +result);
					*/
					
					System.out.println(numb1+" ^ "+numb2+" = "+Math.pow(numb1, numb2));
					
					
				};
				break;
					
			}
			System.out.println("Do you wish another operation?\nPress 1 to continue : \n(But if you wish to exit press 0!)");
			cont = input.nextInt();

		}
			
		for (;cont != 1 && cont != 0;) {
			System.out.println("Press 1 to continue : \n(But if you wish to exit press 0!)");
			cont = input.nextInt();
		};
						
		System.out.println("See you later!\n\nExiting!!!");

		
	}

}
