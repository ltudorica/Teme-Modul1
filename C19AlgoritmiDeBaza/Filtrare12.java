package C19AlgoritmiDeBaza;
import java.util.Arrays;
import java.util.Scanner;

public class Filtrare12 {
	
	public static String[] arrayIs(Scanner sc) {
		System.out.println("Numarul de elemente in Array va fi de:");
		int n = sc.nextInt();
		
		String[] myArray = new String[n];
		
		for(int i = 0; i < n; i++) {
			myArray[i] = sc.next();
		}
		
		return myArray;
	}
	
	public static void printArray(String[] array, int nofElem) {
		for (int i = 0; i < nofElem; i++) { 
		      System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void findWordsThatStartsWith(String[] array, String mySearchWord) {
		for (int i = 0; i < mySearchWord.length(); i++) {
			char letter = Character.toLowerCase(mySearchWord.charAt(i));
			System.out.print(letter + ": ");
			
			for(int j = 0; j < array.length; j++) {
				String word = array[j];
				char firstLetter = Character.toLowerCase(word.charAt(0));
				if (letter == firstLetter) {
					System.out.print(word + " ");
				}
			}
			System.out.print("\n");
		}
	}
	
	public static String[] lettersMatchIgnoreCase(String[] array, String mySearchWord) {
		int initNoElem = 2;
		int noOfElem = 0;
		String[] myNewArray = new String[initNoElem];
		int lowerLength;
		
		for (int i = 0; i < array.length; i++) {
			String word = array[i];
			if (word.length() > mySearchWord.length()) {
				lowerLength = mySearchWord.length();
			} else {
				lowerLength = word.length();
			}
			
			for(int j = 0; j < lowerLength; j++) {
				char ch1 = Character.toLowerCase(mySearchWord.charAt(j));
				char ch2 = Character.toLowerCase(word.charAt(j));
				
				if (ch1 == ch2) {
					myNewArray[noOfElem] = word;
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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] myArray = arrayIs(sc);
		System.out.println("The search words letters are: ");
		String mySearchWord = sc.next();
		
		System.out.println("Ex 1: Cuvinte care incep cu fiecare litera a unui cuvant:");
		findWordsThatStartsWith(myArray, mySearchWord);
		
		System.out.print("\n");
		
		String[] mySecArray = lettersMatchIgnoreCase(myArray, mySearchWord);
		System.out.println("Ex 2: Ex cu letters match: ");
		printArray(mySecArray, mySecArray.length);
		
		sc.close();
		
	}
}
