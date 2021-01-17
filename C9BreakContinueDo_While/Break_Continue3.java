package C9BreakContinueDo_While;
import java.util.Scanner;

public class Break_Continue3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numarul ales este:");
		int myNumber = sc.nextInt();
		int counter = 1;
		int myInitialNo = myNumber;
		
		while (myInitialNo != 0) {
			if (myInitialNo > 99) {
				int restNo = myNumber % 10;
				System.out.print(restNo + " ");
				myNumber /= 10;
				counter++;
				if (counter > 3) {
					break;
				} 
			} else {
				System.out.print("Numarul introdus trebuie sa contina cel putin 3 cifre");
				break;
			}	
		}

		sc.close();
	}
}
