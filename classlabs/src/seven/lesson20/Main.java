package seven.lesson20;

public class Main {

	public static void main(String[] args) {
		listArray(new String[] {"One", "Two", "Three", "Four"});
		listArray(new Integer[] {1, 2, 3, 4});
		listArray(new Float[] {1.0f, 2.0f, 3.0f, 4.0f});

		System.out.println("\nMinimum among 8, 6 and 110 is " + getMin(8,6,110));
		
		Arithmetic<String> a1 = new Arithmetic<String>(new String ("Hello"));
		Arithmetic<Integer> a2 = new Arithmetic<Integer>(new Integer (7));
		System.out.println("\n ");
		System.out.println(a1.get());
		System.out.println(a2.get());
	}

	public static <T> void listArray (T [] array) {
		for(T item : array) {
			System.out.printf(" %s ", item.toString());
		}
		System.out.println();

	}
	
	public static <T extends Comparable<T>> T getMin(T t1, T t2, T t3){
		T min = t1;
		if (min.compareTo(t2) > 0) {
			min = t2;
		}
		if(min.compareTo(t3) > 0) {
			min = t3;
		}
		if(t2.compareTo(t3) > 0) {
			min = t3;
		}
		
		return min;
	}
}
