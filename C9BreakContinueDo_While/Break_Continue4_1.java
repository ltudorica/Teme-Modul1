package C9BreakContinueDo_While;
import java.util.Scanner;

public class Break_Continue4_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int myInitialNo = 0;
		
		while (myInitialNo >= 0) {
			System.out.println("My number is:");
			n = sc.nextInt();
			myInitialNo = n;
			int myNewNo = 0;
			while (n != 0) {
				int restNo = n % 10;
				n /= 10;
				myNewNo = myNewNo * 10 + restNo;
			} 
			if (myInitialNo < 0) {
				break;
			} else if ((myNewNo % 10 == 3) || (myNewNo % 10 == 7) || (myNewNo % 10 == 9)) {
				System.out.println();
				continue;
			} else {
			System.out.println("The simetric of " + myInitialNo + " is: " + myNewNo);
			}
		}

		sc.close();
	}
}
