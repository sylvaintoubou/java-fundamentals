package lesson8;

import java.io.Serializable;

public class User implements Serializable{
	
	static String username, userAnswer;
	static int totalScore;
	static float prizeMoney;
	static int correctQuestions = 0, questionsAttempted = 0;
	static float amount;


	public User () {
		
	}
	
	public int getQuestionsAttempted() {
		return questionsAttempted;
	}


	public void setQuestionsAttempted() {
		User.questionsAttempted = questionsAttempted + 1;
	}
	
	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		User.amount += amount;
	}
	
	public String getUserAnswer() {
		return userAnswer;
	}

	public void setUserAnswer(String userAnswer) {
		User.userAnswer = userAnswer;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		User.username = username;
	}
	public int getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(int totalScore) {
		User.totalScore += totalScore;
	}
	public float getPrizeMoney() {
		return totalScore * correctQuestions * amount;
	}
	public void setPrizeMoney(float prizeMoney) {
		User.prizeMoney = prizeMoney;
	}
	public int getCorrectQuestions() {
		return correctQuestions;
	}
	public void setCorrectQuestions() {
		User.correctQuestions = correctQuestions + 1;
	}
	

}
