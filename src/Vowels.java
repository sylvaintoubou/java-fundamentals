import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner inputInteger = new Scanner(System.in), inputString = new Scanner(System.in);
		System.out.print("Hello! Please type 1 to start or -1 to exit: ");
		int start = inputInteger.nextInt();
		if(start == -1) {
			//end game
			System.out.println("Thanks for playing!");
		}
		if(start == 1) {
			//play game
			System.out.print("\nPlease enter a character : ");
			String character = inputString.nextLine();
		
			String[] characters = {"a","e","i","o","u"};
			for(String ch : characters) {
				if(ch.equalsIgnoreCase(character)) {
					System.out.println(character+" is a vowel");
				}
			}
		}
	}

}
