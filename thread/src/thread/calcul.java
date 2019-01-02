package thread;

import java.util.ArrayList;
import java.util.Scanner;

public class calcul {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the digit : ");
		int nombre =input.nextInt();
		int original = nombre;
		int reste =1;
		//System.out.println(reste);
		int product = 1, sum =0;
		for( ;nombre!=0; ) {
			reste=nombre % 10;
			sum += reste;
			product *= reste;
			nombre = nombre / 10;
		}
		System.out.printf("%d %s", original, product == sum ? " is a spy number" : " is not a spy number");
	}

}
