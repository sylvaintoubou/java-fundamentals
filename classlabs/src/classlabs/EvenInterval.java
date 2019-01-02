package classlabs;

import java.util.Scanner;

public class EvenInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Exercise 1
		
		int userMin;
		int userMax;
		
		Scanner input = new Scanner(System.in);
		
		//Asking and testing the 1rst number
		do {
			System.out.println("Please enter your first positive integer: ");
			userMin = input.nextInt();
		}while (userMin < 0) ;
		
		//ASking and testing the 2nd number
		do {
			System.out.println("Please enter your second positive integer: ");
			userMax = input.nextInt();
		}while (userMax < 0) ;
		
		
			
		for (; userMin <= userMax;userMin++) {
			if (userMin %2 == 0) System.out.println(userMin + "\n");
		}

		
		
		
		

	}

}
