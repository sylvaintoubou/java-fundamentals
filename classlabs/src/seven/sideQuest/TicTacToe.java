package seven.sideQuest;

import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToe {

	private static char[][] board = new char[3][3] ;
	
	public TicTacToe() {

		for (int rows = 0; rows < board.length; rows ++) {
			for (int columns = 0; columns < board.length; columns++) {
				board[rows][columns] = ' ';
			}
		}
		board[0][0] = 'X';
	}
	public static void deplacement() {
		ArrayList dep=new ArrayList();
		Scanner input= new Scanner(System.in);
		Player player1 = new Player("player1", 'x');
		System.out.println("player1 enter your deplacement row");
		int row = input.nextInt();
		System.out.println("player1 enter your deplacement column");
		int column = input.nextInt();
		row = player1.getRow();
		column = player1.getColumn();
		board[row][column] = 'x';
		dep.add(board);
		if(dep.contains(board)==true) {
			System.out.println("ce mouvement a deja ete utiliser");
		}
		printBoard();
	}
/*	public static void deplacementPlayer1() {
		char a=board[0][0]='X';
		char b=board[0][1] = 'X';
		char c=board[0][2] = 'X';
		char e=board[1][0] = 'X';
		char f=board[1][1] = 'X';
		char g=board[1][2] = 'X';
		char h=board[2][0] = 'X';
		char i=board[2][1] = 'X';
		char j=board[2][2] = 'X';
		String [] a1= {"board[0][0]","[0][1]","[0][2]","[1][0]","[1][1]","[1][2]","[2][0]","[2][1]","[2][2]"};
	}
	public void deplacementPlayer2() {
		board[0][0] = 'y';
		board[0][1] = 'y';
		board[0][2] = 'y';
		board[1][0] = 'y';
		board[1][1] = 'y';
		board[1][2] = 'y';
		board[2][0] = 'y';
		board[2][1] = 'y';
		board[2][2] = 'y';
	}*/
	

	public static void printBoard() {
		System.out.println("  1   2   3");
		System.out.println("+---+---+---+");
		System.out.println("| " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |" + " A" );
		System.out.println("-------------");
		System.out.println("| " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |" + " B" );
		System.out.println("-------------");
		System.out.println("| " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |" + " C" );
		System.out.println("+---+---+---+");
	}
	
	public static void main(String[] args) {
		Player player1 = new Player("player1", 'x');
		Player player2 = new Player("player2", 'y');
		System.out.println("choisissez votre deplacement");
		deplacement();
		new TicTacToe();
	}
}
