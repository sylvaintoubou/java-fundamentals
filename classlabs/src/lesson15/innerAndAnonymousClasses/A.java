package lesson15.innerAndAnonymousClasses;

import java.awt.print.Printable;

public class A {
	
	private class B{
		
		private String name = "Seven Academy";
		
		public void sayHi() {
			System.out.println("Konichi wa!");
		}
		
		String greet() {
			System.out.print("Hello ");
			return name;
		}
		
	}
	
	public String printB() {
		return new B().greet();
	}
	
	public B getB() {
		return new B();
	}
	
	public static void main(String[] args) {
		
		A myA = new A();
		myA.getB().sayHi();
		System.out.println(myA.getB().greet());
		myA.printB();
		
	}
	
}
