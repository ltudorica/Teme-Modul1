package C3VariabileLiteraliTipuriDeDatePrimitive;
public class TipuriDateEx3 {
	public static void main(String[] args) {
		
			// there are no errors here
		byte verySmallNumber = -123;
		
			// The variable name cannot repeat in the same class
			// The displayed number exceeds the limit available in this type of variable, how
		short smallNumber = 23_234;
				
			// The variable name cannot begin with a number
		int _integerNumber = verySmallNumber * 2;
				
			// The '_' at the end of the no. has no point there (although the code would still work), as it's there to make the number easier to read
			// The 'L' should be at the end, otherwise the number would be turned into int type		
		long veryBigNumber = 123_456_000_000_001L;
			
			// there is no identificator with this name (integerNumber) & there is an 'l' at the end of the code that will ruin the code
		_integerNumber = _integerNumber + 20;
		
		
		
	}
}
