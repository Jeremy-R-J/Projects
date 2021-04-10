
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount bank= new BankAccount();
		bank.depositMoney(512.36 , "checking");
		bank.depositMoney(10.99 , "savings");
		bank.displayBalance();
		System.out.println(BankAccount.totHoldings);
		
		bank.withdrawMoney(10.00, "savings");
		bank.withdrawMoney(512.00, "checking");
		bank.displayBalance();
		System.out.println(BankAccount.totHoldings);
		
	}
	}



