package C22AlgoritmiDeProcesareString;

public class Ex4DeRefacut {
	// 1
	public static int noWordsThatFWLetter(String string, String key) {
		StringBuilder sb1 = new StringBuilder(string.toLowerCase());
		StringBuilder sbKey = new StringBuilder(key.toLowerCase());
		
		int counter = 0;
		for (int i = 0; i < sbKey.length(); i++) {
			for (int j = 0; j < sb1.length(); j++) {
				if(!Character.isLetter(sb1.charAt(j))) {
					if (sb1.charAt(j - 1) == sbKey.charAt(i)) {
						counter++;
					}
				}
			}
		}
		
		return counter;
	}
	
	// 2
	public static int noWordsThatEvenLetter(String string, String key) {
		StringBuilder sb1 = new StringBuilder(string.toLowerCase());
		StringBuilder sbKey = new StringBuilder(key.toLowerCase());
		
		int isEven = 1;
		int counter = 0;
		for (int i = 0; i < sbKey.length(); i++) {
			for (int j = 0; j < sb1.length(); j++) {
				if(!Character.isLetter(sb1.charAt(j))) {
					if (sb1.charAt(j - 1) == sbKey.charAt(i)) {
						if (isEven % 2 == 0) {
							counter++;
						}
						isEven++;
					}
				}
			}
		}
		
		return counter;
	}
	
	// 3
	public static int noWordsAllLetters(String string, String key) {
		StringBuilder sb1 = new StringBuilder(string.toLowerCase());
		StringBuilder sbKey = new StringBuilder(key.toLowerCase());
		StringBuilder playSentence = new StringBuilder("");
		
		
		int counter = 0;
		int helpNo = 0;
		for (int i = 0; i < sb1.length(); i++) {
			int countIfItIs = 0;
			StringBuilder playSB = sbKey;
			playSentence.append(sb1.charAt(i));
			for (int j = 0; j < playSB.length(); j++) {
				if(!Character.isLetter(sb1.charAt(i))) {
					
					
					
					for (int k = i - 1; k > helpNo; k--) {
						if (playSB.charAt(j) == sb1.charAt(k)) {
							playSB.deleteCharAt(j);
							countIfItIs++;
						}
					}
					
					helpNo = i + 1;
				}
			}
			if (countIfItIs == sbKey.length()) {
				counter++;
			}
		}
		
		return counter;
	}
	
	public static void main(String[] args) {
		String myString = "Incepe sa imi placa sa codez. Este uimitor, increzibil si extrem de greu.. dar da!";
		String key = "ni";
		
		System.out.println(noWordsThatFWLetter(myString, key));
		System.out.println(noWordsThatEvenLetter(myString, key));
		System.out.println(noWordsAllLetters(myString, key));
		
	}
}
