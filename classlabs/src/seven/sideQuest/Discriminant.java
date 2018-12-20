package seven.sideQuest;

import java.util.Scanner;

public class Discriminant {
	
	private double discriminant,
					i,
					x;
	private int a,
				b,
				c;
	
	public Discriminant() {
	}

	public double getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public void userInteraction() {
		Scanner scan = new Scanner(System.in);
		System.out.println("CALCULATE A POLYNOM DISCRIMINANT");
		System.out.println("\nLet F(x) = ax^2 + bx + c");
		System.out.println("\nDefine your polynom by entering the values of : \na ?");
		setA(scan.nextInt());
		System.out.println("\nb ?");
		setB(scan.nextInt());
		System.out.println("\nc ?");
		setC(scan.nextInt());
		System.out.printf("\nF(x) = %.2fx^2 + %.2fx + %.2f\n\n", getA(), getB(), getC());
		System.out.println("\nSolution :");
		System.out.println("..........\n");
		
		doDiscriminant();
		scan.close();
		
	}
	
	public void doDiscriminant() {
		
		discriminant = Math.pow(b, 2) - 4 * a * c;
		double x1;
		double x2;
		double complex;
		
		if(discriminant > 0) {
			x1 = ((-b) - Math.sqrt(discriminant)) / (2 * a);
			x2 = ((-b) + Math.sqrt(discriminant)) / (2 * a);
			
			System.out.printf("x1 : %.2f\nx2 : %.2f", x1, x2 );
		} 
		else if (discriminant == 0) {
			x = - (b / (2 * a));
			
			System.out.printf("x : %.2f", x);
		}
		else if (discriminant < 0) {
			x1 = ((-b) - i * Math.sqrt(- discriminant)) / (2 * a);
			x2 = ((-b) + i * Math.sqrt(- discriminant)) / (2 * a);
			complex = Math.sqrt(- discriminant) / (2 * a);
			
			System.out.printf("x1 : %.2f - %.2fi\nx2 : %.2f + %.2fi", x1, complex, x2, complex);
		}
		
	}

}
