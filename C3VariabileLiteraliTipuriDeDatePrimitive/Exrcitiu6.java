package C3VariabileLiteraliTipuriDeDatePrimitive;
public class Exrcitiu6 {
	public static void main(String[] args) {
		
		// Variable Homework
		int applesAndrei = 23, orangesAndrei = 45, quinceAndrei = 7;
		int lunchApples = 5, lunchOranges = 2, lunchQuince = 3;
		
		int sumFruits = applesAndrei + orangesAndrei + quinceAndrei;
		int afterLunchApplesOranges = orangesAndrei - lunchOranges + quinceAndrei - lunchQuince;
		int afterLunchSumFruits = sumFruits - lunchApples - lunchOranges -lunchQuince;
		
		System.out.println("Andrei are initial un total de fructe de:");
		System.out.println(sumFruits);
		System.out.println("Dupa masa, Andrei are un total de mere + portocale de:");
		System.out.println(afterLunchApplesOranges);
		System.out.println("\nNumarul total de fructe ramase dupa masa este:");
		System.out.println(afterLunchSumFruits);
	}
}
