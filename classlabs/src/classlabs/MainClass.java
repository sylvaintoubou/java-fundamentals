package classlabs;

import java.util.Random;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("GAPFUL NUMBER DETECTION");
		String test = "";
		do {
			System.out.print("Hello Please enter A NUMBER : ");
			test = inputScanner.nextLine();
			boolean result = isGapful(test);
			System.out.println(test+ (result ? " is a gapful number" : " is not  gapful number"));
		}while(test.length() >= 3);
		
	}

	private static boolean isGapful(String test) {
		Character firstNumber = test.charAt(0);
		Character lastNumber = test.charAt(test.length()-1);
		int fullNumber = Integer.parseInt(test);
		return fullNumber % Integer.parseInt(String.valueOf(firstNumber.toString()+lastNumber.toString())) == 0;
	}
	
	private static int[][] rotateMatrix(int[][] x, int deg) {
		
		int rotatingFactor = deg/90; //rotating factor as as multiple of 90
		int[][] tmp = new int[x.length][x.length];
		for(int i=0; i < x.length; i++) {
			for(int k=0; k<x[i].length; k++)
				tmp[i][x[i].length - rotatingFactor] = x[i][k];
		}
		return tmp;
	}

}
