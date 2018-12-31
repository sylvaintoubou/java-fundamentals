package tic_tac_toe;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("**** Welcome to TicTacToe ****");
		System.out.println("select a difficulty level \n");
		System.out.println("1 - Novice \n"
						+ "2 - Intermediate \n"
						+ "3 - Professional \n"
						+ "4 Expert \n"
						+ "5 - Legendary");
		
		Scanner scanLevel = new Scanner(System.in);
		int level = scanLevel.nextInt();
		
		TicTacToe game = new TicTacToe(level * 3);
		Player playerOne, playerTwo;
		Scanner readPlayer = new Scanner(System.in);
		System.out.println("player 1 name : ");
		playerOne = new Player(readPlayer.nextLine(), 0, 'X');
		System.out.println("Player 2 name : ");
		playerTwo = new Player(readPlayer.nextLine(), 0, 'O');
		
		Scanner readIndex = new Scanner(System.in);
		while(game.getPlays() > 0) {
			game.printBoard();
			System.out.println("Your turn " + playerOne.getPlayerName());
			int start = readIndex.nextInt();
			int end = readIndex.nextInt();
			boolean isOver = game.play(start, end, playerOne);
			if(isOver)
				break;
			System.out.println("Your turn " + playerTwo.getPlayerName());
			start = readIndex.nextInt();
			end = readIndex.nextInt();
			isOver = game.play(start, end, playerTwo);
			if(isOver)
				break;
		}
		System.out.println("**** Game Over ****");
		System.out.println(playerOne);
		System.out.println(playerTwo);
		
		scanLevel.close();
		readIndex.close();
		readPlayer.close();

	}

}
