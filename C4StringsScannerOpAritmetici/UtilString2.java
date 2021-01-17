package C4StringsScannerOpAritmetici;
public class UtilString2 {
	public static void main(String[] args) {
		
		byte aSmallValue = 23;
		int anIntegerBigValue = 15_000;
		double aFloatValue = 237.01;
		
		// Trebuie sa fol. variabila double pentru stocarea sumei, in acest caz programul o va afisa automat
		double sum = aSmallValue + anIntegerBigValue + aFloatValue;
		System.out.println("Suma tuturor numerelor este: " + sum);
		
	}
}
