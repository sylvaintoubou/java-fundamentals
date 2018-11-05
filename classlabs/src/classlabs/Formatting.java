package classlabs;

import java.util.Calendar;
import java.util.Scanner;

public class Formatting {
	
	
	public static void printTree(int i) {

		
		for (int j = 1; j <= i; j++) {
			System.out.println("\t");
			for(int k = 1; k < j; k++) {
				System.out.printf("\t%d\t", k);
			
			}
			System.out.println();
		}
	}
	
	
	public static void loopLine(int h, int maxHeight) {
		if(h > maxHeight)
			return;
		else {
			for (int i = 0; i < maxHeight - h; i++) {
				System.out.printf("\t");
			}
			for (int i = 0; i < h;) {
				System.out.printf("\t%d\t", ++i);
			}
				
			System.out.println();
			loopLine(++h, maxHeight);
			
		}
	}
	
	
	public static void dateAndTime() {
		
		// Day Month ,Year - Hour:Minute:Second AM|PM TimeZone
		Calendar calendar = Calendar.getInstance();
		System.out.printf("\n%1$tA, %1$td %1$tB %1$tY\t%tr %1$tZ\n",calendar);
		
		
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int userNomber = 6; 
		printTree(userNomber);
		*/
		
		Scanner readInput = new Scanner(System.in);
		
		int height = 0;
		//System.out.println("Enter the height of your triangle: ");
		//height = readInput.nextInt();
		//loopLine(1, height);
		//dateAndTime();
		printTree(5);
		
	}

}
