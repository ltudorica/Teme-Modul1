package ProjectLazyNumbers;

public class Main {
	public static void main(String[] args) {
		LazyNumberDetails lnd;
		lnd = new LazyNumberDetails(23);
		
		lnd.updateNumber(10); 				
		lnd.updateNumber(17); 				 
		System.out.println(lnd.isPrime());       
		System.out.println(lnd.isPrime());   
		
		lnd.updateNumber(2147483647); 	
		long startTime = System.nanoTime();
		System.out.println(lnd.isPrime()); 
		long stopTime = System.nanoTime();
		System.out.println("Timpul este " + (double)(stopTime - startTime) / 1000_000_000); 
		startTime = System.nanoTime();
		System.out.println(lnd.isPrime());   
		stopTime = System.nanoTime();
		System.out.println("Timpul este " + (double)(stopTime - startTime) / 1_000_000_000); 
		
		lnd.updateNumber(8128); 
		startTime = System.nanoTime();
		System.out.println(lnd.isPerfect()); 
		stopTime = System.nanoTime();
		System.out.println("Timpul este " + (double)(stopTime - startTime) / 1_000_000_000); 
		startTime = System.nanoTime();
		System.out.println(lnd.isPerfect());     
		stopTime = System.nanoTime();
		System.out.println("Timpul este " + (double)(stopTime - startTime) / 1_000_000_000); 
		startTime = System.nanoTime();
		
		lnd.updateNumber(23456788); 
		startTime = System.nanoTime();
		System.out.println(lnd.isMagic()); 
		stopTime = System.nanoTime();
		System.out.println("Timpul este " + (double)(stopTime - startTime) / 1_000_000_000); 
		startTime = System.nanoTime();
		System.out.println(lnd.isMagic()); 
		stopTime = System.nanoTime();
		System.out.println("Timpul este " + (double)(stopTime - startTime) / 1_000_000_000); 
	}
	
}
