package seven.lesson21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Sorting {
	
	static Map<Student, Float> firstMap = new HashMap<Student, Float>();
	
	public static void addStudentToMap(Student s) {
		firstMap.put(s, s.getScore());

	}
	
	public static void printStudentMap() {
		
		Set<Student> studentKeys = firstMap.keySet();
		Iterator<Student> iterate = studentKeys.iterator();
		
		
		while (iterate.hasNext()) {
			Student st = iterate.next();
			System.out.println(st.getName() + " " +firstMap.get(st));
		}
		
		/*
		for(Float m : firstMap.values())
			System.out.println(m);
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
		

}