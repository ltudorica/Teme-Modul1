package C5OperatoriInJava;
public class Oper1 {
	public static void main(String[] args) {
		
		int operand1 = 24, operand2 = 35, operand3 = 15, operand4 = 55;
		int result;
		
		/*   result = operand1 + operand2;
		result = result / operand4;
		result = result + operand3;
		result = result * (operand1 * 2);
		result = operand3 - result;
		result = (-3) * 3 *operand4 + result;
		 
		System.out.println(result);  */
		
		result = operand1 + operand2;
		result /= operand4;
		result += operand3;
		result *= (operand1 * 2);
		result = operand3 - result;
		result += (-3) * 3 *operand4;
			System.out.println(result);
				
	}
}
