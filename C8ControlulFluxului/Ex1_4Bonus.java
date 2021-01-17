package C8ControlulFluxului;
import java.util.Scanner;

public class Ex1_4Bonus {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numarul pentru care vrei sa afisezi simetricul sau este:");
		int myNumber = sc.nextInt();
		int restNo = 0;
		int myNewNumber = restNo;

		while (myNumber != 0) {
			restNo = myNumber % 10;
			myNumber /= 10;
			myNewNumber = myNewNumber * 10 + restNo;
		}
		
		System.out.println("Simetricul lui " + myNumber + " este: ");
		System.out.print(myNewNumber);

		sc.close();
	}
}
