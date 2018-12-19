package application;

import java.util.Scanner;

public class Discriminant {
	
	private double discriminant,
					i,
					x;
	private int a,
				b,
				c;
	
	double[] result = new double[2];
	
	
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
		System.out.println("\nLet F(x) = ax2 + bx + c");
		System.out.println("\nDefine your polynom by entering the values of : \na ?");
		setA(scan.nextInt());
		System.out.println("\nb ?");
		setB(scan.nextInt());
		System.out.println("\nc ?");
		setC(scan.nextInt());
		System.out.printf("\nF(x) = %fx2 + %fx + %f\n\n", getA(), getB(), getC());
		System.out.println("\nSolution :");
		System.out.println("..........\n");
		
		
		doDiscriminant();
		for(double el : result)
			System.out.println(el);
	}
	
	public double[] doDiscriminant() {
		
		discriminant = Math.pow(b, 2) - 4 * a * c;
		double x1;
		double x2;
		
		if(discriminant > 0) {
			x1 = ((-b) - Math.sqrt(discriminant)) / (2 * a);
			x2 = ((-b) + Math.sqrt(discriminant)) / (2 * a);
			
			result[0] = x1;
			result[1] = x2;
		} 
		else if (discriminant == 0) {
			x = - (b / (2 * a));
			
			result[0] = x;
			result[1] = x;
		}
		else if (discriminant < 0) {
			x1 = ((-b) - i * Math.sqrt(- discriminant)) / (2 * a);
			x2 = ((-b) + i * Math.sqrt(- discriminant)) / (2 * a);
			
			result[0] = x1;
			result[1] = x2;
		}
		
		return result;
	}

}
