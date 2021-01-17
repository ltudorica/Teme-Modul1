package C6IfWhile;
import java.util.Scanner;

public class While1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfIterations = sc.nextInt();
		
		while (numberOfIterations < 1000) {
			System.out.println("This will somehow end...");
			numberOfIterations++;
		}
		sc.close();
	}
}
