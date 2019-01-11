package section2.question2;

public class User {

	private String name;
	private int score = 0,
			    id;
	
	public User() {
		
	}

	public User(String name, int id) {
		this.name = name;
		this.id = id;
	}

	// Getters
	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public int getId() {
		return id;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setScore(int score) {
		this.score += score;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	
}
