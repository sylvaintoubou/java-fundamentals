package seven.lesson24;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		LinearSearch linearSearch = new LinearSearch("\nLinear Search\n");
		int[] array = linearSearch.makeArray(20);
		System.out.println(linearSearch.toString(array));
		
		int search;
		Scanner read = new Scanner(System.in);
		
		while((search = read.nextInt()) != -1) {
			
			int index = linearSearch.find(search, array);
			
			if(index == -1) {
				System.out.printf("%d not found in the array", search);
			} else System.out.printf("%d found at the position % in the array", search, index);
		}
		read.close();
		*/
		
		/*
		BinarySearch binSearch = new BinarySearch();
		int[] array = binSearch.makeArray(10);
		System.out.println(binSearch.toString(array));
		
		while((search = read.nextInt()) != -1) {
			
			int index = binSearch.find(search, array);
			
			if(index == -1) {
				System.out.printf("%d not found in the array", search);
			} else System.out.printf("%d found at the position % in the array", search, index);
		}
		read.close();
		*/
		
		/*
		InsertionSort iSort = new InsertionSort(10);
		iSort.printArray(); // Unsorted array
		iSort.sort();
		iSort.printArray(); // Sorted array
		*/
		
		/*
		SelectionSort sSort = new SelectionSort(10);
		sSort.printArray();
		sSort.sort();
		sSort.printArray();
		*/
		
		MergeSort mSort = new MergeSort(10);
		mSort.printArray();
		int[] sorted = mSort.sort();
		System.out.println(sorted);
	}

}
