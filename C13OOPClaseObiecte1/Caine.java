package C13OOPClaseObiecte1;

public class Caine {
	
	String rasaCaine;
	String numeCaine;
	String culoareCaine;
	double varstaCaine;
	double kgCaine;
	
	public void printDetaliiCaine() {
		System.out.println("Detalii despre " + numeCaine + ":"
						+ "\n\t - rasa: " + rasaCaine
						+ "\n\t - culoare: " + culoareCaine
						+ "\n\t - varsta: " + varstaCaine + " ani"
						+ "\n\t - greutate: " + kgCaine + " kg");
	}
	
	public void manancaBobite(double cantitateBobite) {
		kgCaine = kgCaine + cantitateBobite / 10;
	}
	
	public void treceTimpul(double ani) {
		varstaCaine += ani;
	}
	
	public void seImbolnaveste() {
		kgCaine -= 0.5;
	}
}

