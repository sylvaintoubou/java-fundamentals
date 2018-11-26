package seven.lesson21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collections {
	
	public static void printArrayList() {
		List aList = new ArrayList<Integer>();
		aList.add("First");
		aList.add("First");
		aList.add(1);
		
		List bList = new ArrayList<>();
		bList.add("B-LIST");
		bList.addAll(0, aList);
		
		System.out.println("List A\n.......");
		for(Object item : aList)
			System.out.println(item);
		
		System.out.println("\nList B\n.......");
		for(Object item : bList)
			System.out.println(item);
		
		System.out.println("\nAnother method to print A-List");
		for(int i = 0; i < aList.size(); i++)
			System.out.println(aList.get(i));
		
		
		bList.set(2, "Salute");
		Iterator<String> iterator = bList.listIterator();
		System.out.println("\n======== Iterated Elements ========");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		String[] myListArray = new String[bList.size()];
		bList.toArray(myListArray);
		System.out.println("\nConverted B List into array");
		for(String str : myListArray)
			System.out.println(str);
		
	}
	
	public static void printSet() {
		
		Set<Integer> integerSet = new HashSet<Integer>();
			for(int j = 0; j < 10; j++)
				integerSet.add(10 - j);
		
		System.out.println("\nSet");
		System.out.println(integerSet);
		
		TreeSet tSet = new TreeSet<Integer>(integerSet);
		System.out.println("\nSorted set is ");
		tSet.add(1);
		tSet.add(11);
		System.out.println(tSet);
		
	}
	
	public static void printMap() {
		
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		myMap.put("No1", 1);
		myMap.put("No2", 2);
		
		System.out.println("\n====== Map Values ======");
		for(Integer m : myMap.values())
			System.out.println(m);
		
		System.out.println("\nIs there a key 5 ? " + myMap.containsKey("No5"));
		System.out.println("Is there a value 5 ? " + myMap.containsValue(5));
		System.out.println("No 1 has value : " + myMap.get("No1"));
		
		Set<String> mySet = myMap.keySet();
	}
	

	
}
