
public class SelectionSort extends Sort {

	public SelectionSort(int size) {
		super(size);
		// TODO Auto-generated constructor stub
	}

	@Override
	int[] sort() {
		
		for(int i=0;i<sortData.length-1;i++) {
			int minIndex=smallest(i);
			swap(i,minIndex);
		}
		return sortData;
	}

	private void swap(int first, int next) {
		int temp=sortData[first];
		sortData[next]=temp;
		System.out.printf("\n%d swapped with %d\n", sortData[next],sortData[first]);
	}

	private int smallest(int from) {
		int smallest =sortData[from];
		int index=from;
		for(int i=from;i<sortData.length;i++) {
			if(smallest>sortData[i]) {
				smallest=sortData[i];
				index=i;
			}
		}
		return index;
	}

}
