package C8ControlulFluxului;
import java.util.Scanner;

public class Ex2_3Bonus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduceti numerul de literali");
		int n = sc.nextInt();
		int myNumber;
		int myInitialNo;
		int nrTotCifre = 0;
		int minNrCifre = Integer.MAX_VALUE;
		int maxNrCifre = Integer.MIN_VALUE;
		int minValue = 0;
		int maxValue = 0;
		
		for (int it = 0; it < n; it++) {
			System.out.println("Numarul " + (it+1) + " din " + n + " este:");
			myNumber = sc.nextInt();
			myInitialNo = myNumber;
			nrTotCifre = 0;
			while (myNumber != 0) {
				int restNo = myNumber % 10;
				myNumber /= 10;
				nrTotCifre++;
			}
			if (nrTotCifre < minNrCifre) {
				minNrCifre = nrTotCifre;
				minValue = myInitialNo;
			} 
			if (nrTotCifre > maxNrCifre) {
				minNrCifre = nrTotCifre;
				maxValue = myInitialNo;
			}
		}

		System.out.println("Numarul cu cele mai putine cifre este: " + minValue);
		System.out.println("Numarul cu cele mai multe cifre este: " + maxValue);
		
		sc.close();
	}
}
