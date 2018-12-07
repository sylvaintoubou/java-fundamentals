package seven.lesson24;

import java.util.Arrays;
import java.util.Random;

public class LinearSearch {
	
	String title;
	
	public LinearSearch(String title) {
		this.title = title;
	}
	
	public LinearSearch() {
		
	}
	
	public int find(int search, int[] array) {
		
		int result = -1;
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] == search) {
				result = i;
				break;
			}
		}
		
		return result;
	}
	
	public int[] makeArray(int size) {
		
		int[] randomArray = new int[size];
		Random random = new Random();
		
		for(int i = 0; i < size; i++) {
			randomArray[i] = random.nextInt(6);
		}
		
		return randomArray;
		
	}
	
	public String toString(int[] arr) {
		return title + Arrays.toString(arr);
	}
}
