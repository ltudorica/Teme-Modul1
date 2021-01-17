package W02;
import java.util.Scanner;

public class Algoritmi1_12 {
	public static boolean isPerfect(int number) {
		if (number <= 1) {
			return false;
		}
		int sum = 1;
		for (int it = 2; it < number; it++) {
			if (number % it == 0) {
				sum += it;
			}
		}
		return (sum == number);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numarul ales:");
		int numarAles = sc.nextInt();
		
		//Ex2
		System.out.print("Numerele perfecte pana la " + numarAles + " sunt:\n");
		for (int it = 0; it < numarAles; it++) {
			if (isPerfect(it)) {
				System.out.print(it + " ");
			}
		}
		
		//Ex1
		System.out.println();
		System.out.println("Numarul " + numarAles + (isPerfect(numarAles) ? "" : " nu") + " este numar perfect");
		
		sc.close();
	}
}
