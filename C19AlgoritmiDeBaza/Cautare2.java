package C19AlgoritmiDeBaza;
public class Cautare2 {
	public static boolean isPalindromIgnoreCase(String myString) {
		char[] myChar = myString.toCharArray();
		String playChar = "";
		
		for (int i = myChar.length - 1; i >= 0; i--) {
			playChar += myChar[i];
		}
		
		if (myString.equalsIgnoreCase(playChar)) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		String myString = "robor";
		
		if (isPalindromIgnoreCase(myString)) {
			System.out.println("The string is palindrom");
		} else {
			System.out.println("The string is not palindrom");
		}

	}
}
