package inheritanceAndPolymorphism;

import java.util.Scanner;

public class ToyShape extends Shape{
	
	private int userInput;
	Scanner scInt = new Scanner(System.in);
	
	public ToyShape(String name, int width) {
		super(name, width);
		
	}
	
	public Shape getToyShape() {
		
		userInput = scInt.nextInt();
		
		switch (userInput) {
			case 1:
				
				break;
	
			case 2:
				
				break;
				
			case 3:
		
				break;
		
			default:
				
				break;
		}
		
		return Shape;
	}
	
	public void setSize(Shape) {
		
	}
}
