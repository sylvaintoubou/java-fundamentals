package seven.lesson24;

public class InsertionSort extends Sort {

	
	public InsertionSort(int size) {
		super(size);
	}

	@Override
	int[] sort() {
		int tempData;
		
		for(int next = 1; next < sortData.length; next++) {
			tempData = sortData[next]; //get next item and store in temporal value
			int tempIndex = next; // Next location to put item
			
			for(; tempIndex > 0 && sortData[tempIndex - 1] > tempData;) {
				sortData[tempIndex] = sort()[tempIndex - 1]; //Move larger value backward
				tempIndex--;
			}
			
			sortData[tempIndex] = tempData;
		}
		
		return sortData;
	}

}
