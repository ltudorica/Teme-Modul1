package C19AlgoritmiDeBaza;
public class SortareEx1 {
	public static boolean swap(double[] array, int index1, int index2) {
		double helpNo = array[index1];
		array[index1] = array[index2];
		array[index2] = helpNo;
		return true;
	}
	
	public static double[] sortBubbles(double[] array) {
		boolean result;
		
		do {
			result = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i+1]) {
					swap(array, i, i+1);
					result = true;
				}
			}
		} while (result);
		
		return array;
	}
	
	public static void printArray(double[] array, int nofElem) {
		for (int i = 0; i < nofElem; i++) { 
		      System.out.print(array[i] + "  ");
		}
		System.out.println();
	}
	
	public static boolean swapString(String[] array, int index1, int index2) {
		String helpNo = array[index1];
		array[index1] = array[index2];
		array[index2] = helpNo;
		return true;
	}
	
	public static String[] sortBubblesString(String[] array) {
		boolean result;
		
		do {
			result = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i].compareTo(array[i+1]) > 0) {
					swapString(array, i, i+1);
					result = true;
				}
			}
		} while (result);
		
		return array;
	}
	
	public static void printArrayString(String[] array, int nofElem) {
		for (int i = 0; i < nofElem; i++) { 
		      System.out.print(array[i] + "  ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		double[] myDoubleArray = {1.5, 8.2, 1.25, 2.85, 1.1};
		myDoubleArray = sortBubbles(myDoubleArray);
		
		printArray(myDoubleArray, myDoubleArray.length);
		
		String[] myStringArray = {"telefon", "pix", "foaie", "asa", "rama", "tigara"};
		myStringArray = sortBubblesString(myStringArray);
		
		printArrayString(myStringArray, myStringArray.length);
		
	}
}
