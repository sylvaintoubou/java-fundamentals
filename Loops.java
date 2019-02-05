package homework;

import java.util.Scanner;
public class Loops {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	/*// lesson 5 Decisions and loops
		for(int counter = 0; counter < 10; counter++)// must have two semi colons 
		{
			System.out.println(counter);
		}
	// another option
		int counter = 0;
		for (; counter < 10;) // must have 2 semi-colons
		{
			System.out.println(counter++);
		}
	//counts down from 10 to 0	
		for(int y=10; y >=0; y--)
		{
			System.out.println(y);
		}
		int count = 10;
		for (;;) {
			if(count >=0){
					System.out.println(count--);
					break;
			}
		}
		int score = 10;
		while(score !=0) {
			System.out.println(score--);
		}*/
		/*
		 * int score = 10; do { System.out.println(score--); }while(score >=0);
		 */
		/*
		 * int target = 10; while(target<=10) {
		 * System.out.println("Game continues "+target--); if(target==0)return;
		 * if(target%5==0)continue; System.out.println("Continueing"); }
		 */
		/*
		 * String[]names= {"Tom","Jerry","Lucy"}; for(String name:names) {
		 * System.out.println("Name:"+name); }
		 */
		/*
		 * String[]names= {"Tom","Jerry","Lucy"}; for(int i=0; i<3;i++) {
		 * System.out.println("Name : "+names[i]); }
		 */
		/*
		 * int b = 9; if(b % 2 != 0) { System.out.println("Odd number");
		 * 
		 * }else System.out.println("Even number");
		 */
		/*
		 * int score = 0; switch(score ) { case 0:System.out.println("Score 0");break;
		 * case 1:System.out.println("Score 1");break; }
		 */
	
		/*
		 * switch (9%2) { case 0: System.out.println("Even number");break; case 1:
		 * System.out.println("Odd number");break; }
		 */

		/*
		 * int number, numb; System.out.println("Input first number : "); number =
		 * input.nextInt(); System.out.println("Input second number : "); numb =
		 * input.nextInt(); if (number <0) { System.out.println("Out of range"); }
		 * 
		 * System.out.println("Even numbers between "+number+ "and"+numb+"="); for(int
		 * y=number; y >=numb; y--) { System.out.println(y--); }
		 */
		
		
		int x = 1, y;
		
		System.out.println("Type in your number :");
		y = input.nextInt();
		System.out.println(y+" x "+x+" = "+(y * x));
		x=x+1;
		while(x !=13){
			System.out.println(y+" x "+(x++)+" = "+(x-1)*y);
		}
		
		 
		
	}
}	
	

