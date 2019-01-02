package classlabs;

import java.util.Arrays;

public class Lesson9Arrays {
	
	static int [] numbers = {1,2,3,4,5,6};
	
	public static int[] increaseValue() {
		for(int a = 0; a < numbers.length; a++)
			numbers[a] = numbers[a]*2;
		return numbers;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int [] numbers = {1,2,3,4,5,6};
		int max = 0;
		for(int i : numbers)
			if (max < i)
				max = i;
		System.out.println("Maximum is : "+max);
		
		int[] values = increaseValue();
		
		for (int i : values)
			System.out.println(i);
		
		System.out.println("The number 10 is at the position : "+Arrays.binarySearch(values, 10));
		*/
		
		/*
		int [][] students = {{1,3},{2,4}} ;
		for(int i = 0; i < students.length; i++) {
			for(int k : students[i]) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		*/
		
		char [][][] chars = {{{'a','b','c','d'}},{{'d','e','f'}},{{'g','h','i'}}} ;
		for(int i = 0; i < chars.length; i++) {
			for (int k = 0; k < chars[i].length; k++) {
				for(char l : chars[i][k]) {
					System.out.print(l+" ");
				}
				//System.out.println();
			}
			System.out.println();
		}
		
	}

	
}
