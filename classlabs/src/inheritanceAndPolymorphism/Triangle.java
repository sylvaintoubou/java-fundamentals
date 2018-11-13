package inheritanceAndPolymorphism;

public class Triangle extends TwoDimensionalShape {
	
	
	public Triangle(String name, int width, int lenght, int radius) {
		super(name, width, lenght, radius);
		
	}

	@Override
	public float calculateArea() {
		return (lenght*width)/2;
	}


}
