package tictactoe;

public class Player {

	String playerName;
	float points;
	char seed;
	
	public Player(String playerName, float points, char seed) {
		this.playerName = playerName;
		this.points = points;
		this.seed = seed;
	}
	
	protected String getPlayerName() {
		return playerName;
	}
	protected void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	protected float getPoints() {
		return points;
	}
	/**
	 * Cumulative point setter
	 * @param points to add to user's current points
	 */
	protected void setPoints(float points) {
		this.points += points;
	}
	protected char getSeed() {
		return seed;
	}
	protected void setSeed(char seed) {
		this.seed = seed;
	}

	@Override
	public String toString() {
		return String.format("%s - %.1f points", getPlayerName(), getPoints());
	}
	
	
}
