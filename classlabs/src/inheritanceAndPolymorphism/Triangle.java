package inheritanceAndPolymorphism;

public class Triangle extends TwoDimensionalShape implements Area{
	
	
	public Triangle(String name, int height, int width) {
		super(name, height, width);
		
	}

	@Override
	public float calculateArea() {
		return (height*width)/2;
	}


}
