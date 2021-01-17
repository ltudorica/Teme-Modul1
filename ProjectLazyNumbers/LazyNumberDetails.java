package ProjectLazyNumbers;

public class LazyNumberDetails {
	private int number;
	private boolean isLastNoPrime;
	private int lastNoForPrime;
	private boolean isLastNoPerfect;
	private int lastNoForPerfect;
	private boolean isLastNoMagic;
	private int lastNoForMagic;
	// era de ajuns un nr
	public LazyNumberDetails(int number) {
		this.number = number;
	}
	
	public void updateNumber(int number) {
		this.number = number;
	}
	
	public boolean isPrimeAlgorithm() {
		System.out.println("just something");
		for (int it = 2; it <= this.number / 2; it++) {
			if (this.number % it == 0) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isPrime() {
		if (this.number == this.lastNoForPrime) {
			return isLastNoPrime;
		}
		this.lastNoForPrime = this.number;
		this.isLastNoPrime = isPrimeAlgorithm();
		
		return isLastNoPrime;
	}
	
	public boolean isPerfectAlgorithm() {
		System.out.println("another something");
		int sum = 1;
		if (this.number <= 1) {
			return false;
		}
		if (isPrimeAlgorithm() == false) { // it reduces the time!
			for (int it = 2; it <= this.number / 2; it++) {
				if (this.number % it == 0) {
					sum += it;
				}
			} 
		}
		return (sum == this.number );
	}
	
	public boolean isPerfect() {
		if (this.number == this.lastNoForPerfect) {
			return isLastNoPerfect;
		}
		this.lastNoForPerfect = this.number;
		this.isLastNoPerfect = isPerfectAlgorithm();
		
		return isLastNoPerfect;
	}
	
	public boolean isMagicAlgorithm() {
		System.out.println("some other bst");
		int myPlayNo = this.number;
		int sum = 0;
		do {
			sum = 0;
			while (myPlayNo != 0) {
				sum += myPlayNo % 10;
				myPlayNo /= 10;
			}
		} while (sum > 9);
		return (sum == 3 || sum == 7 || sum == 9);
	}
	
	public boolean isMagic() {
		if (this.number == this.lastNoForMagic) {
			return isLastNoMagic;
		}
		this.lastNoForMagic = this.number;
		this.isLastNoMagic = isMagicAlgorithm();
		
		return isLastNoMagic;
	}

}
