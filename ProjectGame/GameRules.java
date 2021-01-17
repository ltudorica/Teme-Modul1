package ProjectGame;

public class GameRules {

	public static boolean weapon(String weapon) {
		return (weapon == "knife" || weapon == "sniper" || weapon == "kalashnikov");
	}
	
	public static int weaponPowerBigDist(String weaponInHand) {
		int weaponPowerBigDist = 0;
		if (weaponInHand.equals("sniper")) {
			weaponPowerBigDist = 10;
		} else if (weaponInHand.equals("kalashnikov")) {
			weaponPowerBigDist = 5;
		} else if (weaponInHand.equals("knife")) {
			weaponPowerBigDist = 1;
		}
		return weaponPowerBigDist;
	}
	
	public static int weaponPowerSmallDist(String weaponInHand) {
		int weaponPowerSamllDist = 0;
		if (weaponInHand.equals("kalashnikov")) {
			weaponPowerSamllDist = 10;
		} else if (weaponInHand.equals("sniper")) {
			weaponPowerSamllDist = 5;
		} else if (weaponInHand.equals("knife")) {
			weaponPowerSamllDist = 1;
		}
		return weaponPowerSamllDist;
	}
	
	public static int weaponPrice(String weapon) {
		int weaponPrice = 0;
		switch (weapon) {
			case "knife":
				weaponPrice = 1000;
				break;
			case "sniper":
				weaponPrice = 10000;
				break;
			case "kalashnikov":
				weaponPrice = 20000;
				break;
			}
		return weaponPrice;
	}
	
	public static void lives(int lives) {
		if (lives == 0) {
			System.out.println("Game Over");
		}
	}
	

	

}
