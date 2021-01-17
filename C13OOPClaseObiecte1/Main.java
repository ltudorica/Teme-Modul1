package C13OOPClaseObiecte1;

public class Main {
	public static void main(String[] args) {
		Caine myDog = new Caine();
		
		myDog.rasaCaine = "schnauzer pitic";
		myDog.numeCaine = "Smokey";
		myDog.culoareCaine = "sare si piper";
		myDog.varstaCaine = 1;
		myDog.kgCaine = 10;
		
		myDog.manancaBobite(1);
		myDog.treceTimpul(2);
		myDog.printDetaliiCaine();
		
		Caine otherDog = new Caine();
		otherDog.rasaCaine = "Bison";
		otherDog.numeCaine = "Aria";
		otherDog.culoareCaine = "alb";
		otherDog.varstaCaine = 2;
		otherDog.kgCaine = 3;
		
		otherDog.manancaBobite(2);
		otherDog.treceTimpul(3);
		otherDog.seImbolnaveste();
		otherDog.printDetaliiCaine();
		
		Pisica notMyPisica = new Pisica();
		
		notMyPisica.rasaPisica = "siameza";
		notMyPisica.numePisica = "Kitty";
		notMyPisica.culoarePisica = "alba";
		notMyPisica.varstaPisica = 5;
		notMyPisica.kgPisica = 2;
		
		notMyPisica.manancaMancare(0.5);
		notMyPisica.treceTimpul(2);
		notMyPisica.seImbolnaveste();
		notMyPisica.printCatState();
		
		
		Pisica otherPisica = new Pisica();
		
		otherPisica.rasaPisica = "birmaneza";
		otherPisica.numePisica = "Fluffy";
		otherPisica.culoarePisica = "gri";
		otherPisica.varstaPisica = 3;
		otherPisica.kgPisica = 2.5;
		
		otherPisica.manancaMancare(0.8);
		otherPisica.treceTimpul(1);
		otherPisica.printCatState();
	}	
}
