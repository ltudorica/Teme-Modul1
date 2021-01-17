package C10Switch;
import java.util.Scanner;
public class Exemplu4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String theCurrentMonth = sc.nextLine();
		//theCurrentMonth = "Decembrie";
		//theCurrentMonth = "Iulie";
		//theCurrentMonth = "Octombrie";
		//theCurrentMonth = "octombrie";
		 
		switch (theCurrentMonth) {
		  case "Decembrie":
		  case "Ianuarie":
		  case "Februarie":
		    System.out.println("Este iarna!");
		    break;
		  case "Martie":
		  case "Aprilie":
		  case "Mai":
		    System.out.println("Este primavara!");
		    break;
		  case "Iunie":
		  case "Iulie":
		  case "August":
		    System.out.println("Este vara!");
		    break;
		  case "Septembrie":
		  case "Octombrie":
		  case "Noiembrie":
		    System.out.println("Este toamna!");
		    break;
		  default:
		    System.out.println("\"" + theCurrentMonth + "\" nu este o luna valida.");
		    break;
		}
		
		sc.close();
	}
}
