package C19AlgoritmiDeBaza;

public class SortareEx3 {
	public static boolean swapString(String[] string, int index1, int index2) {
		String helpString = string[index1];
		string[index1] = string[index2];
		string[index2] = helpString;
		return true;
	}
	
	public static String[] bubbleSort(String[] string) {
		boolean result = false;
		
		do {
			result = false;
			for (int i = 0; i < string.length - 1; i++) {
				if (string[i].length() > string[i+1].length()) {
					swapString(string, i, i+1);
					result = true;
				}
			}
		} while (result);
		
		return string;
	}
	
	public static String[] selectionSort(String[] string) {

		for (int i = 0; i < string.length; i++) {
			int minNo = string[i].length();
			int minIndex = i;
			for(int j = i + 1; j < string.length; j++) {
				if (minNo > string[j].length()) {
					minNo = string[j].length();
					minIndex = j;
				}
			}
			swapString(string, i, minIndex);
		}
		
		return string;
	}
	
	public static void printStringArray(String[] string) {
		for (int i = 0; i < string.length; i++) {
			System.out.print(string[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String[] myStringArray = {"telefon", "pix", "foaie", "asa", "rama", "tigara"};
		
		long startTime = System.nanoTime();
		printStringArray(bubbleSort(myStringArray));
		long stopTime = System.nanoTime();
		System.out.println("Timpul pt bubbleSort este: " + (double)(stopTime - startTime) / 1_000_000_000);
		
		System.out.println();
		startTime = System.nanoTime();
		printStringArray(selectionSort(myStringArray));
		stopTime = System.nanoTime();
		System.out.println("Timpul pt selectionSort este: " + (double)(stopTime - startTime) / 1_000_000_000);
		
	}
}
