package C13OOPClaseObiecte1;

public class Pisica {
	
	String rasaPisica;
	String numePisica;
	String culoarePisica;
	double varstaPisica;
	double kgPisica;
	
	public void printCatState() {
		System.out.println("Detalii despre " + numePisica + ":"
						+ "\n\t - rasa: " + rasaPisica
						+ "\n\t - culoare: " + culoarePisica
						+ "\n\t - varsta: " + varstaPisica + " ani"
						+ "\n\t - greutate: " + kgPisica + " kg");	
	}
	
	public void manancaMancare(double cantitateMancare) {
		kgPisica = kgPisica + cantitateMancare / 20;
	}
	
	public void treceTimpul(double ani) {
		varstaPisica += ani;
	}
	
	public void seImbolnaveste() {
		kgPisica -= 0.2;
	}
}
