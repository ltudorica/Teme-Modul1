package C5OperatoriInJava;
public class Oper2 {
	public static void main(String[] args) {
		
		int value1 = 5;
		int value2 = 10;
		int value3 = 15;
		int value4 = 20;
		
		
		// post incrementare
		System.out.println("This op. increases the variable, but shows the old value when initiated: " + value1++);
		System.out.println("The new value is: " + value1);
			
		// pre incrementare
		System.out.println("This op. increases the variable & shows the new value when initiated: " + ++value2);
		System.out.println("The new & shown value is: " + value2);
		
		// post decrementare
		System.out.println("This op. decreases the variable, but shows the old value when initiated: " + value3--);
		System.out.println("The new value is: " + value3);
			
		// pre decrementare
		System.out.println("This op. decreases the variable & shows the new value when initiated: " + --value4);
		System.out.println("The new & shown value is: " + value4);
		
		
		
	}
}
