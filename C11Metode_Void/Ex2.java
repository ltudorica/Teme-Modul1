package C11Metode_Void;
import java.util.Scanner;

public class Ex2 {
	
	public static int nrNumarului(int numar) {
		int sum = 0;
		while (numar != 0) {
			int myRest = numar % 10;
			sum++;
			numar /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int myNumber = sc.nextInt();
		
		System.out.println("Numarul " + myNumber + " contine " + nrNumarului(myNumber)
							+ " numere");
		sc.close();
	}
}
