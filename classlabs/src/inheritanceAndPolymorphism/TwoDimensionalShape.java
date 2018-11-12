package inheritanceAndPolymorphism;

public class TwoDimensionalShape extends Shape implements Area{

	int width, lenght, radius;
	
	public TwoDimensionalShape(String name, int width, int lenght, int radius) {
		super(name);
		this.radius = radius;
		this.lenght = lenght;
		this.width = width;
		
		
	}

	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		return lenght * width;
	}
	

}
