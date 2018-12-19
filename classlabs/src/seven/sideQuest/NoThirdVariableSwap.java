package seven.sideQuest;

import java.util.Scanner;

public class NoThirdVariableSwap {

	int firstNumber,
		secondNumber;
	
	
	
	public NoThirdVariableSwap() {
		
	}

	public void userInteraction() {
		Scanner scan = new Scanner(System.in);
		System.out.println("NUMBER SWAPPING PROGRAM\n\nYou will need to enter the two numbers to be swapped!");
		System.out.println("Please enter your first number :");
		firstNumber = scan.nextInt();
		System.out.println("Enter the second one : ");
		secondNumber = scan.nextInt();
		System.out.printf("first number : %d\nSecond Number : %d\n", firstNumber, secondNumber);
		numbSwaper(firstNumber, secondNumber);
		scan.close();
	}
	
	public void numbSwaper(int firstNumber, int secondNumber) {
		
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		
		System.out.printf("first number : %d\nSecond Number : %d", firstNumber, secondNumber);
	}
}
