package C4StringsScannerOpAritmetici;
public class OperatoriAritm4 {
	public static void main(String[] args) {
		
		int mathEquation, operand1, operand2, operand3;
		
		// Este valid? - NU
		// De ce? Raspunsul tau: pentru ca operand3 nu are nici o valoare, asadar restul nu au ce valoare lua.
		// operand1 = operand2 = operand3;
		
		// Este valid? - NU
		// De ce? Raspunsul tau: pentru ca mathEquation nu are nici o valoare data
		// System.out.println(mathEquation);
		 
		// Este valid? - DA 
		// De ce? Raspunsul tau: mathEquation are aici valoarea 4, iar programul va afisa 4 (valoarea luata de mathEquation)
		System.out.println(mathEquation = 4);
		 
		// Este valid? -  NU
		// De ce? Raspunsul tau:  identificatorii (operand1 & operand2) nu au nici o valoare, asadar nu se pot aduna
		// mathEquation = operand1 + operand2;
		 
		// Este valid? - DA 
		// De ce? Raspunsul tau: am atribuit variabilelor niste valori; acestea ar trebui pusi separat pe randuri dif (coding style)
		operand1 = 2; operand2 = 5; operand3 = 14;
		 
		// Este valid? - NU
		// De ce? Raspunsul tau: = nu poate sa ii atribuie variabilei operand3 o operatie de adunare intre doua variabile
		// mathEquation = operand1 + operand2 = operand3;
		 
		// Este valid? - NU
		// De ce? Raspunsul tau: nu avem nici o noua (sau veche) variabila pe care trebuie sa o calculam cu aceasta operatie
		// operand2 + operand3 + operand1;
		 
		// Este valid? - DA
		// De ce? Raspunsul tau: valoarea data de operatia din partea dreapta va fi atribuita variabilei din stanga
		// nu e un coding style adecvat (prea multe paranteze, nu sunt necesare deloc)
		mathEquation = ((((operand1))) + (operand2) + (operand3));
		 
		// Este valid? - NU
		// De ce? Raspunsul tau: valoarea data de operatia din partea dreapta a = nu poate fi data unei alte operatii, ci unei variabile
		// mathEquation / 2 = operand1 + operand2;
		 
		// Este valid? - DA
		// De ce? Raspunsul tau: valoarea data de operatia din partea dreapta va fi atribuita variabilei din stanga
		// nu e un coding style adecvat (prea multe paranteze, nu sunt necesare deloc)
		mathEquation = ((operand1)) + (operand2) + (operand3);
		 
		// Este valid? - DA
		// De ce? Raspunsul tau: programul va printa variabila mathEquation, careia i-a fost atricuita valoarea operatiei de dupa paranteza
		// Q: in cazul asta sunt prea multe paranteze pt un coding style adecvat, sau e mai bine asa pt a citi codul mai usor?
		System.out.println(((mathEquation = (operand1 + operand2)/2)));
		 
		// Este valid? - DA
		// De ce? Raspunsul tau: chiar daca nu are sens, codul este valid; i-am atribuit valoarea lui mathEquation variabilei mathEquatiion
		System.out.println(mathEquation = ((mathEquation)));
	}
}
