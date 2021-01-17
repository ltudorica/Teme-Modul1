package C8ControlulFluxului;
import java.util.Scanner;

public class Ex1_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numarul x este:");
		int x = sc.nextInt();
		int suma = 0;
		
		while (x != 0) {
			int lastDigit = x % 10;
			suma += lastDigit;
			x /= 10;
		}
		
		System.out.println("Suma cifrelor este: " + suma);
		
		sc.close();
	}
}
