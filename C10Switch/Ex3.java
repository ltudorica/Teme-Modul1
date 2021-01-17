package C10Switch;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numarul este:");
		int n = sc.nextInt();
		
		for (int it = 0; it <= n; it++) {
			int myRest = it % 4;
			switch (myRest) {
				case 0:
					System.out.print("+" + it + " ");
					break;
				case 1:
					System.out.print("*" + it + " ");
					break;
				case 2:
					System.out.print("~" + it + " ");
					break;
				case 3:
					System.out.print("-" + it + " ");
					break;
			}
		}
		
		
		sc.close();
	}
}
