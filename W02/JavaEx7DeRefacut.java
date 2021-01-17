package W02;

public class JavaEx7DeRefacut {
	public static long sumSquareNumbers(long n) {
		long sum = 0;
		for (long i = 1; i <= n; i++) {
			sum += i * i;
		}
		long value = sum % 1000000000l;
		/*long newNo = 1;
		for (int i = 8; i != 0; i--) {
			long restNo = sum % 10;
			newNo = newNo * 10 + restNo;
		}*/
		return value;	
	}
	
	public static void main(String[] args) {
		System.out.println(sumSquareNumbers(1123432878));
	}
}
