package W03;
import java.util.Scanner;

public class Ex1 {
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i ++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static int[] outputArray(int[] array) {
		int[] myNewArray = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			myNewArray[i] = array[i] % 10;
		}
		
		return myNewArray;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Numarul de elemente este:");
		int nrElem = sc.nextInt();
		
		int[] myArray = new int[nrElem];
		for (int i = 0; i < nrElem; i++) {
			myArray[i] = sc.nextInt();
		}

		int[] myNewArray = outputArray(myArray);

		
		printArray(myNewArray);
		sc.close();
	}
}
