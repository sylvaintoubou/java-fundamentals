package inheritanceAndPolymorphism;

public class Cube extends ThreeDimensionalShape implements Volume {

	public Cube(String name, int width, int lenght, int radius, int height) {
		super(name, width, lenght, radius, height);
		
	}
	
}
