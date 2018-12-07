package seven.lesson24;

public class SelectionSort extends Sort {

	public SelectionSort(int size) {
		super(size);
	}

	@Override
	int[] sort() {
	
		for(int i = 0; i < sortData.length - 1; i++) {
			int minIndex = smallest(i);
			swap(i, minIndex);
		}
		
		return sortData;
	}
	
	void swap(int first, int next) {
		int temp = sortData[first];
		sortData[first] = sortData[next];
		sortData[next] = temp;
		
		System.out.printf("%d swapped with %d\n", sortData[next], sortData[first]);
	}
	
	
	/**
	 * Returns the index of the smallest integer from the specified start of the array
	 * @param from
	 * @return
	 */
	private int smallest(int from) {
		int smallest = sortData[from],
			index = from;
		
		for(int i = from; i < sortData.length; i++) {
			
			if(smallest > sortData[i]) {
				smallest = sortData[i];
				index = i;
			}
		}
		
		return index;
	}

}
