package W01;
import java.util.Scanner;

public class Ex4_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numarul ales este:");
		int n = sc.nextInt();
		boolean isPrime = true;

		for (int it = 2; it < n; it++) {
			if (n % it == 0) {
				isPrime = false;
			}
		}
	
		if (isPrime) {
			System.out.println(n + " este numar prim!");
		} else {
			System.out.println(n + " nu este numar prim.");
		}

		sc.close();
	}	
}
