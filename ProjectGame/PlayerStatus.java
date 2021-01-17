package ProjectGame;

public class PlayerStatus {

	private final String nickname;
	private int score;
	private int lives;
	private int health;
	private String weaponInHand;
	private double positionX;
	private double positionY;
	private static String gameName;
	private double chance; 
	private double distance;
		
	public PlayerStatus(String nickname, int lives, int score) {
		this.nickname = nickname;
		this.lives = lives;
		this.score = score;
	}
	
	public PlayerStatus(String nickname) {
		this(nickname, 0, 0);
	}
	
	public PlayerStatus(String nickname, int lives) {
		this(nickname, lives, 0);
	}
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if (health <= 0 ) {
			lives--;
			this.health = 100;
		} else if (health > 100) {
			this.health = 100;
		} else {
			this.health = health;
		}
		GameRules.lives(this.lives);
	}

	public int getLives() {
		GameRules.lives(this.lives);
		return this.lives;
	}

	public void setLives(int lives) {
		GameRules.lives(this.lives);
		this.lives = lives;
	}
	
	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public void findArtifact(int artifactCode) {
		FindArtifact.findArtifact(artifactCode);
		this.score += FindArtifact.getScoreIncrease();
		this.lives += FindArtifact.getLivesIncrease();
		this.health += FindArtifact.getHealth();
		if (health <= 0 ) {
			lives--;
			this.health = 100;
		} else if (health > 100) {
			this.health = 100;
		}
		GameRules.lives(this.lives);
	}

	public String getWeaponInHand() {
		return weaponInHand;
	}
	
	public boolean setWeaponInHand(String weaponInHand) {
		if (GameRules.weapon(weaponInHand) && score >= GameRules.weaponPrice(weaponInHand)) {
			this.score -= GameRules.weaponPrice(weaponInHand);
			this.weaponInHand = weaponInHand;
			return true;
		}	
		return false;
	}

	public double getPositionX() {
		return this.positionX;
	}
	
	public void setPositionX(double positionX) {
		this.positionX = positionX;
	}
	
	public double getPositionY() {
		return positionY;
	}
	
	public void setPositionY(double positionY) {
		this.positionY = positionY;
	}
	
	public static String getGameName() {
		return gameName;
	}

	protected static void setGameName(String gameName) {
		PlayerStatus.gameName = gameName;
	}
	
	public void movePlayerTo(double positionX, double positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
	}

	public String getNickname() {
		return nickname;
	}
	
	public double chanceSameDist() {
		chance = (3 * health + score / 1000) / 4;
		return chance;
	}

	public double getDistance(PlayerStatus oponent) {
		double x = this.getPositionX() - oponent.getPositionX();
		double y = this.getPositionY() - oponent.getPositionY();
		this.distance = Math.hypot(x, y);
		return distance;
	}
	
	public boolean shouldAttackOponent(PlayerStatus oponent) {
		if (this.weaponInHand.equals(oponent.weaponInHand)) {
			if (this.chanceSameDist() > oponent.chanceSameDist()) {
				return true;
			} return false;
		} else if (this.getDistance(oponent) > 1000 && GameRules.weaponPowerBigDist(this.weaponInHand) > 
					GameRules.weaponPowerBigDist(oponent.weaponInHand)) {
			return true;
		} else if (this.getDistance(oponent) <= 1000 && GameRules.weaponPowerSmallDist(this.weaponInHand) > 
					GameRules.weaponPowerSmallDist(oponent.weaponInHand)) {
			return true;
		}
		return false;
	}
	
	public void fight(PlayerStatus oponent) {
		if (this.shouldAttackOponent(oponent)) {
			System.out.println(this.getNickname() + " won! " + oponent.getNickname() + " lost!");
			this.lives++;
			oponent.lives--;
		} else {
			System.out.println(this.getNickname() + " lost! " + oponent.getNickname() + " is the winner!");
			this.lives--;
			oponent.lives++;
		}
		GameRules.lives(this.lives);
	}

	public void printInfo(PlayerStatus oponent) {
		System.out.println("The player " + this.getNickname() + " has:"
					+ "\n\t lives: " + this.getLives()
					+ "\n\t health: " + this.getHealth()
					+ "\n\t score: " + this.getScore()
					+ "\n\t weapon: " + this.getWeaponInHand()
					+ "\n\t position: " + this.getPositionX() + ", " + this.getPositionY()
					+ "\n\t distance to the other player: " + this.getDistance(oponent));
	}
}

