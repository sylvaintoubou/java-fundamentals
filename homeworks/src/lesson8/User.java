package lesson8;

public class User {
	
	static String username, userAnswer;
	static int totalScore;
	static float prizeMoney;
	static int correctQuestions = 0;
	static float amount;


	public User () {
		
	}
	
	
	public static float getAmount() {
		return amount;
	}

	public static void setAmount(float amount) {
		User.amount += amount;
	}
	
	public static String getUserAnswer() {
		return userAnswer;
	}

	public static void setUserAnswer(String userAnswer) {
		User.userAnswer = userAnswer;
	}
	
	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		User.username = username;
	}
	public static int getTotalScore() {
		return totalScore;
	}
	public static void setTotalScore(int totalScore) {
		User.totalScore += totalScore;
	}
	public static float getPrizeMoney() {
		return totalScore * correctQuestions * amount;
	}
	public static void setPrizeMoney(float prizeMoney) {
		User.prizeMoney = prizeMoney;
	}
	public static int getCorrectQuestions() {
		return correctQuestions;
	}
	public static void setCorrectQuestions() {
		User.correctQuestions = correctQuestions + 1;
	}
	

}
