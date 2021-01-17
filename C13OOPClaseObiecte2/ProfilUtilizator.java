package C13OOPClaseObiecte2;

import java.util.Scanner;

public class ProfilUtilizator {
	
	String nume;
	String prenume;
	String email;
	String nrTel;
	int dataNasterii;
	int lunaNasterii;
	int anulNasterii;
	String gen;
	
	public void initializeazaProfil() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Nume:");
		String numeCitit = sc.nextLine();
		
		System.out.println("Prenume:");
		String prenumeCitit = sc.nextLine();
		
		System.out.println("email:");
		String emailCitit = sc.nextLine();
		
		System.out.println("Numar de telefon:");
		String nrTelCitit = sc.nextLine();
		
		System.out.println("Data nasterii:");
		System.out.println("Data:");
		int dataNasteriiCitita = sc.nextInt();
		
		System.out.println("Luna:");
		int lunaNasteriiCitita = sc.nextInt();
		
		System.out.println("Anul:");
		int anulNasteriiCitit = sc.nextInt();
		
		System.out.println("Gen:");
		String genCitit = sc.nextLine();
		
		genCitit = sc.nextLine();
		
		nume = numeCitit;
		prenume = prenumeCitit;
		email = emailCitit;
		nrTel = nrTelCitit;
		dataNasterii = dataNasteriiCitita;
		lunaNasterii = lunaNasteriiCitita;
		anulNasterii = anulNasteriiCitit;
		gen = genCitit;

	}
	
	public void actualizareEmail(String newEmail) {
		email = newEmail;
	}
	
	public void actualizareNumarTelefon(String newNo) {
		nrTel = newNo;
	}
	
	public void afisareVarsta() {
		int varsta = 2020 - anulNasterii;
		System.out.println("Varsta: " + varsta);
	}
	
	public void afisareStareInterna() {
		System.out.println("Detalii despre " + prenume + " " + nume + ":"
						+"\n\t Email: " + email
						+"\n\t Numar de telefon: " + nrTel
						+"\n\t Data Nasterii: " + dataNasterii + "." + lunaNasterii + "." + anulNasterii
						+"\n\t Gen: " + gen);
		
	}
}
