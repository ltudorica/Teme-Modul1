package W01;
import java.util.Scanner;

public class Ex5_1Bonus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int minValue = Integer.MAX_VALUE;
		int verifDesrescator = 0;
		int it = 0;
		
		for (; it < n; it++) {
			int nrAles = sc.nextInt();
			if (nrAles <= minValue) {
				minValue = nrAles;
				verifDesrescator++;
			}
		}

		if (verifDesrescator == it) {
			System.out.println("Sir descrescator");
		} else {
			System.out.println("Nu este sir descrescator");
		}
		
		sc.close();
	}	

}
