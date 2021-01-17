package C6IfWhile;
import java.util.Scanner;

public class While3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduceti un numar natural pozitiv:");
		int positiveNumber = sc.nextInt();
		int doubleNumber;

		while (positiveNumber > 0) {
			doubleNumber = positiveNumber * 2;
		  	System.out.print("Dublul sau este: " + doubleNumber);
			System.out.println("\nIntroduceti un numar natural pozitiv:");
			positiveNumber = sc.nextInt();
		}
		System.out.println("La revedere!");

		sc.close();
		}

}
