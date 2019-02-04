package org.toubou;

public class Lesson4Ass2 {

	public static void main(String[] params){
		 int sum = 1 ; //correction: removed static
		int _a = 30; int _b = 10;
		sum = _a + _b;
		System.out.println("Sum: "+sum);
		System.out.println("Sum again: "+sum++);
		System.out.println("Sum again : "+ (--sum)%2);
		sum /= 2;
		System.out.println("True or false? "+((sum+_b) == _a ? "true" :"false")); //add parenthesis
		}
}
