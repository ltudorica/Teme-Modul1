package C8ControlulFluxului;
import java.util.Scanner;

public class Ex1_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduceti numarul:");
		int myNumber = sc.nextInt();
		int oddCounter = 0;
		int evenCounter = 0;
		int sum = 0;
		int noTot = 0;
		int oneOfNoIs9 = 0;
		int myInitialNo = myNumber;
		boolean noIs0 = false;
		boolean noIs1 = false;
		
		
		while (myNumber != 0) {
			int restNo = myNumber % 10;
			if (restNo % 2 == 0) {
				evenCounter++;
			} else {
				oddCounter++;
			}
			if (restNo == 9) {
				oneOfNoIs9 = restNo;
			}
			if (restNo == 0) {
				noIs0 = true;
			}
			if (restNo == 1) {
				noIs1 = true;
			}
			myNumber /= 10;	
			sum += restNo;
		}
		
		noTot = evenCounter + oddCounter;
		
		System.out.println("Contine numai cifre pare? R: " + (oddCounter == 0));

		System.out.println("Contine mai multe cifre pare decat cifre impare? R: " + (evenCounter > oddCounter));
	
		System.out.println("Suma cifrelor sale este divizibila cu 5? R: " + (sum % 5 == 0));

		System.out.println("Numarul de cifre este multiplu de 3? R: " + (noTot % 3 == 0));

		System.out.println("Numarul contine cifra 9? R: " + (oneOfNoIs9 == 9));
		
		System.out.println("Numarul se termina in oricare dintre cifrele 3, 7 sau 9? R: "
							+ ((myInitialNo % 10 == 3) || (myInitialNo % 10 == 7) || (myInitialNo % 10 == 9)));
		
		System.out.println("Numarul este o cifra? R: " + (noTot == 1));
		
		System.out.println("Numarul contine cifra 1 si cifra 0? R: " + (noIs0 && noIs1));

		
		sc.close();
	}
}