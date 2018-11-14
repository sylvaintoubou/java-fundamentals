package lesson15.innerAndAnonymousClasses;

public class C {
	
	public void sayHello() {
		
		class InnerClass{
			
			private String name = "Seven Academy";
			
			String Hello() {
				System.out.print("Hello ");
				return name;
			}
			
		}
		
	InnerClass inner = new InnerClass();
	inner.Hello();
		
	}
	
	void getMessage(D d2) {
		d2.message("Thierry");
	}
	
	public static void main(String[] args) {
		C c1 = new C();
		//System.out.println(sayHello());
		
		/*
		new D() {
			
			@Override
			public void message(String name) {
				System.out.println("Hello "+name);
			}
			
		}.message("Thierry");
		*/
		
		c1.getMessage(new D() {
			
			@Override
			public void message(String name) {
				System.out.println("Hello "+name);
			}
			
		});
	}
	

}

abstract class D {
	abstract void message(String name);
}
