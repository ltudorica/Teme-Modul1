package C11Metode_Void;
import java.util.Scanner;

public class Ex4 {
	
	public static boolean nrPalindrom(int number) {
		
		int myNewNumber = 0;
		int myRest = 0;
		boolean nrPalindrom = false;
		int myInitialNo = number;
		while (myInitialNo != 0) {
			myRest = myInitialNo % 10;
			myInitialNo /= 10;
			myNewNumber = myNewNumber * 10 + myRest;
		}
		if (myNewNumber == number ) {
			nrPalindrom = true;
		} 
		
		return nrPalindrom;
	}
	
	public static void nrPalindrome(int number) {
		for (int it = 0; it <= number; it++) {
			if (nrPalindrom(it)) {
				System.out.print(it + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int myNumber = sc.nextInt();
		System.out.print("Toate numerele palindrom pana la " + myNumber + " sunt: ");
		nrPalindrome(myNumber);
		
		sc.close();
	}
}
