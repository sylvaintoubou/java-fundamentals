package inheritanceAndPolymorphism;

import java.util.Scanner;

public class ToyShape {
	
	Shape userShape;
	
	
	public ToyShape() {
		
		
	}
	
	public Shape getToyShape(int userInput) {
		
		
		
		switch (userInput) {
			case 1:
					userShape = new Triangle("Triangle", 12, 5, 0);
				break;
	
			case 2:
					userShape = new Square("Square", 6, 6, 0);
				break;
				
			case 3:
					userShape = new Cube("Cube", 6, 6, 0, 10);
				break;
		
			default:
				userShape = new Cylinder("Cylinder", 0, 0, 3, 10);
				break;
		}
		
		return userShape;
	}
	

	public void getSize(Shape userShape) {
		
		if (userShape instanceof TwoDimensionalShape) {
			System.out.printf("Area of %s is : %f ", userShape.name, ((TwoDimensionalShape)userShape).calculateArea());
		}
		else if (userShape instanceof ThreeDimensionalShape) {
			System.out.printf("Area of %s is : %f ", userShape.name, ((ThreeDimensionalShape)userShape).calculateArea());
		}
		
	}
	
}
