package arrayLists;

public class User {

	
	private String username;
	private int userPosition;
	
	
	
	public User(String username, int userPosition) {
		System.out.println("New player created !");
		this.username = username;
		this.userPosition = userPosition;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public int getUserPosition() {
		return userPosition;
	}



	public void setUserPosition(int userPosition) {
		this.userPosition = userPosition;
	}
	
	
	
	
}
