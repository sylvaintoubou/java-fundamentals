package seven.sideQuest;

public class SpyNumber {

	static int nextDigit;
	static int sums = 0;
	static int products = 1;
	
	public static boolean aSpyNumber(int number) {
		
		if (number < 10) return false;
		
		else {
			
			nextDigit = number / 10;
			
			while( nextDigit > 0) {
				products *= nextDigit % 10;
				sums += nextDigit / 10;
				nextDigit /= 10;
				
				
			}
			
		}
		
		return sums == products;
	}
}
