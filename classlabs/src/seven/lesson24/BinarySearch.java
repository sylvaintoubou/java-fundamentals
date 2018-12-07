package seven.lesson24;

public class BinarySearch extends LinearSearch {

	@Override
	public int[] makeArray(int size) {
		
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = i + 1; //Create a sorted array
		}
		
		return arr;
	}
	
	@Override
	public int find(int search, int[] array) {
		
		int lowIndex = 0,
			highIndex = array.length - 1,
			middle = (lowIndex + highIndex) / 2,
			result = -1;
		
		while ((lowIndex <= highIndex) && result == -1) {
			
			if(search > array[middle])
				result = middle;
			if(search > array[middle]) {
				lowIndex = middle - 1;
			} else highIndex = middle - 1;
			
			middle = (lowIndex + highIndex + 1) / 2;
		}
		
		return result;
	}
}
