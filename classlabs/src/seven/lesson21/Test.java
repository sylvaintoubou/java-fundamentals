package seven.lesson21;

public class Test {

	public static void main(String[] args) {
		//Collections.printArrayList();
		//Collections.printSet();
		//Collections.printMap();
		Student student1 = new Student(1, "Yvan", 10.0f);
		Sorting.addStudentToMap(student1);
		Student student2 = new Student(2, "Roland", 20.0f);
		Sorting.addStudentToMap(student2);
		Student student3 = new Student(3, "Thierry", 90.0f);
		Sorting.addStudentToMap(student3);
		
		Sorting.printStudentMap();
	}
}
