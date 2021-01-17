package C21PrelucrareStringsStringBuilder;

import java.util.Scanner;

public class Ex2 {
	public static boolean swapString(String[] stringArray, int index1, int index2) {
		String helpString = stringArray[index1];
		stringArray[index1] = stringArray[index2];
		stringArray[index2] = helpString;
		return true;
	}
	
	public static String[] arrayinAlphOrder(String[] string) {

		for (int i = 0; i < string.length; i++) {
			String minString = string[i];
			int minIndex = i;
			for (int j = i + 1; j < string.length; j++) {
				if (minString.compareToIgnoreCase(string[j]) > 0) {
					minString = string[j];
					minIndex = j;
				} 
			}
			swapString(string, i, minIndex);
		}
			
		return string;
	}
	
	public static String secondWordInArray(String[] string) {
		arrayinAlphOrder(string);
			
		return string[1];
	}
	
	public static String lastButOneInArray(String[] string) {
		arrayinAlphOrder(string);
			
		return string[string.length - 2];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numarul de cuvinte va fi:");
		int n = sc.nextInt();
		
		String[] myString = new String[n];
		for (int i = 0; i < n; i++) {
			myString[i] = sc.next();
		}

		System.out.print(secondWordInArray(myString) + " " + lastButOneInArray(myString));
		
		sc.close();
	}
}
