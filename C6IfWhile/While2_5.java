package C6IfWhile;
import java.util.Scanner;

public class While2_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The number is:");
		int myInitialNumber = sc.nextInt();
		int startNumber = 0;
		int myNumber = myInitialNumber;
		 
		System.out.print("Sirul numerelor naturale in ordine crescatoare de la 0 pana la "
						+ "numarul ales este: ");
		while (startNumber <= myNumber) {
		  	System.out.print(startNumber + ", ");
			++startNumber;
		}

		System.out.print("\nSirul numerelor impare in ordine crescatoare de la 1 pana la "
						+ "numarul ales este: ");
		startNumber = 1;
		while (startNumber <= myNumber) {
			System.out.print(startNumber +  ", ");
			startNumber += 2;
		}
		
		System.out.print("\nSirul numerelor pare in ordine descrescatoare pana la 0 este: ");
		myNumber = myInitialNumber - myInitialNumber % 2;
		while (myNumber >= 0) {
				System.out.print(myNumber + ", ");
				myNumber -= 2;
		} 

		System.out.print("\nToate numerele multiplu de 5 in ordine crescatoare de la 0 sunt: ");
		startNumber = 0;
		while (startNumber <= myInitialNumber) {
			System.out.print(startNumber + ", ");
			startNumber += 5;
		} 

		
		sc.close();
		}

}
