import java.util.Scanner;

public class TicTacInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("** welcome to tictactoe game**");
		System.out.println("select the difficulty");
		System.out.println("1- novice \n 2- intermediate \n 3- pro \n 4- expert \n 5- Legendary");
		Scanner input = new Scanner (System.in);
		int level=input.nextInt();
		TicTacToe game = new TicTacToe(level *3);
		Player playerOne,playerTwo;
		Scanner readPlayer = new Scanner (System.in);
		System.out.print("player one name");
		playerOne = new Player(readPlayer.nextLine(),0,'X');
		System.out.print("player two name");
		playerTwo = new Player(readPlayer.nextLine(),0,'O');
		Scanner readIndex =new Scanner(System.in);
		while(game.getPlays()>0) {
			game.printBoard();
			System.out.println("You turn" + playerOne.getPlayerName());
			int start=readIndex.nextInt();
			int end=readIndex.nextInt();
			boolean isOver = game.play(start, end,playerOne);
			if(isOver) 
				break;
			System.out.println("you turn " +playerTwo.getPlayerName());
			start = readIndex.nextInt();
			end = readIndex.nextInt();
			isOver=game.play(start,end,playerTwo);
			if(isOver)
				break;
			
		}
		System.out.println("*** game over ***");
		System.out.println(playerOne);
		System.out.println(playerTwo);
	}

}
