package inheritanceAndPolymorphism;

import java.math.*;

public class Cylinder extends ThreeDimensionalShape {

	public Cylinder(String name, int width, int lenght, int radius, int height) {
		super(name, width, lenght, radius, height);
		
	}

	@Override
	public float calculateVolume() {
		return (float) (Math.PI * (radius * radius) * height);
	}

}
