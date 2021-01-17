package C4StringsScannerOpAritmetici;
import java.util.Scanner;

public class Citirea1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First number: ");
		double firstNumber = sc.nextDouble();
		
		System.out.println("Second number: ");
		double secondNumber = sc.nextDouble();	
		
		System.out.println("Third number: ");
		double thirdNumber = sc.nextDouble();
		
		double sum3 = firstNumber + secondNumber + thirdNumber;
		System.out.println("The sum of the three numbers is: " + sum3);
		
		sc.close();
	}
}
