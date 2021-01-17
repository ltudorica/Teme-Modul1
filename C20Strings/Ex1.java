package C20Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
	public static void countHowManyTimes(String myString) {
		int noOfElem = 0;
		int initNoOfElem = 2;
		char[] helpArray = new char[initNoOfElem];
		
		for (int i = 0; i < myString.length(); i++) {
			boolean shouldCount = true;
			int counter = 0;
			char letter = Character.toLowerCase(myString.charAt(i));
			int index = i;
			for (int j = 0; j < helpArray.length; j++) {
				if(helpArray[j] == letter) {
					shouldCount = false;
					break;
				}
			}
			if (shouldCount) {
				System.out.print("The character \"" + letter + "\" appears: ");
				while (index >= 0) {
					counter++;
					index = myString.indexOf(letter, index + 1);
					if (counter > 1) {
						helpArray[noOfElem] = letter;
						noOfElem++;
						if(noOfElem == helpArray.length) {
							helpArray = Arrays.copyOf(helpArray, helpArray.length * 2);
						}
					}
				}
				System.out.println(counter + " time(s).");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Whatever text you want:");
		String myString = sc.nextLine();
		
		countHowManyTimes(myString);
		
		
		sc.close();
	}
}
