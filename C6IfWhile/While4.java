package C6IfWhile;
import java.util.Scanner;

public class While4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Mesajul este ce vreau eu: ");
		String message = sc.nextLine();
		
		System.out.println("Numarul ales este:");
		int upperLimit = sc.nextInt();
		
		System.out.println("Din numarul ales vreau sa scad valoarea de: ");
		int decWith = sc.nextInt();
		
		System.out.println("Start counting...");

		while (upperLimit >= 0) {
			System.out.println(message + ":\t" + upperLimit);
			upperLimit = upperLimit - decWith;
		}
		System.out.println("End counting...");

		sc.close();
	}

}
