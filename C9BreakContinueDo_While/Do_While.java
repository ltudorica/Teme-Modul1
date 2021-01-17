package C9BreakContinueDo_While;
import java.util.Scanner;

public class Do_While {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numarMagic = 5;
		System.out.println("Hola! Te invit sa ghicesti un numar aflat in intervalul 0 - 10");
		int numarGhicit;
		
		do {
			System.out.println("Care crezi ca e numarul?");
			numarGhicit = sc.nextInt();
			if (numarGhicit < 0 || numarGhicit > 10) {
				System.out.println("Atentie! Numarul magic se afla in intervalul 0 - 10");
			} else if (numarGhicit > numarMagic) {
				System.out.println("Esti aproape! Dar numarul magic este mai mic.");
			} else if (numarGhicit < numarMagic) {
				System.out.println("Esti aproape! Dar numarul magic este mai mare.");
			} 
		} while (numarGhicit != numarMagic); 

		
		System.out.println("Ai ghicit! In sfarsit! :)");
		
		sc.close();
	}
}
