package W01;
import java.util.Scanner;

public class Ex3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numarul ales este:");
		int n = sc.nextInt();
		int sumMaxValue = Integer.MIN_VALUE;
		int maxNo = 0;
		
		for (int it = 2; it <= n; it++) {
			int sum = 0;
			for (int div = 2; div < n; div++) {
				int myDiv = it % div;
				if (myDiv == 0) {
					sum++;
				} else {
					continue;
				}
			}
			if (sum > sumMaxValue) {
				sumMaxValue = sum;
				maxNo = it;
			}
		}
		
		System.out.println(maxNo);
		
		sc.close();
	}	
}
