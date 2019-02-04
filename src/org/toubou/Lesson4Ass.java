package org.toubou;

public class Lesson4Ass {

	 public static void main(String[] params) {
		 String title = params[0];
		 int num1 =10; float num2 = 5.5f;
		 double output = (num1+num2 ) * 0.5 - 0.5 / 2; //7.5
		 System.out.println("Title:"+title );
		 System.out.println("Output is "+output);
		 System.out.println("num1 shifted one place to the Left: " +(1<<num1)); //4
		 
	 }
}
