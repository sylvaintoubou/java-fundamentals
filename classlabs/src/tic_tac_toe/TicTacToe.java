package tic_tac_toe;

public class TicTacToe {

/*	Player player1 = new Player("player1", " ");
	Player player2 = new Player("player2", " ");
	private static String[][] board = new String[3][3] ;
	
	public TicTacToe() {

		for (int rows = 0; rows < board.length; rows ++) {
			for (int columns = 0; columns < board.length; columns++) {
				board[rows][columns] = " ";
			}
		}
		deplacement(player1);
		System.out.println();
		printBoard();
		
	}
	public static void deplacement(Player p) {
		ArrayList dep=new ArrayList();
		Scanner input= new Scanner(System.in);
		Player player1 = new Player("player1", " ");
		System.out.println("player1 enter your deplacement row");
		p.setRow(input.nextInt());
		System.out.println("player1 enter your deplacement column");
		p.setColumn(input.nextInt());
		System.out.println("Choose your seed |  X  or O");
		p.setSeed(input.nextLine());
		System.out.println();
		board[p.getRow()][p.getColumn()] = p.getSeed();
		dep.add(board);
		//if(dep.contains(board)==true) {
		//	System.out.println("ce mouvement a deja ete utiliser");
		//}
		
	}
	public static void deplacementPlayer1() {
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
	}
	

	public static void printBoard() {
		System.out.println("  1   2   3");
		System.out.println("+---+---+---+");
		System.out.println("| " + board[0][0] + " | " + board[0][1] + "  |" + board[0][2] + " |" + " A" );
		System.out.println("-------------");
		System.out.println("| " + board[1][0] + " | " + board[1][1] + " |" + board[1][2] + " |" + " B" );
		System.out.println("-------------");
		System.out.println("| " + board[2][0] + " | " + board[2][1] + " |" + board[2][2] + " |" + " C" );
		System.out.println("+---+---+---+");
	}
	
	public static void main(String[] args) {
		
		System.out.println("choisissez votre deplacement");
		
		new TicTacToe();
	}*/
	
	char[][] board;
	int plays;
	
	public TicTacToe(int boardSize) {
		plays = boardSize * boardSize;
		board = new char [boardSize][boardSize];
		
		// Initialize the playing board to a square matrix
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j  < board[i].length;) {
				board[i][j++] = ' ';
			}
		}
	}
	
	// Make a play/move from this player
	public boolean play(int index, int end, Player player) {
		try {
			if(plays == 0) {
				
				// Game over, no more moves available
				printBoard();
				return false;
			}
			if(board[index][end] == ' ') {
				board[index][end] = player.seed;
				plays--;
				boolean gameOver = checkBoard(player);
				printBoard();
				return gameOver;
				
			} else {
				System.out.println("Entry occupied Please play elsewhere");
				printBoard();
				return false;
				
			}
			
		} catch (IndexOutOfBoundsException ioe) {
			ioe.printStackTrace();
			System.out.println("Invalid index (" + index + " , " + end + "). Please play in a valid field");
			return false;
		}
		
	}
	
	private boolean checkBoard(Player player) {
		boolean isLine = true;
		
		// testing horizontal lines/edges between adjacents vertices
		for(int i = 0; i < board.length; i++) {
			isLine = true;
			for(int j = 0; j < board[i].length;) {
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
			
		// testing vertical lines/edges between adjacent vertices
		for(int i = 0; i < board.length; i++) {
			isLine = true;
			for(int j = 0; j < board[i].length;) {
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
			
		// Testing leading diagonal lines/edges between adjacent vertices
		for(int i = 0; i < 2; i++) {
			isLine = true;
			for(int j = 0; j < board[i].length;) {
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
			
		// Testing off diagonal lines/edges between adjacent vertices
		isLine = true;
		for(int j = 0, i = board.length; j < board.length;) {
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
		

	public char[][] getBoard() {
		return board;
	}

	public void setBoard(char[][] board) {
		this.board = board;
	}

	public int getPlays() {
		return plays;
	}

	public void setPlays(int plays) {
		this.plays = plays;
	}
	
	// Display current state of the board
	public void printBoard() {
		for(int i  = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				System.out.print("| " + board[i][j]);
			}
			System.out.print("|\n");
			for(int j = 0; j < board[i].length; j++)
				System.out.print("_ _");
			System.out.println();
		}
		System.out.println("================================");
	}
}
