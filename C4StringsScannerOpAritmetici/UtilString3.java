package C4StringsScannerOpAritmetici;
public class UtilString3 {
	public static void main(String[] args) {
		
		/* programul va afisa:
		 * Experiment: The maximum speed achieved by the object.
		 * Final Speed reult: 1230030.001
		 */
		
		double precisionError = 0.001;
		int theApproximateResult = 123003;
		 
		String experimentName = "The maximum speed achieved by the object.";
		 
		System.out.println("Experiment: " + experimentName);
		System.out.println("Final speed result: " + theApproximateResult + precisionError);
	}
}
