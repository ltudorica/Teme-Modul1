package W01;
import java.util.Scanner;

public class Ex3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numerele pot fi cuprinse intre: ");
		int left = sc.nextInt();
		
		System.out.println("si.. ");
		int right = sc.nextInt();
	
		int myNumber;
		
		for (; left <= right; left++) {
			myNumber = left;
			int restNo = 0;
			int simetricNo = 0;
			while (left != 0) {
				restNo = left % 10;
				left /= 10;
				simetricNo = simetricNo * 10 + restNo;
			}
			if (myNumber == simetricNo) {
				System.out.print(myNumber + " ");
			}
			left = myNumber;
		}

		
		sc.close();
	}	
}
