package C22AlgoritmiDeProcesareString;

public class Ex3 {
	
	public static int compareTwoStrings(String str1, String str2) {
		StringBuilder sb1 = new StringBuilder(str1.toLowerCase()); //3.1
		StringBuilder sb2 = new StringBuilder(str2.toLowerCase()); //3.1
		
		int minLength = 0;
		if (sb1.length() < sb2.length()) {
			minLength = sb1.length();
		} else {
			minLength = sb2.length();
		}
		
		for (int i = 0; i < minLength; i++) {
			for (int j = i; j < minLength; j++) {
				if (sb1.charAt(j) < sb2.charAt(j)) {
					return -1;
				} else if (sb1.charAt(j) > sb2.charAt(j)) {
					return 1;
				}
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		String str1 = "Asta e primul string";
		String str2 = "Asta e al doilea string";
		
		System.out.println(compareTwoStrings(str1, str2));
		
	}
}
