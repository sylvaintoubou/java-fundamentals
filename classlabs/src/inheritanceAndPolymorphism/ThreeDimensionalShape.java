package inheritanceAndPolymorphism;

public class ThreeDimensionalShape extends Shape{
	
	int radius, diameter = radius * 2, height;

	public ThreeDimensionalShape(String name, int width, int height,int radius) {
		super(name, width);
		this.radius = radius;
		this.height = height;
	
	}

}
