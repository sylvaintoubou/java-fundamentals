package seven.sideQuest;

public class Player {

	private String name;
	private int column;
	private int row;
	private String seed;
	private static char[][] board;
	
	public Player(String name, String seed) {
		this.name = name;
		this.seed = seed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public String getSeed() {
		return seed;
	}

	public void setSeed(String string) {
		this.seed = string;
	}

	public static char[][] getBoard() {
		return board;
	}

	public static void setBoard(char[][] board) {
		Player.board = board;
	}
	
	
	
	
	
}
