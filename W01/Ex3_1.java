package W01;
import java.util.Scanner;

public class Ex3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numarul ales este:");
		int nrAles = sc.nextInt();
		int myInitialNo = nrAles;
		int restNo = 0;
		int nrSimetric = restNo;
		
		while (nrAles != 0) {
			restNo = nrAles % 10;
			nrAles /= 10;
			nrSimetric = nrSimetric * 10 + restNo;
		}
		
		if (myInitialNo == nrSimetric) {
			System.out.println("Palindrom!");
		} else {
			System.out.println("Nu este palindrom.");
		}

		sc.close();
	}
}
