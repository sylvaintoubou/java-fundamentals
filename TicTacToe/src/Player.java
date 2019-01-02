
public class Player {
	String playerName;
	float points;
	char seed;
	public Player (String playerName, float points,char seed) {
		super();
		this.playerName=playerName;
		this.seed=seed;
		this.points=points;
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
		this.points = points;
	}
	public char getSeed() {
		return seed;
	}
	public void setSeed(char seed) {
		this.seed = seed;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  String.format("%s - %.1f points", getPlayerName(),getPoints());
		
	}
	
}
