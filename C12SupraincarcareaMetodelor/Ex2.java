package C12SupraincarcareaMetodelor;
import java.util.Scanner;

public class Ex2 {
	public static int multiplyUsingSum(int firstNo, int secondNo) {
		int resultIs = 0;
		
		while (firstNo != 0) {
			resultIs += secondNo;
			firstNo--;
		}
		return resultIs;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primul numar este:");
		int myFirstNo = sc.nextInt();
		
		System.out.println("Al doilea numar este:");
		int mySecondNo = sc.nextInt();
		
		System.out.println("Inmultirea celor doua numere este: " + multiplyUsingSum(myFirstNo, mySecondNo));
		
		sc.close();
	}
}
