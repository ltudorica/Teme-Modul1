package C12SupraincarcareaMetodelor;
import java.util.Scanner;

public class Ex0Rezolvat {
	public static long nFactorial(int value) {
		if (value == 0 || value == 1) {
			return 1;
		}
		return value * nFactorial(value - 1);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numarul pentru care vrem sa calculam factorialul: ");
		int n = sc.nextInt();
		
		System.out.println(nFactorial(n));
		
		sc.close();
	}
}
