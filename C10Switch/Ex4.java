package C10Switch;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numarul este:");
		int n = sc.nextInt();
		
		for (int it = 2; it <= n; it++) {
			int myRest = it % 10;
			switch (myRest) {
				case 1:
				case 8:
				case 0:
					continue;
				default:
					System.out.print(it + " ");
					break;
			}

		}
		
		sc.close();
	}
}
