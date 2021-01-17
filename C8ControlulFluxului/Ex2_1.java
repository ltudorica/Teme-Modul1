package C8ControlulFluxului;
import java.util.Scanner;

public class Ex2_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduceti numerul de literali");
		int n = sc.nextInt();
		
		System.out.println("Numarul 1 din " + n + " este:");
		int numberIs = sc.nextInt();
		
		int minValue = numberIs;
		int maxValue = numberIs;
		int sum = 0;
		
		for (int it = 1; it < n; it++) {
			System.out.println("Numarul " + (it +1) + " din " + n + " este:");
			numberIs = sc.nextInt();
			if (numberIs < minValue) {
				minValue = numberIs;
			} else if (numberIs > maxValue) {
				maxValue = numberIs;
			}
			sum += numberIs;
		}
		
		System.out.println("Cel mai mic numar este: " + minValue);
		System.out.println("Cel mai mare numar este: " + maxValue);
		System.out.println("Media aritmetica a numerelor este: " + (sum * 1.0d / n));
		
		sc.close();
	}
}
