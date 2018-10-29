import java.util.Scanner;

public class EvenInterval {

	public static void main(String[] args) {
		System.out.println("Hello! Welcome to the EvenInterval interactive Game");
		int input;
		Scanner read = new Scanner(System.in);
		System.out.print("Enter 1 to play or -1 to exit : ");
		input = read.nextInt();
		while(input > 0) {
			switch(input) {
				case 1:{
					//this case establishes the start of the game
					System.out.print("Please enter a positive minimum number in the range: ");
					int min = read.nextInt();
					System.out.print("Please enter the positive maximum number in the range: ");
					int max = read.nextInt();
					if(min < 0 || max < 0)
						continue;
					System.out.println("Your even numbers are: ");
					for(;min <= max; min++) {
						System.out.println(min%2 == 0 ? min : "");
					}
					
				}
				break;
				default: //this is a default case, just for information
					System.out.println("Thanks for trying us out");
			}
		System.out.print("Enter 1 to play or -1 to exit");
		input = read.nextInt();
		}

	}

}
