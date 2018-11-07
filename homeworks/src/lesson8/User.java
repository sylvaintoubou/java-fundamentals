package lesson8;

import java.util.Scanner;

public class User {
	
	
	String username;
	int totalScore;
	float prizeMoney;
	short correctQuestions;
	long start = System.currentTimeMillis();

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int questionScore = 0;
		int startGame;
		String userAnswer;
		
		Scanner numb = new Scanner(System.in);
		Scanner str = new Scanner(System.in);
		
		System.out.println("\t\tWelcome to....\n\t\tWho Wins A Million!!");
		System.out.println("\n\t\tPress 1 to enter\n\t\t(Or 0 to quit)");
		startGame = numb.nextInt();
		
		
		if (startGame == 1) {
			//do {
				System.out.println("1: Who is the President of Cameroon? \n\na.Maurice Kamto b.Paul Biya \nc.Cabral Libii  d.Joshua Oshi");
				userAnswer = str.nextLine();
				if (userAnswer == "b") {
					//questionScore++;
					System.out.println("Correct!!");
					//System.out.println("score: "+questionScore);
				}
				/*
				else {
					System.out.println("Sorry wrong answer!!");
					questionScore--;
					System.out.println("score: "+questionScore);
				 }
				*/
				
				System.out.println();

			//}while(questionScore >= 0);
			/*
			if (questionScore < 0) {
				System.out.println("Your score is inferior to 0. You failed!!\nPlease try again!!");
			}
			*/
		}else System.out.println("Exiting");
	}

}
