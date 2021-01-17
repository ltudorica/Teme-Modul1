package C11Metode_Void;

public class Ex3 {
	public static double multiply2(double operand1, double operand2) {
		return operand1 * operand2;
	}
	
	public static double multiply3(double operand1, double operand2, double operand3) {
		double multiply3 = multiply2(operand1, operand2);
		multiply3 = multiply2(multiply3, operand3);
		return multiply3;
	}
	
	public static double multiply4(double operand1, double operand2, double operand3, double operand4) {
		double multiply4 = multiply3(operand1, operand2, operand3);
		multiply4 = multiply2(multiply4, operand4);
		return multiply4;
	}
	
	public static void main(String[] args) {
		System.out.println(multiply3(2, 3, 4));
		System.out.println(multiply4(2, 3, 4, 5));
	}
	
}
