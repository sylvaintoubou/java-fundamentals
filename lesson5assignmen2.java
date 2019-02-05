package homework;
import java.util.Scanner;

public class lesson5assignmen2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x;
		System.out.println("Type in a number : ");
		x = input.nextInt();
		
		for(int redo = 1; redo < x; redo++) 
		{
			System.out.print(redo+" + ");
			if (redo == (x-1))System.out.print(x+" = ");
		}
	
	}
	
}
