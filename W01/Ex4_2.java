package W01;
import java.util.Scanner;

public class Ex4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numarul ales este:");
		int numarAles = sc.nextInt();
		boolean isPrime;
		int i = 2;
		

		do {
			isPrime = true;
			for (int it = 2; it < i; it++) {
				if (i % it == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.print(i + " ");
			}
			i++;
		} while (i < numarAles);
		
		sc.close();
	}
}
