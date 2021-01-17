package C6IfWhile;
import java.util.Scanner;

public class If3 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int pinCorect = 1234;
		
		System.out.println("Introduceti codul PIN");
		int pinClient = sc.nextInt();
		
		if (pinClient == pinCorect) {
			System.out.println("PIN corect");
			
			int soldCont = 5_000;
			System.out.println("Soldul dvstra este: " + soldCont + " lei");
			
			System.out.println("Suma pe care doriti sa o retrageti");
			int suma = sc.nextInt();
			
			if (suma <= soldCont) {
				System.out.println("Tranzactie in curs de procesare");
				System.out.println("Doriti afisarea noii balante a contului curent? "
									+ "Raspundeti cu 0 (NU) sau 1 (DA).");
				int raspBalanta = sc.nextInt();
				if (raspBalanta == 1) {
					System.out.println("Noua balanta este: " + (soldCont - suma)
										+ " lei.");
				} else {
					System.out.println("Multumim pentru ca ati ales Banca DevBank.");
				}
			} else {
				System.out.println("Fonduri insuficiente pentru realizarea tranzactiei");
			}
		} else {
			System.out.println("PIN gresit");
		}
		
		
		sc.close();
	}
}
