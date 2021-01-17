package W01;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int myInitialNo = n;
		int CounterNo = 0;
		int perfectRound = 1;
		
		while (n != 0) {
			int restNo = n % 10;
			n /= 10;
			CounterNo++;
		}
		
		for (int currExp = 0; currExp < CounterNo; currExp++) {
			for (int it = 0; it < currExp; it++) {
			perfectRound *= 10;
			}
		}
		System.out.println("Complementarul numerului " + myInitialNo + " este: " + (perfectRound - myInitialNo));
		


	/* int n = nr citit de la tastatura
	 * sparg nr n pe cifre
	 * - aflu nr de cifre ale lui n
	 * aflu primul nr rotund perfect (10 la puterea nr de cifre)
	 * aflu complementarul lui n (rotundPerfect - n)
	 */
		
		sc.close();
	}
}
