package C9BreakContinueDo_While;
import java.util.Scanner;

public class Break_Continue1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduceti numerele: ");
		int myNumber;
		int sumNumbers = 0;
		int counter = 0;
		
		while (counter < 10) {
			myNumber = sc.nextInt();
			counter++;
			if (myNumber < 0){	
				break;
			}
			sumNumbers += myNumber;
		} System.out.println("Suma numerelor este: " + sumNumbers);
		
		sc.close();
		
	}
}
