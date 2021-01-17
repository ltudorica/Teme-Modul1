package C22AlgoritmiDeProcesareString;
public class Ex1 {
	public static int countAtLeastALetter(String sentence, String word) {
		int counter = 0;
		sentence = sentence.toLowerCase();
		word = word.toLowerCase();
		String[] words = sentence.split("\\W+");
		
		for (int i = 0; i < word.length(); i++) {
			char helpChar = word.charAt(i);
			for (int j = 0; j < words.length; j++) {
				String helpString = words[j];
				if (helpString.indexOf(helpChar) >= 0) {
					counter++;
					break;
				}

			}
		}
		
		return counter;
	}
	
	public static int countWordStarsWith(String sentence, String word) {
		sentence = sentence.toLowerCase();
		word = word.toLowerCase();
		int counter = 0;
		String[] words = sentence.split("\\W+");
		
		for (int i = 0; i < word.length(); i++) {
			char helpChar = word.charAt(i);
			for (int j = 0; j < words.length; j++) {
				String helpString = words[j];
				if (helpString.indexOf(helpChar) == 0) {
					counter++;
					break;
				}
			}
		}
		
		return counter;
	}
	
	public static void main(String[] args) {
		String myString = "Nu stiu ce sa pun in propozitia asta, dar merge si asa!";
		String myWord = "whatever";
		
		System.out.println("Numbers of words containing at least a letter from the key");
		System.out.println(countAtLeastALetter(myString, myWord));
		
		System.out.println("Numbers of words that begin with a letter from the key");
		System.out.println(countWordStarsWith(myString, myWord));
	}
}
