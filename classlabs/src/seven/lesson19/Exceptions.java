package seven.lesson19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions {

	public static void main(String[] args) throws CustomException {
		
		
		/*
		FileReader reader = null;
		
		try {
			File mFile = new File("C://Users/myfil.txt");
			reader = new FileReader(mFile);
		} catch (FileNotFoundException fnf) {
			
			String errorMessage = fnf.getMessage();
			System.out.println(errorMessage);
			//fnf.printStackTrace();
		} finally {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			System.out.println("All errors have been handled. Program completed.");
		}
		*/
		
		/*
		try {
			int first = 9, last = 0, diff = first / last;
		} catch (ArithmeticException aex) {
			aex.printStackTrace();
		}
		*/
		
		
		/*
		try {
			doDifference(9, 0);
		} catch (ArithmeticException aex) {
			aex.printStackTrace();
		} catch (UnsupportedOperationException uoe) {
			uoe.printStackTrace();
		}
		*/
		
		/*
		public void iAmNumberOne() {
			int one = 1;
			String iAm = "I am number ";
			System.out.println(iAm + one);
		} 
		*/
		
		MyAccounts mobileMoney = new MyAccounts();
		try {
			mobileMoney.setBalance(-15);
		} catch (AccountBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	public static void doDifference(int x, int y) throws ArithmeticException {
		System.out.println(x/y);
		throw new UnsupportedOperationException ("Implementation not supported !");
	}
	*/
	

}
