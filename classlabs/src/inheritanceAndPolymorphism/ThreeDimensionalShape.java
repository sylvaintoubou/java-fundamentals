package inheritanceAndPolymorphism;

public class ThreeDimensionalShape extends TwoDimensionalShape implements Volume{
	
	int height;

	public ThreeDimensionalShape(String name, int width,int lenght, int radius, int height) {
		super(name, width, lenght, radius);
		this.height = height;
	
	}

	@Override
	public float calculateVolume() {
		// TODO Auto-generated method stub
		return lenght * width * height;
	}

}
