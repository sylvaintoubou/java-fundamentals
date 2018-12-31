package tic_tac_toe;

import java.util.ArrayList;
import java.util.Scanner;

import seven.sideQuest.Player;

public class Board {

	private static String[][] board = {{" ", " ", " "},{" ", " ", " "},{" ", " ", " "}} ;
	
	public Board() {
		
	}
	
	
	public void printBoard() {
		
		//board[0][1] = "";
		
		System.out.println("\n\n");
		System.out.println("  1   2   3");
		System.out.println("+---+---+---+");
		System.out.println("| " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |" + " A" );
		System.out.println("-------------");
		System.out.println("| " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |" + " B" );
		System.out.println("-------------");
		System.out.println("| " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |" + " C" );
		System.out.println("+---+---+---+");
	}
	
	public void movement(Player player) {
		
		
	}

}
