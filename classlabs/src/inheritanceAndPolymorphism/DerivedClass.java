package inheritanceAndPolymorphism;

public class DerivedClass extends BaseClass {
	

	public DerivedClass(String name, int age) {
		super(name,age);
		
	}
	
	public DerivedClass() {
		
	}

	public void greeting() {
		System.out.printf("Hi! I am %s, and I am %d years old", name, age);
		// System.out.printf("\nI was born on %s", birthDay); 
		
	}

}
