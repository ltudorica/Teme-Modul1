package C20Strings;

import java.util.Scanner;

public class Ex2V2 {
		public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Whatever text you want:");
		String myString = sc.nextLine();

		System.out.println("Old word to be replaced: ");
		String oldWord = sc.next();
		
		System.out.println("New word is: ");
		String newWord = sc.next();
		
		int index1 = myString.indexOf(oldWord) + oldWord.length();
		int index2 = myString.lastIndexOf(oldWord);
		
		String stringToLookIn = myString.substring(index1 , index2);
		String string1 = myString.substring(0 , index1);
		String string2 = myString.substring(index2 , myString.length());
		
		String[] helpString = stringToLookIn.split(" ");
		String anotherOne = "";
		for (int i = 0; i < helpString.length; i ++) {
			if (helpString[i].equalsIgnoreCase(oldWord)) {
				helpString[i] = newWord;
			}
			anotherOne += helpString[i] + " ";
		}

		myString = string1 + " " + anotherOne + string2;
		System.out.println(myString);
		
		sc.close();
	}
}
