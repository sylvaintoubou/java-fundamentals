package lesson8;

public class Answers {

	private char id;
	private boolean correctAnswerId;
	private String name;
	
	public Answers(char id, boolean i, String name) {
		this.id = id;
		this.correctAnswerId = i;
		this.name = name;
	}

	public char getId() {
		return id;
	}

	public void setId(char id) {
		this.id = id;
	}

	public boolean getCorrectAnswerId() {
		return correctAnswerId;
	}

	public void setCorrectAnswerId(boolean correctAnswerId) {
		this.correctAnswerId = correctAnswerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
