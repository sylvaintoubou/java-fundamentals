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
	static int[][] matrice3;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 3; i++) {
			
	         for (int j = 0; j < 3; j++) {
	         
	         	for (int k = 0; k < 3; k++) {
	         		matrice3[i][j] += matrice1[i][k] * matrice2[k][j];
		        }
	         	System.out.print(matrice3[i][j] + " ");
	         }
	         System.out.println();
		}

	}
	
}
