package W02;
public class JavaEx4 {
	public static boolean isSquare(double number) {
		int result = (int) Math.sqrt(number);
		return(number == Math.pow(result, 2));
	}
	
	public static void showPitagoraNumbers(int upperLimit) {
		for (int i = 3; i < upperLimit; i++) {
			for (int j = i+1; j < upperLimit; j++) {
				double sum = Math.pow(i, 2)+ Math.pow(j, 2);
				if (isSquare(sum)) {
					System.out.println(i + " " + j + " " + (int) Math.sqrt(sum));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		showPitagoraNumbers(30);
	}
}
