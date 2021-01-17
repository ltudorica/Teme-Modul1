package C11Metode_Void;
import java.util.Scanner;

public class Ex1 {
	public static boolean isPrime(int number) {
		boolean isPrime = true;
		for (int it = 2; it < number; it++) {
			if (number % it == 0) {
				return false;
			}
		}
		return isPrime;
	}
	
	public static void nrPrime(int number) {
		int it = 2;
		do {
			if (isPrime(it)) {
				System.out.print(it + " ");
			}
			it++;
		} while (it < number);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println("Numarul " + (isPrime(n) ? " " : "nu ") + "este prim");
		nrPrime(n);
		
		sc.close();
	}	
}
