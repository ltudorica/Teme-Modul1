package C6IfWhile;
import java.util.Scanner;

public class If4Broken {
	public static void main(String[] args) {
	 /* pinClient si pinCorect - string
	  * if (pinClient.equals(pinCorect))
	  * pe o alta ramura de else if/else am bagat (pinClient.length() !=4)
	  */
		Scanner sc = new Scanner(System.in);
		
		int pinCorect = 1234;			
		System.out.println("Introduceti codul PIN");
		int pinClient = sc.nextInt();
		int soldCont;
		int raspBalanta;
		int nouaB;
	
		if (pinClient <= 9999) {
			if (pinClient == pinCorect) {
				System.out.println("PIN corect");
					
				soldCont = 5_000;
				System.out.println("Soldul dvstra este: " + soldCont + " lei");
					
				System.out.println("Suma pe care doriti sa o retrageti:");
				int suma = sc.nextInt();
					
				if (suma < 10) { //4.2 + daca valoarea este mai mica decat 10 lei
					System.out.println("Suma minima ce poate fi retrasa este: 10 lei.");
					System.out.println("Suma pe care doriti sa o retrageti:");
					suma = sc.nextInt(); 
					if (suma >= 10 && (suma % 10 == 0)) {
						System.out.println("Tranzactie in curs de procesare");
						nouaB = (soldCont - suma);
						System.out.println("Doriti afisarea noii balante a contului curent? "
											+ "Raspundeti cu 0 (NU), 1 (DA) sau 2 (Alta tranzactie).");
						raspBalanta = sc.nextInt();
							if (raspBalanta == 1) {
								System.out.println("Noua balanta este: " + nouaB + " lei.");
							} else if (raspBalanta == 2) {
								System.out.println("Suma pe care doriti sa o retrageti:");
								suma = sc.nextInt();
								if ((suma <= nouaB) && (suma >= 10) && (suma % 10 == 0)) { 
									// 4.5 daca suma ramasa e mai mare de 0
									System.out.println("Tranzactie in curs de procesare");	
									System.out.println("Doriti afisarea noii balante a contului curent? "
											+ "Raspundeti cu 0 (NU), 1 (DA)");
									raspBalanta = sc.nextInt();
									if (raspBalanta == 1) {
										nouaB = (nouaB - suma);
										System.out.println("Noua balanta este: " + nouaB + " lei.");
									} else { 
										System.out.println("Multumim pentru ca ati ales Banca DevBank.");
									}
								} else { 
									System.out.println("Multumim pentru ca ati ales Banca DevBank.");
								}
							} else {
								System.out.println("Multumim pentru ca ati ales Banca DevBank.");
							}
					} else {
						System.out.println("Va rugam incercati mai tarziu.");
					}
				} else if (suma <= soldCont) {
					if (suma % 10 == 0) {
						System.out.println("Tranzactie in curs de procesare");
						System.out.println("Doriti afisarea noii balante a contului curent? "
											+ "Raspundeti cu 0 (NU), 1 (DA) sau 2 (Alta tranzactie)."); // 4.4
						raspBalanta = sc.nextInt();
							if (raspBalanta == 1) {
								nouaB = (soldCont - suma);
								System.out.println("Noua balanta este: " + nouaB + " lei.");
							} else if ((raspBalanta == 2) && (suma <= soldCont)) {
								System.out.println("Suma pe care doriti sa o retrageti:");
								suma = sc.nextInt();
								nouaB = (soldCont - suma);
								if ((suma <= nouaB) && (suma >= 10) && (suma % 10 == 0)) {
									System.out.println("Tranzactie in curs de procesare");	
									System.out.println("Doriti afisarea noii balante a contului curent? "
											+ "Raspundeti cu 0 (NU), 1 (DA)");
									raspBalanta = sc.nextInt();
									if (raspBalanta == 1) {
										nouaB = (nouaB - suma);
										System.out.println("Noua balanta este: " + nouaB + " lei.");
									} else { 
										System.out.println("Multumim pentru ca ati ales Banca DevBank.");
									}
								} else { 
									System.out.println("Multumim pentru ca ati ales Banca DevBank.");
								}
							} else {
								System.out.println("Multumim pentru ca ati ales Banca DevBank.");
							}
					} else {
						System.out.println("Suma trebuie sa fie multiplu de 10."); //4.3
						System.out.println("Suma pe care doriti sa o retrageti:");
						suma = sc.nextInt();
						if (suma % 10 == 0) {
							System.out.println("Tranzactie in curs de procesare");
							System.out.println("Doriti afisarea noii balante a contului curent? "
												+ "Raspundeti cu 0 (NU), 1 (DA) sau 2 (Alta tranzactie).");
							raspBalanta = sc.nextInt();
								if (raspBalanta == 1) {
									nouaB = (soldCont - suma);
									System.out.println("Noua balanta este: " + nouaB + " lei.");
								} else if ((raspBalanta == 2) && (soldCont >= 10)) {
									System.out.println("Suma pe care doriti sa o retrageti:");
									suma = sc.nextInt();
									nouaB = (soldCont - suma);
									if ((suma <= nouaB) && (suma >= 10) && (suma % 10 == 0)) {
										System.out.println("Tranzactie in curs de procesare");	
										System.out.println("Doriti afisarea noii balante a contului curent? "
												+ "Raspundeti cu 0 (NU), 1 (DA)");
										raspBalanta = sc.nextInt();
										if (raspBalanta == 1) {
											nouaB = (nouaB - suma);
											System.out.println("Noua balanta este: " + nouaB + " lei.");
										} else { 
											System.out.println("Multumim pentru ca ati ales Banca DevBank.");
										}
									} else { 
										System.out.println("Multumim pentru ca ati ales Banca DevBank.");
									}
								} else {
									System.out.println("Multumim pentru ca ati ales Banca DevBank.");
								}
						} else {
							System.out.println("Va rugam incercati mai tarziu.");
						}
					}
				} else {
					System.out.println("Fonduri insuficiente pentru realizarea tranzactiei, "
										+ "va rugam incercati o suma disponibila in sold");
					System.out.println("Soldul dvstra este: " + soldCont + " lei");
					suma = sc.nextInt();
					if (suma <= soldCont) {
						if (suma % 10 == 0) {
							System.out.println("Tranzactie in curs de procesare");
							System.out.println("Doriti afisarea noii balante a contului curent? "
												+ "Raspundeti cu 0 (NU), 1 (DA) sau 2 (Alta tranzactie).");
							raspBalanta = sc.nextInt();
								if (raspBalanta == 1) {
									nouaB = (soldCont - suma);
									System.out.println("Noua balanta este: " + nouaB + " lei.");
								} else if ((raspBalanta == 2)) {
									System.out.println("Suma pe care doriti sa o retrageti:");
									suma = sc.nextInt();
									nouaB = (soldCont - suma);
									if ((suma <= nouaB) && (suma >= 10) && (suma % 10 == 0)) {
										System.out.println("Tranzactie in curs de procesare");	
										System.out.println("Doriti afisarea noii balante a contului curent? "
												+ "Raspundeti cu 0 (NU), 1 (DA)");
										raspBalanta = sc.nextInt();
										if (raspBalanta == 1) {
											nouaB = (nouaB - suma);
											System.out.println("Noua balanta este: " + nouaB + " lei.");
										} else { 
											System.out.println("Multumim pentru ca ati ales Banca DevBank.");
										}
									} else { 
										System.out.println("Multumim pentru ca ati ales Banca DevBank.");
									}
								} else {
									System.out.println("Multumim pentru ca ati ales Banca DevBank.");
								}
						} else {
							System.out.println("Suma trebuie sa fie multiplu de 10.");
							System.out.println("Suma pe care doriti sa o retrageti:");
							suma = sc.nextInt();
								if (suma % 10 == 0) {
									System.out.println("Tranzactie in curs de procesare");
									System.out.println("Doriti afisarea noii balante a contului curent? "
														+ "Raspundeti cu 0 (NU), 1 (DA) sau 2 (Alta tranzactie).");
									raspBalanta = sc.nextInt();
										if (raspBalanta == 1) {
											nouaB = (soldCont - suma);
											System.out.println("Noua balanta este: " + nouaB + " lei.");
										} else if (raspBalanta == 2) {
											System.out.println("Suma pe care doriti sa o retrageti:");
											suma = sc.nextInt();
											nouaB = (soldCont - suma);
											if ((suma <= nouaB) && (suma >= 10) && (suma % 10 == 0)) {
												System.out.println("Tranzactie in curs de procesare");	
												System.out.println("Doriti afisarea noii balante a contului curent? "
														+ "Raspundeti cu 0 (NU), 1 (DA)");
												raspBalanta = sc.nextInt();
												if (raspBalanta == 1) {
													nouaB = (nouaB - suma);
													System.out.println("Noua balanta este: " + nouaB + " lei.");
												} else { 
													System.out.println("Multumim pentru ca ati ales Banca DevBank.");
												}
											} else { 
												System.out.println("Multumim pentru ca ati ales Banca DevBank.");
											}
										} else {
											System.out.println("Multumim pentru ca ati ales Banca DevBank.");
										}
								} else {
									System.out.println("Va rugam incercati mai tarziu.");
								}
							}
						} else {
							System.out.println("Va rugam incercati mai tarziu.");
						}
					}
				} else {
					System.out.println("PIN gresit");				
				}
			} else {
					System.out.println("Pin-ul introdus este format din prea multe cifre."); // 4.1
			} 
		
		sc.close();
	}
}
