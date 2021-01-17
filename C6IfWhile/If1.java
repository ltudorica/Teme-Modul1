package C6IfWhile;
import java.util.Scanner;

public class If1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vrei sa sti cum se numeste luna:");
		int luna = sc.nextInt();
		
		if (luna == 1) {
			System.out.println("Ianuarie");
		} else if (luna == 2) {
			System.out.println("Februarie");
		} else if (luna == 3) {
			System.out.println("Martie");
		} else if (luna == 4) {
			System.out.println("Aprilie");
		} else if (luna == 5) {
			System.out.println("Mai");
		} else if (luna == 6) {
			System.out.println("Iunie");
		} else if (luna == 7) {
			System.out.println("Iulie");
		} else if (luna == 8) {
			System.out.println("August");
		} else if (luna == 9) {
			System.out.println("Septembrie");
		} else if (luna == 10) {
			System.out.println("Octombrie");
		} else if (luna == 11) {
			System.out.println("Noiembrie");
		} else if (luna == 12) {
			System.out.println("Decembrie");
		} else {
			System.out.println("Which calendar are you using? Try again!");
		}
		
		
		sc.close();
	}
}
