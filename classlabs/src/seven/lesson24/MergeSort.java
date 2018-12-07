package seven.lesson24;

import java.util.Arrays;

public class MergeSort extends Sort {

	
	public MergeSort(int size) {
		super(size);
	}

	@Override
	public int[] sort() {
		int low = 0,
			high = sortData.length - 1;
		
		sortArray(low, high);
		return sortData;
		
	}
	
	private void showStep(int low, int high) {
		System.out.println("SubArray " + sortData[low] + " " + sortData[high]);
	}
	
	private void mergeArray(int lowIndex, int lMid, int hMid, int highIndex) {
		int left = lowIndex,
			right = hMid,
			mindex = lowIndex;
		int[] array = new int[sortData.length];
		
		while(left <= lMid && right <= highIndex) {
			
			if(sortData[left] <= sortData[right])
				array[mindex++] = sortData[left++];
			else
				array[mindex++] = sortData[right++];
		}
		
		// If lower array is empty
		if(left == hMid) {
			
			while(right <= highIndex) //copy all the upper array
				array[mindex++] = sortData[right++];
		} else {
			
			while(left <= lMid)
				array[mindex++] =sortData[left++];
		}
		
		for(int i = lowIndex; i <= highIndex; i++)
			sortData[i] = array[i];
		System.out.println("Merge Array " + Arrays.toString(array));
	}

	private void sortArray(int low, int high) {
		
		if((high - low) >= 1) { // base case. Split array into two and sort
			int m1 = (low + high) / 2,
				m2 = m1 + 1;
			
			showStep(low, high);
			showStep(low, m1);
			showStep(m2, high);
			
			sortArray(low, m1);
			sortArray(m2, high);
			
			mergeArray(low, m1, m2, high);
		}
		
	}
}
