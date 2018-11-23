package lesson8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		
		String userInput;
		final int QUESTIONS_SET_TO = 5;
		int index;
		String question, answer;
		
		ArrayList<Integer> indexesAlreadyTaken = new ArrayList<>();
		
		String [][] questionnaire = {
			{	
			"Who is the President of Cameroon ? ",
			"How many administratives divisions does Cameroon have ? ",
			"Which of the following is the most populated town ? ",
			"When did Cameroon gained its independance ? ",
			"What is the total area of Cameroon in square kilometers ? ",
			},
			{
				"b", "d", "c", "b", "b"
			}
		};
		
		int nbQuestions = questionnaire[0].length;
		User user = new User();
		ResumeGame save1 = new ResumeGame();
		
		
		Scanner word = new Scanner(System.in);
		
	
		System.out.println("Please enter a username: ");
		userInput = word.nextLine();
		user.setUsername(userInput);
		System.out.printf("Welcome %s\n", user.getUsername());
		System.out.println();
		showTime();
		long startTime = System.currentTimeMillis(), elapsedTime;
		
		
		
		for (int i = 0 ; i  < QUESTIONS_SET_TO; i++) {
			
			do {
				Random random = new Random();
				index = random.nextInt(nbQuestions);
			}while(indexesAlreadyTaken.contains(index));
			
			indexesAlreadyTaken.add(index);
			
			
			question = questionnaire[0][index];
			answer = questionnaire[1][index];
			
			System.out.println(question);
			//user1.setUserAnswer(userInput);
			String userAnswer = word.nextLine();
			
			if (answer.equalsIgnoreCase(userAnswer)) {
				System.out.println("Correct Answer !");
				user.setQuestionsAttempted();
				user.setCorrectQuestions();
				user.setTotalScore(10);
				user.setAmount(1_500f);
				
				System.out.println("\n\n\nPress X to save and exist");
				String save = word.next();
				if(save.equalsIgnoreCase("x")) {
					break;
				}
				
				//System.out.printf("reponses correctes: %d\n", User.getCorrectQuestions());
			} else {
				System.out.println("Wrong Answer !");
				user.setQuestionsAttempted();
				user.setTotalScore(-10);
			}
			
			
			if (user.getTotalScore() < 0) {
				System.out.println("End of the game! Your score is "+user.getTotalScore()+ " (negative)");
				break;
			}
				
				
		}
		
		if(user.getTotalScore() > 0) {
			try {
				save1.saveGame(user);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println();
		showTime();
		long endTime = System.currentTimeMillis();
		
		elapsedTime = (endTime - startTime)/1000;
		
		System.out.println("\n.....................................");
		System.out.println(user.getUsername()+ " Statistics");
		System.out.println(".....................................\n");
		System.out.println("Time To Complete: " + elapsedTime+ " seconds");
		System.out.println("Total Questions Attempted: "+user.getQuestionsAttempted());
		System.out.println("Total Correct Answers: "+user.getCorrectQuestions());
		System.out.println("Total Score: "+user.getTotalScore());
		System.out.println("Money obtained: "+user.getPrizeMoney()+ " F CFA");
		
		word.close();
	}
	
	public static void showTime() {
		Calendar calendar = Calendar.getInstance();
		System.out.printf("%1$tH:%1$tM:%1$tS\n",calendar);
	}
	
	

}
