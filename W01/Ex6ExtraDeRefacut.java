package W01;
import java.util.Scanner;

public class Ex6ExtraDeRefacut {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int nrAnterior = 0;
		int nrPosibil = Integer.MIN_VALUE;
		int minValue = Integer.MAX_VALUE;
		
		for (int it = 0; it < n; it++) {
			int nrAles = sc.nextInt();
			
			if (it > 0) {
				if (nrAles > nrAnterior) {
				nrPosibil = nrAles;
				}
			}
			
			
			
			
			/*if (nrAles > nrAnterior && nrAles < minValue) {
				minValue = nrAles;
				nrPosibil = nrAles;
			}
			if (it == 1) {
				if (nrAles <= nrAnterior) {
					System.out.println("Primul Varf este: " + nrAnterior);
				} 
			} else if (it > 1) {
				if (nrAles > nrPosibil) {
					nrPosibil = nrAles;
					
				}
			}*/
			

			nrAnterior = nrAles;
		}

		
		
		sc.close();
	}	
}
