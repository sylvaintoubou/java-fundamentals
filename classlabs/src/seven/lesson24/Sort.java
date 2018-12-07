package seven.lesson24;

import java.util.Arrays;
import java.util.Random;

public abstract class Sort {

	protected int[] sortData;
	private static Random generator = new Random();
	
	public Sort(int size) {
		generateData(size);
	}
	public void generateData(int size) {
		
		sortData = new int[size];
		for(int i = 0; i < size; i++) {
			sortData[i] = 5 * generator.nextInt(50);
		}
	}
	public void printArray() {
		System.out.println(Arrays.toString(sortData));
	}
	
	abstract int[] sort();
}
