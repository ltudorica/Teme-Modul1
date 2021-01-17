package C5OperatoriInJava;
import java.util.Scanner;

public class Oper6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ziua nasterii:\nan:");
		int anNasterii = sc.nextInt();
		System.out.println("luna ");
		int lunaNasterii = sc.nextInt();
		System.out.println("zi: ");
		int ziuaNasterii = sc.nextInt();
		
		System.out.println("Data curenta:\nan");
		int anCurent = sc.nextInt();
		System.out.println("luna: ");
		int lunaCurenta = sc.nextInt();
		System.out.println("zi: ");
		int ziuaCurenta = sc.nextInt();
				
		int age1 = ((anCurent - anNasterii) * 12 * 30) + ((lunaCurenta - lunaNasterii) * 30);
		int age2 = ((anCurent - anNasterii - 1) * 12 * 30) + ((12 - (lunaNasterii - lunaCurenta)) * 30);
		System.out.println("Varsta aproximativa in numar de zile este: " 
							+ (lunaNasterii > lunaCurenta ? age1 : age2));
			
		int varsta1 = anCurent - anNasterii;
		int varsta2 = anCurent - anNasterii - 1;
		System.out.println("Varsta in ani impliniti este: " 
							+ (lunaNasterii < lunaCurenta ? varsta1 : varsta2));
		
		sc.close();
		
	}
}
