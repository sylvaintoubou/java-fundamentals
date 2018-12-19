package seven.sideQuest;

import java.util.Scanner;

public class NumberToWords {

	String[] units = {"",
					"One",
					"Two",
					"Three",
					"Four",
					"Five",
					"Six",
					"Seven",
					"Eight",
					"Nine"};
	String[] teens = {"Ten",
					"Eleven",
					"Twelve",
					"Thirteen",
					"Fourteen",
					"Fifteen",
					"teen"};
	String[] tens = {"",
					"",
					"Twenty ",
					"Thirty ",
					"Forty ",
					"Fifty ",
					"ty "};
	String[] hundreds = {"Hundred",
					"Thousand",
					"Million" };
	
	
	public NumberToWords() {
		
	}
	
	public void userInteraction() {
		Scanner scan = new Scanner(System.in);
		int temp = 0;
		System.out.println("WELCOME TO NUMBER TO WORDS\n\n");
		do {
			System.out.println("Enter a number : \n");
			temp = scan.nextInt();
		}while(temp > 60);
		
		//System.out.println(temp+ " : "+toWordConverter(temp));
		System.out.println(toWordConverter(temp));
		scan.close();
		
	}
	public String toWordConverter(int numberToConvert) {
		
		if (numberToConvert == 0) return "Zero";
		else if(numberToConvert < 10) return units[numberToConvert];
		else if(numberToConvert >= 10 && numberToConvert < 16 ) return teens[numberToConvert - 10];
		else if (numberToConvert >= 16 && numberToConvert < 20) return (units[numberToConvert - 10]+teens[teens.length-1]);
		else if (numberToConvert >= 20 && numberToConvert < 60) return tens[(numberToConvert / 10)]+units[numberToConvert % 10];
			
		return "";
	}
}
