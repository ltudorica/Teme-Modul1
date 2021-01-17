package C8ControlulFluxului;
import java.util.Scanner;

public class Ex2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduceti numerul de literali");
		int n = sc.nextInt();
		int myNumber;
		int div7Number = 0;
		int div5Number = 0;
		int lastDigit379 = 0;
		int nrTotCifre = 0;
		int restNo = 0;
		int primaCifra2 = 0;
		
		
		for (int it = 0; it < n; it++) {
			System.out.println("Numarul " + (it+1) + " din " + n + " este:");
			myNumber = sc.nextInt();
			if (myNumber % 7 == 0) {
				div7Number++;
			} else if (myNumber % 5 == 0) {
				div5Number++;
			}
			if ((myNumber % 10 == 3) || (myNumber % 10 == 7) || (myNumber % 10 == 9)) {
				lastDigit379++;
			}
			while (myNumber != 0) {
				restNo = myNumber % 10;
				myNumber /= 10;
				nrTotCifre++;
			}
			if (restNo == 2){
				primaCifra2++;
			}
		}
		
		System.out.println("Numere divizibile cu 7: " + div7Number);
		System.out.println("Numere care au suma cifrelor divizibila cu 5: " + div5Number);
		System.out.println("Numere care au ultima cifra 3, 7 sau 9: " + lastDigit379);
		System.out.println("Numarul total de cifre ale numerelor: " + nrTotCifre);
		System.out.println("Numere care au prima cifra 2: " + primaCifra2);
		
		sc.close();
	}
}
