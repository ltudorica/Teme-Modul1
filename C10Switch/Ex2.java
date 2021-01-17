package C10Switch;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Luna este:");
		String luna = sc.nextLine();
		
		switch (luna) {
			case "Ianuarie":
			case "Martie":
			case "Mai":
			case "Iulie":
			case "August":
			case "Octombrie":
			case "Decembrie":
				System.out.println("Luna " + luna + " are 31 de zile.");
				break;
			case "Aprilie":
			case "Iunie":	
			case "Septembrie":
			case "Noiembrie":
				System.out.println("Luna " + luna + " are 30 de zile.");
				break;
			case "Februarie":
				System.out.println("Luna " + luna + " are 28 / 29 de zile.");
				break;
			default:
				System.out.println("Aceasta luna nu exista in anul calendaristic al unui pamantean! :)");
				break;				
		}
		
		
		sc.close();
	}	
}
