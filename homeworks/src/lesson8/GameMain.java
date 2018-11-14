package lesson8;

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
		
		
		
		Scanner word = new Scanner(System.in);
		
	
		System.out.println("Please enter a username: ");
		userInput = word.nextLine();
		User.setUsername(userInput);
		System.out.printf("Welcome %s\n", User.getUsername());
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
				User.setQuestionsAttempted();
				User.setCorrectQuestions();
				User.setTotalScore(10);
				User.setAmount(1_500f);
				
				//System.out.printf("reponses correctes: %d\n", User.getCorrectQuestions());
			} else {
				System.out.println("Wrong Answer !");
				User.setQuestionsAttempted();
				User.setTotalScore(-10);
			}
			
			
			if (User.getTotalScore() <= 0) {
				break;
			}
				
		}

		showTime();
		long endTime = System.currentTimeMillis();
		
		elapsedTime = (endTime - startTime)/1000;
		
		System.out.println("\n.....................................");
		System.out.println(User.getUsername()+ " Statistics");
		System.out.println(".....................................\n");
		System.out.println("Time To Complete: " + elapsedTime+ " seconds");
		System.out.println("Total Questions Attempted: "+User.getQuestionsAttempted());
		System.out.println("Total Correct Answers: "+User.getCorrectQuestions());
		System.out.println("Total Score: "+User.getTotalScore());
		System.out.println("Money obtained: "+User.getPrizeMoney()+ " F CFA");
		
		word.close();
	}
	
	public static void showTime() {
		Calendar calendar = Calendar.getInstance();
		System.out.printf("%1$tH:%1$tM:%1$tS\n",calendar);
	}

}
