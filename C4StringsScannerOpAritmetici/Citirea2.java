package C4StringsScannerOpAritmetici;
import java.util.Scanner;

public class Citirea2 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Data de fabricatie a autoturismului este:\n");
	
	System.out.println("anul (ex: 2000):");
	int anulFabricatiei = sc.nextInt();
	
	System.out.println("luna (ex: Octombrie):");
	String lunaFabricatiei = sc.next();
	
	System.out.println("ziua (ex: 25):");
	int ziuaFabricatiei = sc.nextInt();
	
	System.out.println("Numar inmatriculare autoturism (ex: B 25 DVM):");
	String nrInmatriculare = sc.next();
	
	nrInmatriculare = sc.nextLine();
	
	System.out.println("Numar kilometri la bord in momentul de fata (ex: 125423.79):");
	Double nrKmNow = sc.nextDouble();
	
	System.out.println("Numar kilometri la achizitie (ex: 0, 10587.71):");
	Double nrKmBuy = sc.nextDouble();

	System.out.println("Prenume:");
	String prenume = sc.next();
	
	System.out.println("Nume:");
	String nume = sc.next();
	
	System.out.println("Aveti permis de conducere?");
	boolean driversLicence = sc.nextBoolean();
	
	double nrKmParcursi = nrKmNow - nrKmBuy;
	int vechimeAutoturism = 2020 - anulFabricatiei;
	
	System.out.println("Multumim pentru timpul acordat, datele au fost salvate.\nZi frumoasa!");
	
	sc.close();
	}
}
