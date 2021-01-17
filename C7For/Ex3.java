package C7For;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduceti numarul de elemente:");
		int n = sc.nextInt();
		int possitiveNo = 0;
		int negativeNo = 0;
		
		for(int it = 0; it < n; it++) {
			System.out.println("Introduceti numarul " + (it+1) + " din " + n + ":");
			int choosenNo = sc.nextInt();
			
			if (choosenNo < 0) {
				negativeNo++;
			} else {
				possitiveNo++;
			}
		}
		
		System.out.println("Numere pozitive: " + possitiveNo);
		System.out.println("Numere negative: " + negativeNo);
		
		sc.close();
		}

}
