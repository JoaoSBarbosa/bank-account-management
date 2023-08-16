package entitie;

public class Account {
	private int account;
	private String holder;
	private double accountBalance;
	
	
	public Account(int account, String holder, double depositValue) {
		this.account = account;
		this.holder = holder;
		accountBalance = depositValue;
	}
	public Account(int account, String holder) {
		this.account = account;
		this.holder = holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public String getHolder() {
		return holder;
	}
	
	public int getAccount() {
		return account;
	}
	
	public double getDepositValue() {
		return accountBalance;
	}
	
	public void addDeposit(double depositValue) {
		accountBalance += depositValue;
	}
	public void withdrawFunds(double depositValue) {
		accountBalance -= (depositValue + 5);
	}
	
	public String toString() {
		return 
				"Account "
				+account
				+", Holder: "
				+holder
				+", Balance: $ "
				+String.format("%.2f", accountBalance);
	}
}
