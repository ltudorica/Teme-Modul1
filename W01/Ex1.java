package W01;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int maxExponent = sc.nextInt();
		int power = 1;
		
		for (int currentExponent = 0; currentExponent <= maxExponent; currentExponent++) {
			for (int it = 0; it < currentExponent; it++) {
				power *= base;
			}
			System.out.println("Base: " + base + " power " + currentExponent + " = " + power);
		}
	
		sc.close();
		
	}
}
