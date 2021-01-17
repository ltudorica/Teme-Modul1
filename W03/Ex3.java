package W03;
import java.util.Scanner;

public class Ex3 {
	public static int sumDiv(int number) {
		int sum = 0;
		
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				sum += i;
			} 
		}
		
		return sum;
	}
	
	public static boolean isPerfect(int number) {
		return (sumDiv(number) == number);
	}
	
	public static boolean isDeficient(int number) {
		return (sumDiv(number) < number);
	}
	
	/*public static boolean isAbundent(int number) {
		return (sumDiv(number) > number);
	}*/
	
	public static int checkNo(int number) {
		int value;
		
		if (isPerfect(number)) {
			value = 0;
		} else if (isDeficient(number)) {
			value = -1;
		} else {
			value = 1;
		} 
		
		return value;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pick your number");
		int n = sc.nextInt();
		System.out.println(checkNo(n));
		
		sc.close();
	}
}
