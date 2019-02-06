package org.toubou;

import java.util.Scanner;

public class Lesson5Ass1b {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x,y,z;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value corresponding to the operation:"+"\n"
				+ "1 for addition" +"\n"
				+ "2 for multiplication" +"\n"
				+ "3 for division" +"\n"
				+ "4 for subtraction" +"\n"
				+ "5 for exponentiation" +"\n"
				+ "0 if you want to exit");
		 x = input.nextInt(); // reads a string from the user as input 
		System.out.println("You entered operation is: " +x +"\n");
	 while(x>=0) {
		 
		 if (x==0) break;
		 switch(x) {
		 
		 case 1: System.out.println("You choosed addition operation"+"\n");
		         System.out.println("Entered the first operand"+"\n");
		         y = input.nextInt(); // reads a string from the user as input 
		 		System.out.println("Your first operand is: " +y +"\n");
		 		System.out.println("Entered the second operand"+"\n");
		         z = input.nextInt(); // reads a string from the user as input 
		 		System.out.println("Your second operand is: " +y +"\n");
		 		System.out.println(y+" + " +z +" is: " +(y+z) +"\n");
		 		break;
		 case 2: 
			 System.out.println("You choosed multiplication operation"+"\n");
	         System.out.println("Entered the first operand"+"\n");
	         y = input.nextInt(); // reads a string from the user as input 
	 		System.out.println("Your first operand is: " +y +"\n");
	 		System.out.println("Entered the second operand"+"\n");
	         z = input.nextInt(); // reads a string from the user as input 
	 		System.out.println("Your second operand is: " +y +"\n");
	 		System.out.println(y+" * " +z +" is: " +(y*z) +"\n");
	 		break;
		 case 3: 
			 System.out.println("You choosed division operation"+"\n");
	         System.out.println("Entered the first operand"+"\n");
	         y = input.nextInt(); // reads a string from the user as input 
	 		System.out.println("Your first operand is: " +y +"\n");
	 		System.out.println("Entered the second operand"+"\n");
	         z = input.nextInt(); // reads a string from the user as input 
	 		System.out.println("Your second operand is: " +y +"\n");
	 		System.out.println(y+" / " +z +" is: " +(y/z) +"\n");
	 		break;
		 case 4: 
			 System.out.println("You choosed subtraction operation"+"\n");
	         System.out.println("Entered the first operand"+"\n");
	         y = input.nextInt(); // reads a string from the user as input 
	 		System.out.println("Your first operand is: " +y +"\n");
	 		System.out.println("Entered the second operand"+"\n");
	         z = input.nextInt(); // reads a string from the user as input 
	 		System.out.println("Your second operand is: " +y +"\n");
	 		System.out.println(y+" - " +z +" is: " +(y-z) +"\n");
	 		break;
		 case 5: 
			 System.out.println("You choosed exponentiation operation"+"\n");
	         System.out.println("Entered the number"+"\n");
	         y = input.nextInt(); // reads a string from the user as input 
	 		System.out.println("Your number is: " +y +"\n");
	 		System.out.println("Entered the exponent"+"\n");
	         z = input.nextInt(); // reads a string from the user as input 
	 		System.out.println("Your exponent is: " +y +"\n");
	 		System.out.println(y+" ^ " +z +" is: " +(Math.pow(y,z)) +"\n");
	 		break;
		 default: System.out.println("The value choosed doesn't match with any operation"+"\n");
		         break;
		 }
	      System.out.println("Enter a value corresponding to the operation:"+"\n"
				+ "1 for addition" +"\n"
				+ "2 for multiplication" +"\n"
				+ "3 for division" +"\n"
				+ "4 for subtraction" +"\n"
				+ "5 for exponentiation" +"\n"
				+ "0 if you want to exit");
		 		x = input.nextInt(); // reads a string from the user as input 
				System.out.println("You entered operation is: " +x +"\n");
		        
		 
 }
}
}
