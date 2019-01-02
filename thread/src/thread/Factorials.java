package thread;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Factorials {
public void factorials() {
		
	}
	public static BigInteger factorial(BigInteger fact) {
		if(fact.compareTo(BigInteger.ONE)<=0) 
		return BigInteger.ONE;
		return fact.multiply(factorial(fact.subtract(BigInteger.ONE)));
	}
	
	public int factorial(int fact) {
		int result =1;
		while(fact>1) {
			result*=fact--;
		}
		return result;
	}
	
	// fibonacci
	public static void fibonacci(){    
		Scanner scan = new Scanner(System.in);
		System.out.println("entrer le compteur");
		int compteur=scan.nextInt();
        int nbr1=0, nbr2=1, nbr3, i;  
        //La boucle commence par 2 car 0 et 1 sont deja affiches
        int sum_=0;
        ArrayList a = new ArrayList();
        for(i=2; i<=compteur; ++i)
        {    
            nbr3 = nbr1 + nbr2;       
            nbr1 = nbr2;    
            nbr2 = nbr3; 
           a.add(nbr3);
        }    
        System.out.println(" le fibonacci de "+ compteur +" est " + a.get(a.size()-1));
    }
	// spy number
	public static void spyNumber() {
		Scanner input=new Scanner(System.in);
		System.out.println("welcome enter your  Spy number");
		int nombre =input.nextInt();
		int reste =0;
		int b=0;
		ArrayList a=new ArrayList();
		for(;nombre!=0;) {
			reste=nombre % 10;
			System.out.println(reste);
			nombre = nombre / 10;
			a.add(reste);
		}
		System.out.println(a.toString());
		
		for(int j=0;j<a.size();j++) {
			 j+=a.get(j);
		}
	}
	
	
	// fonction principal main 
	public static void main(String[] args) {
		spyNumber();
		//System.out.println("calculon fibonacci");
		//fibonacci();
		//Scanner scan = new Scanner(System.in);
		//int fibo=scan.nextInt();
		/* System.out.println("enter your value ");
		BigInteger bint = BigInteger.valueOf(scan.nextLong());
		System.out.println(factorial(bint)); */
	}
	/*
	 public static int fibonacci(int n) {
			int result;
			System.out.println("fibonacci("+n+")");
			if (n <= 1) return 1;
			else {
				result = fibonacci( n - 1) + fibonacci( n - 2);
				System.out.println("le resultat est " + result);
				return result;
			}
		}*/
	/*
	   
    public static void main(String args[])  
    {    
        int nbr1=0, nbr2=1, nbr3, i, count=10;  
        //print 0 and 1
        System.out.print(nbr1+" "+nbr2);   
    
        //La boucle commence par 2 car 0 et 1 sont deja affiches
        for(i=2; i<count; ++i)
        {    
            nbr3 = nbr1 + nbr2;       
            nbr1 = nbr2;    
            nbr2 = nbr3;  
            System.out.print(" "+nbr3); 
        }    
  
    }
*/
	
	
	
}
