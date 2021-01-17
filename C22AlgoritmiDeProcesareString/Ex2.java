package C22AlgoritmiDeProcesareString;

public class Ex2 {
	public static boolean isPalindrom(String sentence) {
		sentence = sentence.toLowerCase();
		StringBuilder myStringBuilder = new StringBuilder(sentence);
		boolean isPalindrom = false;;
		
		for (int i = 0; i < myStringBuilder.length(); i++) {
			if (!Character.isLetter(myStringBuilder.charAt(i))) {
				myStringBuilder.deleteCharAt(i);
				i--;
			}
		}
		
		String string1 = myStringBuilder.toString();
		//myStringBuilder.reverse();
		
		String string2 = myStringBuilder.reverse().toString();

		System.out.println(string1);
		System.out.println(string2);
		
		if (string1.equals(string2)) {
			isPalindrom = true;
		}
		
		return isPalindrom;
	}
	
	public static void main(String[] args) {
		String myString = "A man, a plan, a canal: Panama!";
		
		System.out.println(isPalindrom(myString));
	}
}
