package C3VariabileLiteraliTipuriDeDatePrimitive;
public class TipuriDateEx4 {
	public static void main(String[] args) {
		
		long totalTimeSpent = 2_100_000_000L; //minutes
		 
		// .... 100.000.000 minutes pass ....
		 
		totalTimeSpent = totalTimeSpent + 100_000_000; // increase the value
		 
		// Print the total time
		// Output should be 2_100_000_000 + 100_000_000 = 2_200_000_000 minutes
		System.out.println(totalTimeSpent); 
	}
}
