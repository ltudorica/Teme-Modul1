package W03;

public class GenericPackage {
	
	private final String uniqueID;
	private double weight;
	private String packageName;
	private static String courierName;

	public GenericPackage(String uniqueID, double weight, String packageName) {
		this.uniqueID = uniqueID;
		this.weight = weight;
		this.packageName = packageName;
	}
	
	public GenericPackage(String uniqueID) {
		this(uniqueID, 0, "unknown");
	}

	public static String getCourierName() {
		return GenericPackage.courierName;
	}

	public static void setCourierName(String courierName) {
		GenericPackage.courierName = courierName;
	}

	public String getPackageName() {
		return this.packageName;
	}
	
	public String getUniqueID() {
		return this.uniqueID;
	}
	
	public double getWeight() {
		return this.weight;
	}

	public void addItem(double itemWeight) {
		this.weight += itemWeight;
	}
	
	private boolean containsOnlyNo() {

		for(int i = 0; i < this.uniqueID.length(); i++) {
			if (Character.isDigit(this.uniqueID.charAt(i)) == false) {
				return false;
			} 
		}
		
		return true;
	}
	
	private int[] turnStringtoArray() {
	
		int[] myArray = new int[this.uniqueID.length()];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] =  Character.getNumericValue(this.uniqueID.charAt(1));
		}
		
		return myArray;
	}
	
	private boolean oddSumMultiple3() {
		int[] myArray = turnStringtoArray();
		int sum = 0;
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] % 2 == 1) {
				sum++;
			}
		}
		
		return (sum % 3 == 0);
	}
	
	private boolean sumNoDiv4() {
		int[] myArray = turnStringtoArray();
		int sum = 0;
		for (int i = 0; i < myArray.length; i++) {
			sum += myArray[i];
		}
		
		return (sum % 4 == 0);
	}
	
	private boolean dif2ConsecutiveNo() {
		int[] myArray = turnStringtoArray();
		for (int i = 0; i < myArray.length - 1; i++) {
			int helpNo = Math.abs(myArray[i] - myArray[i+1]);
			if (helpNo >= 5) {
				return false;
			}	
		}
		
		return true;
	}

	private boolean length() {
		return this.uniqueID.length() > 9 && this.uniqueID.length() < 13;
	}
	
	public boolean checkID() {
		if (containsOnlyNo()) {
			if (oddSumMultiple3() && sumNoDiv4() && dif2ConsecutiveNo() && length()) {
				return true;
			}
		}
		
		return false;
	}
	
	public String computeDetails() {
		String myString = ("Pachetul " + getPackageName() + " avand codul " + getUniqueID() + " si greutatea "
				+ getWeight() + " apartine curierului " + GenericPackage.getCourierName() + ".");
		return myString;
	}
	
	public static void main(String[] args) {
		GenericPackage whatever = new GenericPackage("12345", 2.2, "blabla");
		whatever.addItem(0.3);
		System.out.println(whatever.getWeight());
		System.out.println(whatever.computeDetails());
		System.out.println(whatever.dif2ConsecutiveNo());
	}
}
