package tictactoe;

public class TicTacToe {
	
	char[][] board;
	int plays;
	
	public TicTacToe(int boardSize){
		plays = boardSize*boardSize;
		board = new char[boardSize][boardSize];
		//initialize the playing board to a square matrix/graph
		for(int i=0; i< board.length; i++) {
			for(int j=0; j< board[i].length;)
				board[i][j++] = ' ';
		}
	}
	
	//make a play/move from this player
	public boolean play(int index, int end, Player player) {
		try {
			if(plays == 0) {
				//game over, no more places to play
				printBoard();
				return false;
			}
			if(board[index][end] == ' ') {
				board[index][end] = player.seed;
				plays--; //valid play so we check the board and print current state
				boolean gameOver = checkBoard(player);
				printBoard();
				return gameOver;
			}
			else {
				System.out.println("Entry occupied. Please play elsewhere");
				printBoard();
				return false;
			}
		}catch(IndexOutOfBoundsException ioe) {
			System.out.println("Invalid index. Please play on a valid field");
			return false;
		}
	}

	/**
	 * Check if player has completed a line or there's no more place to play
	 * @param player
	 */
	private boolean checkBoard(Player player) {
		boolean isLine = true;
		//testing horizontal lines/edges between adjacent vertices
		for(int i=0; i < board.length; i++) {
			isLine = true;
			for(int j=0; j< board[i].length; ) {
				if(board[i][j++] != player.seed) {
					isLine &= false;
					break;
				}
			}
			if(isLine)
				break;
		}
		if(isLine) {
			player.setPoints(board.length * 2);
			return isLine;
		}
		//testing vertical lines/edges between adjacent vertices
		for(int i=0; i < board.length; i++) {
			isLine = true;
			for(int j=0; j< board[i].length; ) {
				if(board[j++][i] != player.seed) {
					isLine &= false;
					break;
				}	
			}
			if(isLine)
				break;
		}
		if(isLine) {
			player.setPoints(board.length * 2);
			return isLine;
		}
		//testing leading diagonal lines/edges between adjacent vertices
		for(int i=0; i < 2; i++) {
			isLine = true;
			for(int j=0; j< board[i].length; ) {
				if(board[j][j++] != player.seed) {
					isLine &= false;
					break;
				}		
			}
			if(isLine)
				break;
		}
		if(isLine) {
			player.setPoints(board.length * 2);
			return isLine;
		}
		//testing off diagonal lines/edges between adjacent vertices
		isLine = true;
		for(int j=0, i= board.length-1 ; j < board.length; ) {
			if(board[j++][i--] != player.seed) {
				isLine &= false;
				break;
			}		
		}
		if(isLine) {
			player.setPoints(board.length * 2);
			return isLine;
		}

		return isLine;
	}

	public int getPlays() {
		return plays;
	}
	
	//display current state of the board
	public void printBoard() {
		for(int i=0; i< board.length; i++) {
			for(int j=0; j< board[i].length; j++)
				System.out.print("| "+board[i][j]);
			System.out.print("|\n");
			for(int j=0; j< board[i].length; j++)
				System.out.print("_ _");
			System.out.println();
		}
		System.out.println("=========");
	}
}
