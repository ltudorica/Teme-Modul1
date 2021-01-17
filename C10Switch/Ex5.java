package C10Switch;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bine ati venit!");

		int n;
		int sold = 5000;
		int sumaRetragere;
		int sumaDepunere;
		float cursValutarE = 4.85F;
		float cursValutarD = 4.09F;
		int sumaMaxima = 2500;

		do {
			System.out.println("\n1. Interogare Sold\n2. Retragere Numerar\n3. Depunere Numerar");
			System.out.println("4. Curs Valutar\n5. Info\n6. Iesire\n7. Ajutor");
			n = sc.nextInt();
			switch (n) {
				case 1:
					System.out.println("Soldul dumneavoastra este de " + sold + " lei");
					break;
				case 2:
					do {
						System.out.println("Soldul dumneavoastra este de " + sold + " lei");
						System.out.println("Suma pe care doriti sa o retrageti:");
						sumaRetragere = sc.nextInt();						
						if (sumaRetragere <= sold && sumaRetragere % 10 == 0 && sumaRetragere <= sumaMaxima) {
							sold -= sumaRetragere;
							System.out.println("Noul sold disponibil este de " + sold + " lei");
							break;
						} else if (sumaRetragere <= sold && sumaRetragere % 10 != 0){
							System.out.println("Suma introdusa trebuie sa fie multipla de 10.");
							continue;
						} else if (sumaRetragere <= sold && sumaRetragere > sumaMaxima){
							System.out.println("Suma maxima ce poate fi retrasa este de " + sumaMaxima + "lei.");
							continue;
						} else {
							System.out.println("Sold indisponibil!");
							continue;
						}
					} while (sumaRetragere != 0);
					break;
				case 3:
					do {
						System.out.println("Suma pe care doriti sa o depuneti:");
						sumaDepunere = sc.nextInt();
						if (sumaDepunere % 10 == 0 && sumaDepunere <= sumaMaxima) {
							sold += sumaDepunere;
							System.out.println("Noul sold disponibil este de " + sold + " lei");
							break;
						} else if (sumaDepunere % 10 != 0){
							System.out.println("Suma pe care o depuneti trebuie sa fie multipla de 10.");
							continue;
						} else if (sumaDepunere > sumaMaxima){
							System.out.println("Suma maxima ce poate fi depusa este de " + sumaMaxima + " lei.");
							continue;
						}
					} while (sumaDepunere != 0);
					break;
				case 4:
					System.out.println("Cursul valutar in acest moment este:");
					System.out.println("Euro  - vanzare: " + cursValutarE + " lei / cumparare: " + (cursValutarE - 0.2F) + " lei");
					System.out.println("Dolar - vanzare: " + cursValutarD + " lei / cumparare: " + (cursValutarD - 0.2F) + " lei");
					break;
				case 5:
					System.out.println("Lily's Bank");
					System.out.println("Contacteaza-ne!\nIti stam la dispozitie 24/7");
					System.out.println("e-mail: contact.center@lilysbank.ro");
					System.out.println("telefon: 2227");
					break;
				case 6:	
					System.out.println("Va multumim pentru vizita la Lily's Bank");
					break;
				default:
					continue;
			} 
		} while (n != 6);

		sc.close();
	}	
}
