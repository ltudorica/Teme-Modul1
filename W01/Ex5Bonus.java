package W01;
import java.util.Scanner;

public class Ex5Bonus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int maxValue = Integer.MIN_VALUE;
		int verifCrescator = 0;
		int it = 0;
		
		for (; it < n; it++) {
			int nrAles = sc.nextInt();
			if (nrAles >= maxValue) {
				maxValue = nrAles;
				verifCrescator++;
			}
		}

		if (verifCrescator == it) {
			System.out.println("Sir crescator");
		} else {
			System.out.println("Nu este sir crescator");
		}
		
		sc.close();
	}	
}
