package C5OperatoriInJava;
public class Oper3 {
	public static void main(String[] args) {
		
		int temperature = 23; // celsius
		temperature = temperature++ - ++temperature + 
		              +(-(--temperature)) - (--temperature + temperature++);
		
		// temperature = 23 - 25 - 24 - (23 + 23)
		// temperature = -72
	}
}
