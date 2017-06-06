
public class Account {
	
	private int account_number;
	private String user_name;
	private long balance;
	private int PIN;
	
	
	public Account(int acct, String user, long balance, int pin) {
		this.account_number = acct;
		this.user_name = user;
		this.balance = balance;
		this.PIN = pin;
	}


	/**
	 * @return the account_number
	 */
	public int getAccount_number() {
		return account_number;
	}


	/**
	 * @param account_number the account_number to set
	 */
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}


	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}


	/**
	 * @param user_name the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}


	/**
	 * @param balance the balance to set
	 */
	public void setBalance(long balance) {
		this.balance = balance;
	}


	/**
	 * @return the pIN
	 */
	public int getPIN() {
		return PIN;
	}


	/**
	 * @param pIN the pIN to set
	 */
	public void setPIN(int pIN) {
		PIN = pIN;
	}
	
	public double withdraw(double amount) {
		return balance - amount;
	}
	
	public double deposit(double amount) {
		return balance + amount;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " [account_number=" + account_number + ", user_name=" + user_name + ", balance=" + balance + "]";
	}
	
	

	
	
	
	

}
