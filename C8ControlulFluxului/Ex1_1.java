package C8ControlulFluxului;
import java.util.Scanner;

public class Ex1_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numarul este:");
		int myNumber = sc.nextInt();
		
		System.out.print("Cifrele numarului sunt: ");
		
		while (myNumber != 0) {
			int lastDigit = myNumber % 10;
			System.out.print(lastDigit + ", ");
			myNumber /= 10;
		}

		sc.close();
	}
}
