package lesson8;

import java.util.Scanner;

public class S {

	static String username;
	static int totalScore;
	static float prizeMoney;
	static short correctQuestions = 0;
	static int questionNo = 0;
	static String userAnswer;
	static int questionScore;
	static boolean correct;
	static int amount = 1;
	static int correctAnswer = 0;
	
	
	public static void answerTest() {
		
		switch (questionNo) {
		
			case 1:{
				
				/*
				while (userAnswer != "a"||userAnswer != "b"||userAnswer != "c"||userAnswer != "d") {
					System.out.println("Please enter a valid answer!!");
					userAnswer = str.nextLine();
				}
				*/
				
				
				switch (userAnswer) {
				
					case "b": {
						System.out.println("\nGood!!!\n\n");
						correct = true;
						correctQuestions++ ;
					}
						break;
					default: {
						System.out.println("Wrong answer!!!!\n\n");
						correct = false;
					}
						break;
				}
			}
				break;
				
			case 2: {
				
				switch (userAnswer) {
				
					case "d": {
						System.out.println("That one was simple but a bit tricky.\nWell Done!!!\n\n");
						correct = true;
						correctQuestions++ ;
					}
						break;
					default: {
						System.out.println("Wrong answer!!!\nI bet you don\'t know what is an administrative division.\n\n");
						correct = false;
					}
						break;
				}
				
			}
				break;
				
			case 3: {
				
				switch (userAnswer) {
				
					case "c": {
						System.out.println("Another good answer!! Keep on going.\n\n");
						correct = true;
						correctQuestions++ ;
					}
						break;
					default: {
						System.out.println("Wrong answer!!!\n\n");
						correct = false;
					}
					break;
				}
				
			}
				break;
				
			case 4: {
				
				switch (userAnswer) {
				
					case "b": {
						System.out.println("Ohhhhh! So you knew that one? Good!!\n\n");
						correct = true;
						correctQuestions++ ;
					}
						break;
					default: {
						System.out.println("Wrong answer!!!\n\n");
						correct = false;
					}
						break;
				}
				
			}
				break;
				
			case 5:{
				
				switch (userAnswer) {
				
					case "b": {
						System.out.println("Playing with you but you are smart!!\nCorrect answer.\n\n");
						correct = true;
						correctQuestions++ ;
					}
						break;
					default: {
						System.out.println("Wrong answer!!!\n\n");
						correct = false;
					}
					break;
				}
				
			}
				break;
			
		}

				
		
	}
	
	public static void questionScores() {
		
		switch(questionNo) {
		
			case 1:{
				questionScore = 10;
			}
				break;
				
			case 2:{
				questionScore = 15;
			}
				break;
				
			case 3:{
				questionScore = 10;
			}
				break;
				
			case 4:{
				questionScore = 10;
			}
				break;
				
			case 5:{
				questionScore = 30;
			}
				break;
				
		}
	}
	
	public static int userScore() {
		
		if(correct == true) {
			
			totalScore += questionScore;
		}
		else {
			totalScore -= questionScore;
		}
		
			return totalScore;
		
	}
	
	public static float moneyEarned() {
		
		prizeMoney = totalScore*correctQuestions*amount;
		
			return prizeMoney;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int startGame;


		
		Scanner numb = new Scanner(System.in);
		Scanner str = new Scanner(System.in);
		
		System.out.println("Please to start enter a username: ");
		username = str.nextLine();
		System.out.println("\n\n\t\t"+username+", You are welcome to....\n\t\tWho Wins A Million!!");
		System.out.println("\n\t\tPress 1 to enter\n\t\t(Or 0 to quit)");
		startGame = numb.nextInt();
		
		
		if (startGame == 1) {
			
			System.out.println("So how well do you know Cameroon ?\n\n");
			
			questionNo = 1;
			System.out.println(questionNo+". Who is the President of Cameroon? \n\na. Maurice Kamto \tb. Paul Biya \nc. Cabral Libii  \td. Joshua Oshi");
			userAnswer = str.nextLine();
			answerTest();
			questionNo++;
			
			
			System.out.println(questionNo+". How many administratives divisions does Cameroon have ?\n\na. 15 \t\t\tb. 12 \nc. 8  \t\t\td. 10");
			userAnswer = str.nextLine();
			
			answerTest();
			questionNo++;
			
			System.out.println(questionNo+". Which of the following is the most populated town ?\n\na. Yaounde \t\tb. Bafoussam \nc. Douala  \t\td. Bamenda");
			userAnswer = str.nextLine();
			
			answerTest();
			questionNo++;
			
			System.out.println(questionNo+". When did Cameroon gained its independance ?\n\na. 1950 \t\tb. 1960 \nc. 1961  \t\td. 1951");
			userAnswer = str.nextLine();
			
			answerTest();
			questionNo++;
			
			System.out.println(questionNo+". What is the total area of Cameroon in square kilometers ?\n\na. 475 441 \t\tb. 475 442 \nc. 475 443  \t\td. 475 444");
			userAnswer = str.nextLine();
			
			answerTest();
			
			System.out.println(".....................................");
			System.out.println(username+" Statistics");
			System.out.println(".....................................\n");
			System.out.println("Total Questions Attempted: "+questionNo);
			System.out.println("Total Correct Answers: "+correctQuestions);
			System.out.println("Total Score: "+totalScore);
			System.out.println("Money obtained: "+prizeMoney);
			
		
		}else System.out.println("Exiting");
		
		System.out.println("\nEnd of the game!");
	}

}

