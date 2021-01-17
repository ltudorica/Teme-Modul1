package C7For;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Numarul ales este:");
		int myNumber = sc.nextInt();
		
		System.out.println("Mesajul meu este:");
		String myMessage = sc.nextLine();	
		myMessage = sc.nextLine();
		
		for (int it = 1; it <= myNumber; it++) {
			System.out.println(it + ". " + myMessage);
		}
		
		sc.close();
		
	}
}
