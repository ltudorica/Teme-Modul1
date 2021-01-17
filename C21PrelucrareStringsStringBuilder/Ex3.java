package C21PrelucrareStringsStringBuilder;

public class Ex3 {
	public static String transformLetters(String string) {
		StringBuilder mySB = new StringBuilder(string);
		
		for (int i = 0; i < mySB.length(); i++) {
			if (Character.isLetter(mySB.charAt(i))) {
				if (Character.isUpperCase(mySB.charAt(i))) {
					mySB.setCharAt(i, Character.toLowerCase(mySB.charAt(i)));
				} else if (Character.isLowerCase(mySB.charAt(i))) {
					mySB.setCharAt(i, Character.toUpperCase(mySB.charAt(i)));
				}
			}
		}
		
		return mySB.toString();
		
	}
	
	public static void main(String[] args) {
		String myString = "The number 1 deadliest animal on the PLANET Earth is the ©Mosquito!®";
		System.out.println(transformLetters(myString));
	}
}
