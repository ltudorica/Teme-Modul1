package C10Switch;
import java.util.Scanner;

public class Exemplu1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int theDigitToTestWithSwitch = sc.nextInt();
		//theDigitToTestWithSwitch = 0;
		//theDigitToTestWithSwitch = 115;
		 
		switch (theDigitToTestWithSwitch) {
		  case 0:
		    System.out.println("The digit is: Zero");
		    break;
		  case 1:
		    System.out.println("The digit is: One");
		    break;
		  case 2:
		    System.out.println("The digit is: Two");
		    break;
		  default:
		    System.out.println("The digit is not Zero nor One nor Two");
		    break; 
		}
		sc.close();
	}
}
