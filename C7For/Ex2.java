package C7For;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The number is:");
		int myInitialNumber = sc.nextInt();
		int startNumber = 0;
		int myNumber = myInitialNumber;
		 
		System.out.print("Sirul numerelor naturale in ordine crescatoare de la 0 pana la "
						+ "numarul ales este: ");
		for (; startNumber <= myNumber; ++startNumber) {
		  	System.out.print(startNumber + ", ");
		}

		System.out.print("\nSirul numerelor impare in ordine crescatoare de la 1 pana la "
						+ "numarul ales este: ");
		for (startNumber = 1; startNumber <= myNumber; startNumber += 2) {
			System.out.print(startNumber +  ", ");
		}
		
	
		System.out.print("\nSirul numerelor pare in ordine descrescatoare pana la 0 este: ");
		myNumber = myInitialNumber - myInitialNumber % 2;
		for (; myNumber >= 0; myNumber -= 2) {
			System.out.print(myNumber + ", ");
		}

		System.out.print("\nToate numerele multiplu de 5 in ordine crescatoare de la 0 sunt: ");
		for (startNumber = 0; startNumber <= myInitialNumber; startNumber += 5) {
			System.out.print(startNumber + ", ");
		} 

		sc.close();
		}

}
