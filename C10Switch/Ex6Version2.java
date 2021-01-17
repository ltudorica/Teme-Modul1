package C10Switch;
import java.util.Scanner;

public class Ex6Version2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Program for dummies");
		String luna;
		char lunaChar;
		

		do {
			System.out.println("Introduceti o litera si voi afisa lunile care incep cu aceasta litera:");
			luna = sc.nextLine();
			lunaChar = luna.charAt(0);
			switch (lunaChar) {
				case 'a':
				case'A':
					System.out.println("Aprilie\nAugust");
					break;
				case 'f':
				case 'F':
					System.out.println("Februarie");
					break;
				case 'd':
				case 'D':
					System.out.println("Decembrie");
					break;
				case 'i':
				case 'I':
					System.out.println("Ianuarie\nIunie\nIulie");
					break;
				case 'm':
				case 'M':
					System.out.println("Martie\nMai");
					break;
				case 'n':
				case'N':
					System.out.println("Noiembrie");
					break;
				case 'o':
				case 'O':
					System.out.println("Octombrie");
					break;
				case 's':
				case 'S':	
					System.out.println("Septembrie");
					break;
				default:
					System.out.println("Nicio luna nu incepe cu litera '" + luna + "'");
					break;
			}
		} while (lunaChar != 'x' && lunaChar != 'X'); 
		
		System.out.println("Programul se inchide...");
		
		sc.close();
	}
}
