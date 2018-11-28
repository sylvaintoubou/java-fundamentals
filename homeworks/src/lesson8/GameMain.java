package lesson8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class GameMain {
	

	public static void main(String[] args) {
		
		/*
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
		*/
		
		
		Question question1 = new Question(1, "Who is the President of Cameroon ?");
		Answers answer1_1 = new Answers('a', false,"Maurice Kamto" );
		Answers answer1_2 = new Answers('b', true,"Paul Biya" );
		Answers answer1_3 = new Answers('c', false,"Cabral Libii" );
		Answers answer1_4 = new Answers('d', false,"Joshua Oshi" );
		
		Answers[] set1 = new Answers[4];
		set1[0] = answer1_1;
		set1[1] = answer1_2;
		set1[2] = answer1_3;
		set1[3] = answer1_4;
		
		QnA.addToMap(question1, set1);
		
		Question question2 = new Question(2, "How many administratives divisions does Cameroon have ?");
		Answers answer2_1 = new Answers('a', false,"15" );
		Answers answer2_2 = new Answers('b', false,"12" );
		Answers answer2_3 = new Answers('c', false,"8" );
		Answers answer2_4 = new Answers('d', true,"10" );
		
		Answers[] set2 = new Answers[4];
		set2[0] = answer2_1;
		set2[1] = answer2_2;
		set2[2] = answer2_3;
		set2[3] = answer2_4;
		
		QnA.addToMap(question2, set2);
		
		Question question3 = new Question(3, "Which of the following is the most populated town ?");
		Answers answer3_1 = new Answers('a', false,"Yaounde" );
		Answers answer3_2 = new Answers('b', false,"Bafoussam" );
		Answers answer3_3 = new Answers('c', true,"Douala" );
		Answers answer3_4 = new Answers('d', false,"Bamenda" );
		
		Answers[] set3 = new Answers[4];
		set3[0] = answer3_1;
		set3[1] = answer3_2;
		set3[2] = answer3_3;
		set3[3] = answer3_4;
		
		QnA.addToMap(question3, set3);
		
		Question question4 = new Question(4, "When did Cameroon gained its independance ?");
		Answers answer4_1 = new Answers('a', false,"1950" );
		Answers answer4_2 = new Answers('b', true,"1960" );
		Answers answer4_3 = new Answers('c', false,"1961" );
		Answers answer4_4 = new Answers('d', false,"1951" );
		
		Answers[] set4 = new Answers[4];
		set4[0] = answer4_1;
		set4[1] = answer4_2;
		set4[2] = answer4_3;
		set4[3] = answer4_4;
		
		QnA.addToMap(question4, set4);
		
		Question question5 = new Question(5, "What is the total area of Cameroon in square kilometers ?");
		Answers answer5_1 = new Answers('a', false,"475 441" );
		Answers answer5_2 = new Answers('b', true,"475 442" );
		Answers answer5_3 = new Answers('c', false,"475 443" );
		Answers answer5_4 = new Answers('d', false,"475 444" );
		
		Answers[] set5 = new Answers[4];
		set5[0] = answer5_1;
		set5[1] = answer5_2;
		set5[2] = answer5_3;
		set5[3] = answer5_4;
		
		QnA.addToMap(question5, set5);
		QnA.printQuestionMap(); b
		
		
		
	}
	
	
	public static void showTime() {
		Calendar calendar = Calendar.getInstance();
		System.out.printf("%1$tH:%1$tM:%1$tS\n",calendar);
	}
	
	

}
