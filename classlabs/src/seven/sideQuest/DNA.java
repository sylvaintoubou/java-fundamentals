package seven.sideQuest;

import java.util.Scanner;

public class DNA {
	
	public DNA() {
		
	}
	
	public void drawStrand(int levels) {
		
		/*
		int n = 3,
			i, 
			j, 
			space = 1;
        space = n - 1;
        
        
        for (j = 1; j <= n; j++) {
        	
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("-");                
            }
            System.out.println("o");
        }
        space = 1;
        */
        /*
        for (j = 1; j <= n - 1; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (n - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        */
		
		do {
			
			System.out.printf("    o \n");
			for(int i = 1; i <= 4; i++) {
				for(int k = 0; k < 4-i; k++)
					System.out.print(" ");
				System.out.print("o");
				
				for(int j = 0; j < i; j++)
					System.out.print("- ");
				System.out.println("o");
			}
		
			for(int i = 4; i > 0; i--) {
				for(int k = 0; k < 4-i; k++)
					System.out.print(" ");
				System.out.printf("o");
				
				for(int j = 0; j < i; j++)
					System.out.print("- ");
				System.out.println("o");
			}
		
		} while(--levels > 0);
    }
	

}
