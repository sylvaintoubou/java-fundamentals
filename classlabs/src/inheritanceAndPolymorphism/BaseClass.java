package inheritanceAndPolymorphism;

public class BaseClass {
	
	String name;
	int age;
	private String birthDay;
	
	public BaseClass(String name, int age) {
		
		this.name = name;
		this.age = age;
		System.out.printf("Welcome %s. How old are you?\n", name);
		
	}

	public BaseClass() {
		System.out.println("\nWelcome to inheritance!");
	}
	
	public void introduce() {
		System.out.printf("Hello, I am the BaseClass. Are you %d years old? ",age);
	}
	
	public static void main(String[] args) {
		
		//demonstrating inheritance
		DerivedClass myclass = new DerivedClass("Akah", 25);
		myclass.greeting();
		new DerivedClass();
		myclass.introduce();
		
		BaseClass baseObject = new BaseClass();
		
		System.out.println("\nIs it from BaseClass ? " + (baseObject instanceof DerivedClass));
				
	}

}
