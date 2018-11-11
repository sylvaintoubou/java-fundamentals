package inheritanceAndPolymorphism;

public class Cube extends ThreeDimensionalShape implements Volume {

	public Cube(String name, int width, int height, int radius) {
		super(name, width, height, radius);
		
	}

	@Override
	public float calculateVolume() {
		return width*width*width;
	}
	
}
