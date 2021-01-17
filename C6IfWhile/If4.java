package C6IfWhile;
import java.util.Scanner;

public class If4 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String pinCorect = "1234";
		System.out.println("Introduceti codul PIN");
		String pinClient;
		int soldCont;
		int suma;
		int raspBalanta;
		int nouaB;
		// while 
		pinClient = sc.nextLine();
		if (pinClient.equals(pinCorect)) {
			System.out.println("PIN corect");
			soldCont = 5_000;
			System.out.println("Soldul dvstra este: " + soldCont + " lei");
			System.out.println("Suma pe care doriti sa o retrageti:");
			suma = sc.nextInt();
				if (suma <= soldCont) {
					if (suma >= 10) { //4.2 + mai mare decat 0 - pt suma e 0 se poate fol != 0
						if (suma % 10 == 0) { 
						System.out.println("Tranzactie in curs de procesare");
						nouaB = soldCont - suma;
						System.out.println("Doriti afisarea noii balante a contului curent? "
											+ "Raspundeti cu 0 (NU), 1 (DA) sau 2 (Alta Tranzactie).");
						raspBalanta = sc.nextInt();
							if (raspBalanta == 1) {
								System.out.println("Noua balanta este: " + nouaB + " lei.");
							} else if (raspBalanta == 2) {
								System.out.println("Soldul dvstra este: " + nouaB + " lei");
								System.out.println("Suma pe care doriti sa o retrageti:");
								suma = sc.nextInt();
								if (suma <= nouaB) {
									if (suma >= 10) {
										if (suma % 10 == 0) { 
										System.out.println("Tranzactie in curs de procesare");
										nouaB = nouaB - suma;
										System.out.println("Doriti afisarea noii balante a contului curent? "
															+ "Raspundeti cu 0 (NU), 1 (DA).");
										raspBalanta = sc.nextInt();
											if (raspBalanta == 1) {
												System.out.println("Noua balanta este: " + nouaB + " lei.");
											} else {
											System.out.println("Multumim pentru ca ati ales Banca DevBank.");
											}
										} else {
										System.out.println("Suma aleasa trebuie sa fie multipla de 10."); //4.3
										}
									} else {
									System.out.println("Suma aleasa trebuie sa fie de minim 10 lei.");
									}
								} else {
								System.out.println("Fonduri insuficiente pentru realizarea tranzactiei");
								}
								
							} else {
								System.out.println("Multumim pentru ca ati ales Banca DevBank.");
							}
						} else {
							System.out.println("Suma aleasa trebuie sa fie multipla de 10."); //4.3
						}
					} else {
						System.out.println("Suma aleasa trebuie sa fie de minim 10 lei.");
					}
				} else {
					System.out.println("Fonduri insuficiente pentru realizarea tranzactiei");
				}
		} else {
			if ((pinClient.length() > 4)) {
				System.out.println("Pin-ul introdus este format din prea multe cifre."); // 4.1
			} else {
				System.out.println("PIN gresit");
			}
		}

		sc.close();
	}
}
