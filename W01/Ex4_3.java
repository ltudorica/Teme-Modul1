package W01;
import java.util.Scanner;

public class Ex4_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Numarul ales este:");
		int numarAles = sc.nextInt();
		boolean isPrime = true;

		for (int it = 2; it < numarAles; it++) {
			if (numarAles % it == 0) {
				isPrime = false;
				System.out.print(it + " ");
			} 
		}
		if (isPrime) {
			System.out.println("Numarul este prim.");
		}
		
		sc.close();
	}
}
