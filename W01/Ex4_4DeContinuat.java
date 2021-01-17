package W01;
import java.util.Scanner;

public class Ex4_4DeContinuat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Numarul ales este:");
		int numarAles = sc.nextInt();
		boolean isPrimeNo = true;
		int rezImpartire = numarAles;
		boolean isPrimeResult = true;
		int putere = 0;

		for (int it = 2; it < numarAles; it++) {
			if (numarAles % it == 0) {
				isPrimeNo = false;
				for (int i = 2; i < it; i++) {
					if (it % i != 0) {
						isPrimeResult = true;
						rezImpartire /= i;
						System.out.print(i + " * ");
					}
				}
			} 
		}

		
		if (isPrimeNo) {
			System.out.println(numarAles);
		}

		
		
		sc.close();
	}
}

