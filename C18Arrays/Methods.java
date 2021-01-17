package C18Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Methods {
	public static int[] readArray(Scanner sc) {
		int stopNo = -1;
		int initCapacity = 2;
		int[] myArray = new int[initCapacity];
		int noOfElem = 0;
		
		int readNo = sc.nextInt();
		while(readNo != stopNo) {
			myArray[noOfElem] = readNo;
			noOfElem++;
			if(noOfElem == myArray.length) {
				myArray = Arrays.copyOf(myArray, myArray.length * 2);
			}
			readNo = sc.nextInt();
		}
		return Arrays.copyOf(myArray, noOfElem);
	}
	
	public static void printArray(int[] array, int numberOfElements) {
		for (int i = 0; i < numberOfElements; i++) { 
		      System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] arrayIntersection(int[] firstArray, int[] secArray) {
		int initCapacity = 2;
		int[] myArray = new int[initCapacity];
		int noOfElem = 0;
		int playValue;
		
		for (int i = 0; i < firstArray.length; i++) {
			for (int j = 0; j < secArray.length; j++) {
				if (firstArray[i] == secArray[j]) {
					playValue = firstArray[i];
					myArray[noOfElem] = playValue;
					noOfElem++;
					if (noOfElem == myArray.length) {
						myArray = Arrays.copyOf(myArray, myArray.length * 2);
					}
				}
			}
		}

		return Arrays.copyOf(myArray, noOfElem);
	}
	
	public static int[] arrayDifference(int[] firstArray, int[] secArray) {
		int initCapacity = 2;
		int[] myArray = new int[initCapacity];
		int noOfElem = 0;
		int playValue;
				
		for (int i = 0; i < firstArray.length; i++) {
			int playNo = 0;
			for (int j = 0; j < secArray.length; j++) {
				if (firstArray[i] == secArray[j]) {
					break;
				} else {
					playNo++;
				}

			} 
			if (playNo == secArray.length) {
				playValue = firstArray[i];
				myArray[noOfElem] = playValue;
				noOfElem++;
				if (noOfElem == myArray.length) {
					myArray = Arrays.copyOf(myArray, myArray.length * 2);
				}
			}	
		}

		return Arrays.copyOf(myArray, noOfElem);
	}
	
	public static int[] arrayUnion(int[] firstArray, int[] secArray) {
		int[] playArray = arrayDifference(firstArray, secArray);
		int noOfElem = playArray.length + secArray.length;
		int[] myArray = Arrays.copyOf(secArray, noOfElem);
		int playValue = 0;
		int i = 0;
		
		for (int j = secArray.length; j < noOfElem; j++) {
				playValue = playArray[i];
				myArray[j] = playValue;
				i++;
		}
		
		return Arrays.copyOf(myArray, noOfElem);
	}
	
}
