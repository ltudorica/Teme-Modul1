package C19AlgoritmiDeBaza;
public class Cautare1 {
	public static int countOccurrencesIgnoreCase(String[] array, String key) {
		int noOfElem = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].equalsIgnoreCase(key)) {
				noOfElem++;
			}
		}
		return noOfElem;
	}
	
	public static void main(String[] args) {
		String myArray[] = {"ana", "Jhon", "ANA", "jhony", "aNa"};
		System.out.println(countOccurrencesIgnoreCase(myArray, "anA"));
	}
}
