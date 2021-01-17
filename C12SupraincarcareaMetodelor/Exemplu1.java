package C12SupraincarcareaMetodelor;
public class Exemplu1 {
	public static void incrementParameters(double realParameter, int integerParameter) {
		  // 1. Observam valoarea initiala a parametrilor
		  System.out.println("Initial values of the parameters are:\n\t"
		                     + "realParameter: " + realParameter + "\n\t"
		                     + "integerParameter: " + integerParameter);
		 
		  // 2. Actualizam ambii parametri
		  realParameter += 10;
		  integerParameter += 5;
		 
		  // 3. Se observa actualizarea corespunzatoare a ambilor parametri
		  System.out.println("Final values of the parameters are:\n\t"
		                     + "realParameter: " + realParameter + "\n\t"
		                     + "integerParameter: " + integerParameter);
		 
		}
		 
		public static void main(String[] args) {
		  // putem utiliza acelasi nume de variabile, deoarece acestea apartin
		  // a 2 contexte diferite:
		  //    a. blocul de instructiuni aferent corpului metodei ''main''
		  //    b. blocul de instructiuni aferent corpului metodei ''incrementParameters''
		  double realParameter = 2.0d;
		  int integerParameter = 2;
		 
		  // 0. Observam valoarea argumentelor, inainte de 
		  // apelul metodei
		  System.out.println("Initial values of the arguments are:\n\t"
		                     + "realParameter: " + realParameter + "\n\t"
		                     + "integerParameter: " + integerParameter);
		 
		  // apelul metodei
		  incrementParameters(realParameter, integerParameter);
		 
		  // 4. Observam valoarea argumentelor, dupa 
		  // apelul metodei
		  System.out.println("Final values of the arguments are:\n\t"
		                     + "realParameter: " + realParameter + "\n\t"
		                     + "integerParameter: " + integerParameter);

	}
}