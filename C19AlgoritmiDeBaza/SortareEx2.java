package C19AlgoritmiDeBaza;

public class SortareEx2 {
	public static int[] sortSelection(int[] array) {
	
		for (int j = 0; j < array.length; j++) {
			int maxValue = Integer.MIN_VALUE;
			int helpNo = 0;
			int i = j;
			for (; i < array.length; i++) {
				if (array[i] > maxValue) {
					maxValue = array[i];
					helpNo = i;
				}
			}
			
			swap(array, j, helpNo);
		}
		
		return array;
	}
	
	public static boolean swap(int[] array, int index1, int index2) {
		int helpNo = array[index1];
		array[index1] = array[index2];
		array[index2] = helpNo;
		return true;
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) { 
		      System.out.print(array[i] + "  ");
		}
		System.out.println();
	}
	
	public static String[] sortSelectionString(String[] arrayString) {
		
		for (int i = 0; i < arrayString.length; i++) {
			String minValue = arrayString[i];
			int maxIndex = i;
			
			for (int j = i + 1; j < arrayString.length; j++) {
				if (minValue.compareTo(arrayString[j]) < 0) {
					minValue = arrayString[j];
					maxIndex = j;
				}
			}
			swapString(arrayString, i, maxIndex);
		}
	
		return arrayString;
	}
	
	public static boolean swapString(String[] array, int index1, int index2) {
		String help = array[index1];
		array[index1] = array[index2];
		array[index2] = help;
		return true;
	}
	
	public static void printStringArray(String[] array) {
		for (int i = 0; i < array.length; i++) { 
		      System.out.print(array[i] + "  ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int[] myIntArray = {1, 15, 8, 30, 88, 16};
		String[] myStringArray = {"telefon, ", "telefon. ", "pix", "foaie", "asa", "rama", "tigara"};
		
		printArray(sortSelection(myIntArray));
		
		printStringArray(sortSelectionString(myStringArray));
				
	}
}
