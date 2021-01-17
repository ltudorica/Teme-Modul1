package C15Constructori;

public class Main {
	public static void main(String[] args) {
			BankAccount johnAccount = new BankAccount("John", "Dow", 100, 12345);

			johnAccount.adminBlockAccount();
			
			System.out.println(johnAccount.getAccountBalance());
			BankAccount.setBankSWIFT("DeCeNu");
			
			System.out.println(BankAccount.getBankSWIFT());
		
			BankAccount personA = new BankAccount("Chuck", "Norris", 100000, 9999);
			BankAccount personB = new BankAccount("Vin", "Diesel", 15251, 197548);

			System.out.println(personA.getFullName());
			System.out.println(personB.getFullName());
			
			personA.setBankSWIFT("ABCD");
			personB.setBankSWIFT("WTF");
			
			System.out.println(personA.getBankSWIFT());
			System.out.println(personB.getBankSWIFT());
			System.out.println(BankAccount.getBankSWIFT());
	}
}
