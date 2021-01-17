package C19AlgoritmiDeBaza;
import java.util.Arrays;
import java.util.Scanner;

public class Filtrare3 {
	public static int[] arrayIs(Scanner sc) {
		int initNoOfElem = 2;
		int noOfElem = 0;
		int stopNo = -1;
		int[] myArray = new int[initNoOfElem];
		
		int readNo = sc.nextInt();
		while (readNo != stopNo) {
			myArray[noOfElem] = readNo;
			noOfElem++;
			if (noOfElem == myArray.length) {
				myArray = Arrays.copyOf(myArray, myArray.length * 2);
			}
			readNo = sc.nextInt();
		}
				
		return Arrays.copyOf(myArray, noOfElem);
	}
	
	public static int[] containsDigit(int[] array, int digit) {
		int initNoOfElem = 2;
		int noOfElem = 0;
		int[] myNewArray = new int[initNoOfElem];
		
		for (int i = 0; i < array.length; i++) {
			int justANo = array[i];
			int toRememberNo = justANo;
			while (justANo != 0) {
				int rest = justANo % 10;
				justANo /= 10;
				if (digit == rest) {
					myNewArray[noOfElem] = toRememberNo;
					noOfElem++;
					if (noOfElem == myNewArray.length) {
						myNewArray = Arrays.copyOf(myNewArray, myNewArray.length * 2);
					}
					break;
				}
			}
		}
		
		return Arrays.copyOf(myNewArray, noOfElem);
	}
	
	public static void printArray(int[] array, int nofElem) {
		for (int i = 0; i < nofElem; i++) { 
		      System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The array has the following elements: ");
		int[] myArray = arrayIs(sc);
		printArray(myArray, myArray.length);
		
		System.out.println("The play number is ");
		int noToSearch = sc.nextInt();
		
		int[] myNewArray = containsDigit(myArray, noToSearch);
		printArray(myNewArray, myNewArray.length);
		
		sc.close();
	}
}
