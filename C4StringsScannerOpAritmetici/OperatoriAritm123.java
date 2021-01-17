package C4StringsScannerOpAritmetici;
public class OperatoriAritm123 {
	public static void main(String[] args) {
		
		double leftToRightOrderComputation = ((100d + 5d) * 10d - 2.23d) * 18d / 4d + 2d;
		
		System.out.println(leftToRightOrderComputation);
		
		// Ex 2. Nr. min de paranteze: 2 perechi
		
		/* Ex 3. Generatorul de paranteze ar trebui sa fie implementat atunci cand operatia din dreapta este *, / sau %
		 * 		- sa recunoasca operatia si in cazul in care este una din cele prioritare efectuarii (ca cele mai sus mentionate), 
		 * 		sa cuprinda operatia din stanga in pranteze.
		 * 		- atunci variabila ar deveni: leftToRightOrderComputation = (((100d + 5d) * 10d - 2.23d) * 18d) / 4d + 2d;
		 * 		- rezultatul este acelasi
		 */
	}
}
