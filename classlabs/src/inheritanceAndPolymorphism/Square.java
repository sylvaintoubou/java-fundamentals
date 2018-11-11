package inheritanceAndPolymorphism;

public class Square extends TwoDimensionalShape implements Area{
	

	
	public Square(String name, int height, int width) {
		super(name, height, width);

	}

	@Override
	public float calculateArea(){
		return width*height;
	}
	
	
}
