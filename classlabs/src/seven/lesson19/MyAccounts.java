package seven.lesson19;

public class MyAccounts {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int balance;
	
	public MyAccounts() {
	
	}


	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) throws AccountBalanceException{
		
		if (balance < 0) {
			throw new AccountBalanceException("Invalid balance!");
		} else this.balance = balance;
			
	}
	
	
	
}
