package homework;
import java.util.Scanner;

public class lesson4assignment2 {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		
		int numb1, numb2;
		System.out.println("Enter 2 numbers : ");
		numb1=user_input.nextInt();
		numb2=user_input.nextInt();
		System.out.println("Addition = "+(numb1 + numb2));
		System.out.println("Subraction = "+(numb1 - numb2));
		System.out.println("Multiplication = "+(numb1 * numb2));
		System.out.println("Division = "+(numb1 / numb2));
		System.out.println("Exponential = "+(numb1 ^ numb2));
		
	}

}
