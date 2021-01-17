package C10Switch;
import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Program for dummies");
		String luna;
		
		do {
			System.out.println("Introduceti o litera si voi afisa lunile care incep cu aceasta litera:");
			luna = sc.nextLine();
			if (luna.equalsIgnoreCase("a")) {
				System.out.println("Aprilie\nAugust");
			} else if (luna.equalsIgnoreCase("f")) {
				System.out.println("Februarie");
			} else if (luna.equalsIgnoreCase("d")) {
				System.out.println("Decembrie");
			}	else if (luna.equalsIgnoreCase("i")) {
				System.out.println("Ianuarie\nIunie\nIulie");
			} else if (luna.equalsIgnoreCase("m")) {
				System.out.println("Martie\nMai");
			} else if (luna.equalsIgnoreCase("n")) {
				System.out.println("Noiembrie");
			} else if (luna.equalsIgnoreCase("o")) {
				System.out.println("Octombrie");
			} else if (luna.equalsIgnoreCase("s")) {
				System.out.println("Septembrie");
			} else {
				System.out.println("Nicio luna nu incepe cu litera '" + luna + "'");
			}
		} while (!luna.equalsIgnoreCase("x"));
		
		System.out.println("Programul se inchide...");
		
		sc.close();
	}
}
