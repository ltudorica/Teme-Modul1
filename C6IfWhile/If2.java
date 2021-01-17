package C6IfWhile;
import java.util.Scanner;

public class If2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numarul ales este:");
		int n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("Numarul " + n + " este numar par.");
		} else {
			System.out.println("Numarul " + n + " este numar impar.");
		}
		
	
		sc.close();
	}
}
