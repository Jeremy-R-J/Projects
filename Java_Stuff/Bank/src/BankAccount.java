import java.util.Random;

public class BankAccount {
	//static stuff
	public static int numAccounts =0;
	public static double totHoldings=0;
	private static String generateId() {
		String subst="";
		Random r =new Random();
		for (int i =0;i<10;i++) {
			subst+=r.nextInt(10);
		}
		return subst;
	}
	
//object stuff
private String accountNumber;
private double checkingBalance;
private double savingsBalance;

public BankAccount() {
	BankAccount.numAccounts+=1;
	this.checkingBalance=0;
	this.savingsBalance=0;
	this.setAccountNumber(BankAccount.generateId());
}
public double getCheckingBalance() {
	return this.checkingBalance;
	
}
public double getSavingsBalance() {
	return this.savingsBalance;
	
}
public void depositMoney(double amount, String account) {
	if(account.equals("savings"))
		this.savingsBalance+= amount;
	else if(account.equals("checking"))
		this.checkingBalance+= amount;
	BankAccount.totHoldings += amount;
}
public void withdrawMoney(double amount, String account) {
	boolean works = false;
	if(account.equals("savings")) {
		//checks if enough
		if (this.checkingBalance-amount>=0) {
			works=true;
			this.savingsBalance -= amount;
		}
	}
	else if (account.equals("checking")) {
		//check
		if (this.checkingBalance-amount >=0) 
			works=true;
			this.checkingBalance -= amount;
	if (works) {
		BankAccount.totHoldings-= amount;
	}
	}}
public void displayBalance() {
		// //%.2 format for money
		System.out.println(String.format("Savings: %.2f , Checking: %.2f , this.savingsBalance, this.checkingBalance"));
		
	}
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
	






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













