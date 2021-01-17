package C10Switch;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("The random word starts with the letter: ");
		String myChar = sc.nextLine();

		switch (myChar) {
			case "d":
				System.out.println("dentist");
				break;
			case "e":
				System.out.println("entertainer");
				break;
			case "s":
				System.out.println("stunning");
				break;
			case "v":
				System.out.println("viking");
				break;
			default:
				System.out.println("There is no random word stating with that letter :) ");
				break;
		}
		
		
		sc.close();
	}
}
