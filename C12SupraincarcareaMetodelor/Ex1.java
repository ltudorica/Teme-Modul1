package C12SupraincarcareaMetodelor;
import java.util.Scanner;

public class Ex1 {
	public static int numberLenght(int value) {
		int numberLenght = 0;
		
		if (value == 0) {
			return 1;
		}
		
		while (value != 0) {
			value /= 10;
			numberLenght++;
		}
		
		return numberLenght;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numarul ales:");
		int myNumber = sc.nextInt();
		
		System.out.println("Numarul " + myNumber + " este format din "
						+ numberLenght(myNumber) + " numere");
		
		sc.close();
	}
}
