package C13OOPClaseObiecte2;

public class Main {
	public static void main(String[] args) {
		
		ProfilUtilizator user1 = new ProfilUtilizator();
		
		user1.initializeazaProfil();
		user1.actualizareEmail("blabla@yahoo.com");
		user1.actualizareNumarTelefon("0726505842");
		
		ProfilUtilizator user2 = new ProfilUtilizator();
		
		user2.initializeazaProfil();
		user2.actualizareEmail("anotherblabla@yahoo.com");
		user2.actualizareNumarTelefon("0741320212");
		
		user1.afisareStareInterna();
		user1.afisareVarsta();
		user2.afisareStareInterna();
		user2.afisareVarsta();
		// vezi capture scanner desktop
	}
}
