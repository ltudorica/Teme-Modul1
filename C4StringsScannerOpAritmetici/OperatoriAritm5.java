package C4StringsScannerOpAritmetici;
import java.util.Scanner;

public class OperatoriAritm5 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Lungimea:");
			Double lungime = sc.nextDouble();
			
			System.out.println("Latimea:");
			Double latime = sc.nextDouble();
			
			System.out.println("Inaltimea:");
			Double inaltime = sc.nextDouble();
			
			Double volumP = lungime * latime * inaltime;
			Double ariaB = lungime * latime;
			Double ariaL = 2 * (lungime * inaltime + latime * inaltime);
			Double ariaTot = ariaL * 2 * ariaB;
			
			System.out.println("Volumul paralelipipedului este de " + volumP + " m^3");
			System.out.println("Aria bazei este de " + ariaB + " m^2");
			System.out.println("Aria laterala este de " + ariaL + " m^2");
			System.out.println("Aria totala este de " + ariaTot + " m^2");
			
			sc.close();
		}
}
