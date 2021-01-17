package ProjectGame;

public class FindArtifact {
	protected static int scoreIncrease;
	protected static int livesIncrease;
	protected static int health;
	
	public static int getScoreIncrease() {
		return scoreIncrease;
	}

	public static int getLivesIncrease() {
		return livesIncrease;
	}

	public static int getHealth() {
		return health;
	}

	public static boolean isPerfect(int artifactCode) {
		if (artifactCode <= 1) {
			return false;
		}
		int sum = 1;
		for (int it = 2; it <= artifactCode / 2; it++) {
			if (artifactCode % it == 0) {
				sum += it;
			}
		}
		return (sum == artifactCode);
	}
	
	public static boolean isPrime(int artifactCode) {
		for (int it = 2; it <= artifactCode / 2; it++) {
			if (artifactCode % it == 0) {
				return false;		
			}
		}
		return true;	
	}
	
	public static boolean isEvenDiv3(int artifactCode) {
		int checkNo = artifactCode;
		int sum = 0;
		while (checkNo != 0) {
			sum += checkNo % 10;
			checkNo /= 10;
		}	
		return (artifactCode % 2 == 0 && sum % 3 == 0);
	}
	
	public static void findArtifact(int artifactCode) {
		if (isPerfect(artifactCode)) {
			scoreIncrease = 5000;
			livesIncrease = 1;
			health = 100;
		} else if (isPrime(artifactCode)) {
			scoreIncrease = 1000;
			livesIncrease = 2;
			health = 25;
		} else if (isEvenDiv3(artifactCode)) {
			scoreIncrease = -3000;
			health = -25;
		} else {
			scoreIncrease = artifactCode;
			
		}
	}
}
