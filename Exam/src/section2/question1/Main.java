package section2.question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int maxRows;
		System.out.println("Enter the max row : ");
		Scanner scanMax = new Scanner(System.in);
		maxRows = scanMax.nextInt();
		drawTriangle(maxRows);
		
		scanMax.close();
		
	}

	public static void drawTriangle(int maxRows) {
	    int rows = maxRows;

	    for(int i =0;i<rows;i++) {
	        int number = 1;
	        System.out.format("%"+(rows-i)*2+"s","");
	        for(int j=0;j<=i;j++) {
	             System.out.format("%4d",number);
	             number = number * (i - j) / (j + 1);

	        }
	        System.out.println();
	    }
	}
}
