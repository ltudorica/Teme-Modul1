package C9BreakContinueDo_While;
import java.util.Scanner;

public class Break_Continue2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The odd number will be shown from:");
		int left = sc.nextInt();
		
		System.out.println("Until:");
		int right = sc.nextInt();
		int counter = 1;


		while (left < right) {
			if (left % 2 == 1) {
				System.out.println(left + " ");
				counter++;
			}
			if (counter > 5) {
				break;
			}
			left++;
		}
			
	
		sc.close();
		
	}
}
