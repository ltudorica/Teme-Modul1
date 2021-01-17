package C4StringsScannerOpAritmetici;
import java.util.Scanner;

public class OperatoriAritm6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bile verzi: ");
		double v = sc.nextDouble();
		
		System.out.println("Bile rosii: ");
		double r = sc.nextDouble();
		
		System.out.println("Bile negre: ");
		double n = sc.nextDouble();
		
		double probabV = (v / (v + r + n)) * 100;
		System.out.println("Probabilitatea de a se extrage o bila verde din urna este de " + probabV);
		
		// comparand valoarea data de progr cu cea calculata pe un mini calculator, ea e dif. Mai am incercat si la alte exemple
		// De ce? nr: 1,2,3 - rasp cal: 16.66666666666667 / rasp progr: 16.666666666666664
		sc.close();
	}
}
