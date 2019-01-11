package section2.question4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	       System.out.println("Enter Row/Column Value::");
	        int i,j,k,n;
	        n=s.nextInt();
	        for(i=1; i<n; i++){
	            for(j=n+(n/2); j>i; j--){
	                System.out.print(" ");}
	            for(k=1; k<=2*i-1; k++){
	                System.out.print("*");}
	            System.out.println("");
	            }
	         for(i=1; i<n+(n/2); i++){
	            for(j=n+(n/2); j>i; j--){
	                System.out.print(" ");}
	            for(k=1; k<=2*i-1; k++){
	                System.out.print("*");}
	            System.out.println("");
	        }
	          for(i=1; i<n-(n/2); i++){
	            for(j=n+(n/2); j>1; j--){
	                System.out.print(" ");}
	            for(k=n/2; k<=(n/2)+1; k++){
	                System.out.print("*");}
	            System.out.println("");
	        }
	        
	}
}
