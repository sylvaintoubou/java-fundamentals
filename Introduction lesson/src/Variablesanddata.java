
public class Variablesanddata {

	public static void main(String[] args) {
		byte size=50;
		System.out.println(size);
		short number=3000;
		System.out.println(number);
		int figures=20000000;
		System.out.println(figures);
		long digits=34558675957696058L;
		System.out.println(digits);
		float decimal=2355674.5F;
		System.out.println(decimal);
		Double decimals=1736389.4647;
		System.out.println(decimals);
		boolean isAlive=true;boolean isDead=false;
		System.out.println(isAlive);System.out.println(isDead);
		char Q='X'; char fig='f';
		System.out.println(Q);System.out.println(fig);
		
		String word="\"hello\tworld\rits your birthday\nbe thankful\"";
		System.out.println(word);
		
		System.out.println("Value of size is "+size);
		System.out.println("value of number is "+number);
		
		byte x=5;
		byte y=10;
		System.out.println(x+ "+" +y+ "=" +(x+y));
		age=7;
		play();
		System.out.println("Age:"+Variablesanddata.MAX_AGE);
		
		}
	 static int age=5;
	public static void play() {
		System.out.println(age);
		int age=10;
		System.out.println(age);
		
	}
	public static int MAX_AGE=100;//class variable
	private int _age=25;//instance variable
	protected char type='E';
	
	public void doll() {
		System.out.println("Age:"+_age+type);	
	}
	
		

}
