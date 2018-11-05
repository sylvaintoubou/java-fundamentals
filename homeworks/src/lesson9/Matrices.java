/**
 * 
 * Lesson 9
 * A program that multiplies two given matrices
 */
/**
 * @author mas73rs
 *
 */

package lesson9;

import java.util.Arrays;

public class Matrices {
	
	
	static int[][] matrice1 = {{1,3,7},{3,0,-1}};
	static int[][] matrice2 = {{1},{2},{3}};
	static int[][] matrice3 ;
	
	public static int[][] result(int[][] x, int[][] y) {
		
		matrice3 = new int[x.length][x.length];
		int sum = 0;
		
		if(x.length > 0 && y.length > 0) {
			if(x[0].length >= y.length) {
				
				for(int i = 0; i < x.length; i++) {
					for(int j = 0; j < y.length; j++) {
						sum += x[i][j]*y[j][0];
						
					}
					matrice3[i][0] = sum;
					System.out.println(sum);
					sum = 0;
				}
			}
		}
		
			return matrice3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		result(matrice1,matrice2);

	}
	
}
