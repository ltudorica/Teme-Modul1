package C21PrelucrareStringsStringBuilder;

public class Ex1 {
	public static int parseInt(String someString) {
		Integer intValue = Integer.valueOf(someString);
		return intValue;
	}
	
	public static double parseDouble(String someString) {
		Double doubleValue = Double.valueOf(someString);
		return doubleValue;
	}
	
	public static boolean parseBoolean(String someString) {
		Boolean booleanValue = Boolean.valueOf(someString);
		return booleanValue;
	}
	
	public static void main(String[] args) {
		String myInt = "123";
		String myDouble = "247.52";
		String myBoolean = "true";
		
		System.out.println(parseBoolean(myBoolean));
		System.out.println(parseDouble(myDouble) + parseInt(myInt));
		
	}
}
