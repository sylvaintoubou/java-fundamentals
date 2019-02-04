package org.toubou;

import java.util.Scanner;

public class lesson5Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a min value:");
		 x = input.nextInt(); // reads a string from the user as input 
		System.out.println("You entered min is: " +x);
	   while(x>0) {
			for(int i=1;i<=12;i++)
				System.out.println(x+" x " +i +" = " +(x*i));
			 x = input.nextInt(); // reads a string from the user as input 
				System.out.println("You entered min is: " +x);
				if (x==-1) break;
		} ;
	}

}
