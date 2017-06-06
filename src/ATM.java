import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ATM implements iATM{
	
	Account account;
	List<Account> accounts;
	
	public ATM() {
		accounts = new ArrayList<Account>();
		
		Account ac1 = new Account(234, "zacks", 1000000, 213);
		Account ac2 = new Account (345, "dave", 10000000, 312);
		Account ac3 = new Account (456, "henok", 900000, 515);
		
		
		accounts.add(ac1);
		accounts.add(ac2);
		accounts.add(ac3);
		
		
		
	}
	
	
	public Account retrieveAccount(int acctno, int pinno) {
		
	
		for (Account acct : accounts) {
			if ((acct.getAccount_number()==(acctno)) && (acct.getPIN()==(pinno)))
			{
				return acct;
			}
		 else break;

		}
		return null;
		 
	
	}
	@Override
	public double atmdeposit(double money) {
		// TODO Auto-generated method stub
		return account.deposit(money);
	}

	@Override
	public double atmwithdraw(double amount) {
		// TODO Auto-generated method stub
		return account.withdraw(amount);
	}

	@Override
	public double atmcheckBalance() {
		// TODO Auto-generated method stub
		return account.getBalance();
	}
	
	Scanner kb = new Scanner(System.in);
	
	public int Acctname() {
		System.out.println("Enter your card account number");
		int acctNO = kb.nextInt();
		
		return acctNO;
				
	}
	
	public int acctPIN() {
		System.out.println("Enter your pin");
		
		int pinNO = kb.nextInt();
		
		return pinNO;
	}

}
