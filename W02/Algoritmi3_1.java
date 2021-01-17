package W02;
import java.util.Scanner;

public class Algoritmi3_1 {
	public static void nrCrescator(int nrAles) {
		int nrDeJoaca = nrAles;
		int maxValue = Integer.MAX_VALUE;
		int counter = 0;
		int nrCrescator = 0;
		
		while (nrDeJoaca != 0) {
			int restNo = nrDeJoaca % 10;
			nrDeJoaca /= 10;
			counter++;
			if (restNo <= maxValue) {
				maxValue = restNo;
				nrCrescator++;
			}
		}		
		if (counter == nrCrescator) {
			System.out.print(nrAles + " ");
		} 
	}
	
	public static void nrDescrescator(int nrAles) {
		int nrDeJoaca = nrAles;
		int minValue = Integer.MIN_VALUE;
		int counter = 0;
		int nrDescrescator = 0;
		
		while (nrDeJoaca != 0) {
			int restNo = nrDeJoaca % 10;
			nrDeJoaca /= 10;
			counter++;
			if (restNo >= minValue) {
				minValue = restNo;
				nrDescrescator++;
			}
		}		
		if (counter == nrDescrescator) {
			System.out.print(nrAles + " ");
		} 
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Afiseaza numerele crescatoare intre:");
		int lowerLimit = sc.nextInt();
		int lowerLimitPlay = lowerLimit;
		System.out.print("si..");
		int upperLimit = sc.nextInt();
		
		for (; lowerLimitPlay <= upperLimit; lowerLimitPlay++) {
			nrCrescator(lowerLimitPlay);
		}
		
		System.out.println();
		for (; upperLimit >= lowerLimit; upperLimit--) {
			nrDescrescator(upperLimit);
		}
		
		sc.close();
	}
}
