package C15Constructori;

public class BankAccount {
	private String firstName;
	private String lastName;
	private int accountBalance;
	private static String bankSWIFT;
	private int accountNumber;
	

	public BankAccount(String firstName, String lastName, int accountBalance, int accountNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountBalance = accountBalance;
		this.accountNumber = accountNumber;
	}

	public BankAccount(String firstName, String lastName) {
		this(firstName, lastName, 0, 0);
	}
	
	public BankAccount(int accountBalance, int accountNumber) {
		this("UNKNOWN_FIRST_NAME", "UNKNOWN_LAST_NAME", accountBalance, accountNumber);
	}
	
	public BankAccount(int accountNumber) {
		this("UNKNOWN_FIRST_NAME", "UNKNOWN_LAST_NAME", 0, accountNumber);
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}

	
	public boolean debitAccount(int amount) {
		if(amount <= accountBalance) {
			accountBalance -= amount;
			return true;
		}
		return false;
	}
	
	public void creditAccount(int amount) {
		accountBalance += amount;
	}
	
	protected void adminBlockAccount() {
		accountBalance = -1;
	}
	
	public int getAccountBalance() {
		return accountBalance;
	}

	/*public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}*/

	public static String getBankSWIFT() {
		return bankSWIFT;
	}

	public static void setBankSWIFT(String bankSWIFT) {
		BankAccount.bankSWIFT = bankSWIFT;
	}
	
}
