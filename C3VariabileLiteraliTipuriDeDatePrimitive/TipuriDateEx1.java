package C3VariabileLiteraliTipuriDeDatePrimitive;
public class TipuriDateEx1 {
	public static void main(String[] args) {
		
		byte validValue = 120;
		short negativeValue = -1_000;
		int integerNumber = 1000 + 5 * (validValue-negativeValue);
		
		System.out.println(validValue);
		System.out.println(negativeValue);
		System.out.println(integerNumber);
	}

}
