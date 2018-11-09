package inheritanceAndPolymorphism;

public class Exercise {

	public static void main(String[] args) {
		
		Cube cube1 = new Cube("Orange Cube", 10, 0, 0);
		System.out.printf("The volume of %s with sides of %d cm is : %f cm3\n", cube1.name,cube1.width, cube1.calculateVolume());
		
		Square sq1 = new Square("Red Square", 4, 4);
		System.out.printf("The volume of %s with sides of %d cm is : %f cm2\n", sq1.name,sq1.width, sq1.calculateArea());
		System.out.printf("Is %s a 2 dimensional shape ? %b\n", cube1.name, (sq1 instanceof TwoDimensionalShape));
		System.out.printf("Is %s even a shape at all ? %b\n", cube1.name, (sq1 instanceof Shape));
		// System.out.printf("Is %s a 3 dimensional shape ? %b", cube1.name, (sq1 instanceof ThreeDimensionalShape));
		

	}

}
