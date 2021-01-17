package C5OperatoriInJava;
import java.util.Scanner;

public class Oper5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First no.:");
		int a = sc.nextInt();
		System.out.println("Second no.:");
		int b = sc.nextInt();
		System.out.println("Third no.:");
		int c = sc.nextInt();
		
		System.out.println("Numerele sunt: " + a + ", " + b + ", "+ c + ".");
		
		int max1 = (a > c ? a : c);
		int maxNo = (max1 > b ? max1 : b);
		System.out.println("1. Este a cel mai mare numar? Raspuns: " + 
							(maxNo == a ? "da" : "nu"));
		
		int min1 = (b < c ? b : c);
		int minNo = (min1 < a ? min1 : a);
		System.out.println("2. Este b cel mai mic numar? Raspuns: " + 
							(minNo == b ? "da" : "nu"));
		
		System.out.println("3. Este suma numerelor a si b mai mica decat c? Raspuns: "  
							+ ((a + b) < c ? "da" : "nu"));

		System.out.println("4. Este c mai mare decat media aritmetica dintre a si b? Raspuns: "
							+ (c > ((a+b)/2) ? "da" : "nu"));
		
		System.out.println("5. Depaseste produsul numerelor valoarea 100? Raspuns: " 
							+ ((a * b * c) > 100 ? "da" : "nu"));
		
		System.out.println("6. Este suma numerelor a si c divizibila cu 2? Raspuns: "
							+ (((a+c) % 2 == 0) ? "da" : "nu"));
		
		System.out.println("7. Este a multiplu al numarului b? Raspuns: "
							+ ((b % a == 0) ? "da" : "nu"));
		
		System.out.println("8. Este b mai mare decat restul impartirii lui a la c? Raspuns: "
							+ (b > (a % c) ? "da" : "nu"));
		
		System.out.println("9. Se imparte exact b la diferenta numerelor a si c? Raspuns: "
								+ ((a-c) % b == 0 ? "da" : "nu"));
								
		System.out.println("10. Sunt cele 3 numere egale? Raspuns: "
							+ (((a == b) && (b == c)) ? "da" : "nu"));
		
		boolean equalNo1 = (((a == b) || (a == c) || (b == c)) ? true : false);
		System.out.println("11. Sunt cel putin doua dintre numere egale (oricare doua)? Raspuns: "
							+ (equalNo1 ? "da" : "nu"));
		
		sc.close();
	}
}
