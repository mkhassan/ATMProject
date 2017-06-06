import java.util.List;

public class ATMApp {

	public static void main(String[] args) {
	
		ATM atm = new ATM();
		
		
		
		Account theacct = atm.retrieveAccount(atm.Acctname(),atm.acctPIN());
		
		
		
		System.out.println(theacct.toString());
		
		double withdrewal = theacct.withdraw(50000);
		
		
		System.out.println(withdrewal);

	}

}
