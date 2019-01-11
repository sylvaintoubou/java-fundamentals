package section2.question2;

import java.util.Random;
import java.util.Scanner;

public class Game {
	
	static final int DICE_SIDES = 6;
	static int maximum_play = 0;
	
	public static void main(String[] args) {
		
		String replay = "No";
		
		User playerOne = new User();
		User playerTwo = new User();
		
		System.out.println("WELCOME TO DICE ROLLING");
		Scanner scanTurn = new Scanner(System.in);
		Scanner scanName = new Scanner(System.in);
		Scanner scanReplay = new Scanner(System.in);
		
		do {
			
			do {
				System.out.println("\n\nEnter a number of turns : \n(Should be a multiple of 2 !)");
				maximum_play = scanTurn.nextInt();
				
			} while ((maximum_play % 2) != 0);
			
			System.out.println("Enter player One's name : ");
			playerOne.setName(scanName.nextLine());
			System.out.println("Enter player Two's name : ");
			playerTwo.setName(scanName.nextLine());
			
			System.out.println("\n\nGAME STARTS!!!\n-------------------------");
			gameInteractions(playerOne, playerTwo);
			printScores(playerOne, playerTwo);
			
			System.out.println("\nDo you wish to replay ?\n(Yes/No)");
			replay = scanReplay.nextLine();
			
		}while (replay.equalsIgnoreCase("Yes"));
		
		System.out.println("GAME OVER !!!");
		
		// Closing scanners
		scanTurn.close();
		scanName.close();
		scanReplay.close();
		
	}
	
	public static void gameInteractions(User player1, User player2) {
		
		int rolled;
		
		for (int i = maximum_play; i > 0; i -= 2 ) {
			System.out.println(player1.getName() + " is rolling the dice ..." );
			rolled = rollingDice();
			System.out.println(rolled);
			player1.setScore(rolled);
			System.out.println("\n" + player1.getName() + "'s score : " + player1.getScore());
			
			System.out.println("********************\n\n");
			System.out.println(player2.getName() + " is rolling the dice ...");
			rolled = rollingDice();
			System.out.println(rolled);
			player2.setScore(rolled);
			System.out.println("\n" + player2.getName() + "'s score : " + player2.getScore() + "\n********************\n\n");
			
		}
		
	}
	
	public static int rollingDice() {
		Random dice = new Random();
		int upperSide = dice.nextInt(DICE_SIDES + 1);
		
		return upperSide;
		
	}
	
	public static void printScores(User player1, User player2) {
		
		System.out.println("SCORES ");
		System.out.println("==========================");
		
		System.out.println(player1.getName() + "'s score : " + player1.getScore());
		System.out.println(player2.getName() + "'s score : " + player2.getScore());
	}

}
