package tic_tac_toe;

public class Player {
	
	String playerName;
	float points;
	char seed;
	
	
	public Player(String playerName, float points, char seed) {
		super();
		this.playerName = playerName;
		this.points = points;
		this.seed = seed;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public float getPoints() {
		return points;
	}
	public void setPoints(float points) {
		this.points += points;
	}
	public char getSeed() {
		return seed;
	}
	public void setSeed(char seed) {
		this.seed = seed;
	}

	@Override
	public String toString() {
		return String.format("%s - %.1f points", getPlayerName(), getPoints());
	}
	
	

}
