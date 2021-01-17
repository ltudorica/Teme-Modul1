package C5OperatoriInJava;
import java.util.Scanner;

public class Oper7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Ora exacta este:\nore:");
		int oraE = sc.nextInt();
		System.out.println("minute:");
		int minE = sc.nextInt();
		System.out.println("secunde:");
		int secE = sc.nextInt();
		
		int secTrecute0 = (oraE * 360) + (minE * 60) + secE;
		System.out.println("Au trecut " + secTrecute0 + " secunde de la miezul noptii pana la ora "  
							+ oraE + ":" + minE + ":" + secE + ".");
		
		// exista vrea modalitate prin care poti pune ora in format 03:05:09 in cazul in care sec/min/orele sunt mai mici de 10?
		// voi incerca ulterior cu varianta if
		
		// clasa date API
		
		sc.close();
		
	}
}