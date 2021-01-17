package W02;
import java.util.Scanner;

public class Algoritmi2_12 {
	public static void magicNo(int nrAles) {
		int nrDeJoaca = nrAles;
		int sum = 0;
	
		do {
			sum = 0;
			while (nrDeJoaca != 0) {
				int restNo = nrDeJoaca % 10;
				nrDeJoaca /= 10;
				sum += restNo;
			}
			nrDeJoaca = sum;
		} while (sum > 9);
			
		if (sum == 3 || sum == 7 || sum == 9) {
			System.out.print(nrAles + " ");
		} 
	}
	
	// Ex. 2.2
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Afiseaza numerele magice intre:");
		int lowerLimit = sc.nextInt();
		System.out.print("si..");
		int upperLimit = sc.nextInt();
		
		for (; lowerLimit <= upperLimit; lowerLimit++) {
			magicNo(lowerLimit);
		}
		
		sc.close();
	}
}
