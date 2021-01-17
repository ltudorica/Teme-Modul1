package W03;

public class Ex2 {
	public static boolean isEvenOddPatern(int number) {
		int noToHelp1 = 0;
		int noToHelp2 = 0;
		int myInitNo = number;
		
		if (number % 10 % 2 == 0) {
			noToHelp1 = 0;
			noToHelp2 = 1;
		} else {
			noToHelp1 = 1;
			noToHelp2 = 0;
		}
		
		while (myInitNo != 0) {
			if (myInitNo % 10 % 2 == noToHelp1) {
				myInitNo /= 10;
				if (myInitNo % 10 % 2 == noToHelp2) {
					myInitNo /= 10;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		int n = 14385;
		int x = 963510;
		int y = 410103;
		System.out.println(isEvenOddPatern(n));
		System.out.println(isEvenOddPatern(x));
		System.out.println(isEvenOddPatern(y));
	}
}
