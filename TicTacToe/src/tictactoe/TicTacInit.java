package tictactoe;

import java.net.UnknownHostException;
import java.util.Scanner;

import server.AppClient;
import server.AppServer;

public class TicTacInit {

	public static void main(String[] args) {
		System.out.println(args[0]);
		//startserver
		AppServer server = new AppServer("Server", 3000);//.start();
		try {
			server.start();
			AppClient client = new AppClient(server.getHost(), 3000);
			client.start();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		/*
		System.out.println("**** Welcome to TicTacToe **** ");
		System.out.print("Select a difficulty Level \n");
		System.out.println("1 - Novice \n2 - Intermediate \n3 - Expert");
		
		Scanner scanLevel = new Scanner(System.in);
		int level = scanLevel.nextInt();
		
		TicTacToe game = new TicTacToe(level * 3);
		Player playerOne, playerTwo;
		Scanner readPlayer = new Scanner(System.in);
		System.out.print("Player 1 name : ");
		playerOne = new Player(readPlayer.nextLine(), 0, 'X');
		System.out.print("\nPlayer 2 name : ");
		playerTwo = new Player(readPlayer.nextLine(), 0, 'O');
		
		Scanner readIndex = new Scanner(System.in);
		while(game.getPlays() > 0) {
			game.printBoard();
			System.out.println("Your turn "+playerOne.getPlayerName());
			int start = readIndex.nextInt();
			int end = readIndex.nextInt();
			boolean isOver = game.play(start, end, playerOne);
			if(isOver)
				break;
			System.out.println("Your turn "+playerTwo.getPlayerName());
			start = readIndex.nextInt();
			end = readIndex.nextInt();
			isOver = game.play(start, end, playerTwo);
			if(isOver)
				break;
			
		}
		System.out.println("**** Game Over **** ");
		System.out.println(playerOne);
		System.out.println(playerTwo);
		System.out.println(playerOne.getPoints() > playerTwo.getPoints() ? 
				playerOne.getPlayerName()+" Wins!" : playerTwo.getPlayerName()+" Wins!");
		*/
	}

}
