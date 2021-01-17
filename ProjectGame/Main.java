package ProjectGame;

public class Main {	
	public static void main(String[] args) {
		PlayerStatus.setGameName("The goofy game");
		
		PlayerStatus player1 = new PlayerStatus("Balu", 3, 500_000);
		PlayerStatus player2 = new PlayerStatus("Lulu", 3, 500_000);
		
		System.out.println("The game name is: " + PlayerStatus.getGameName());
		

		player1.setHealth(20);
		player1.setPositionX(1.5);
		player1.setPositionY(1);
		player1.findArtifact(222);
		player1.movePlayerTo(3, 6);
		player1.setWeaponInHand("sniper");
		player1.printInfo(player2);

		player2.setHealth(50);
		player2.setPositionX(1.8);
		player2.setPositionY(2);
		player2.findArtifact(7);
		System.out.println("Lulu has now: "
					+ "\n\t lives: " + player2.getLives()
					+ "\n\t health: " + player2.getHealth()
					+ "\n\t score: " + player2.getScore());
		player2.movePlayerTo(8, 2);
		System.out.println("Lulu position: " + player2.getPositionX() + ", "
						+ player2.getPositionY());
		player2.setWeaponInHand("knife");
		System.out.println("Lulu's weapon: " + player2.getWeaponInHand());
		
		System.out.println(player1.getDistance(player2));
		System.out.println(player1.shouldAttackOponent(player2));
		player1.fight(player2);
		
		System.out.println("Balu has now: " + player1.getLives() + " lives"
						+ " and Lulu: " + player2.getLives() + " lives");
		
		System.out.println();
		System.out.println(" 		ROUND 2 ");		
		player1.printInfo(player2);
		player2.printInfo(player1);
		
		player1.movePlayerTo(1500, 1000);
		System.out.println(player1.getDistance(player2));
		player1.setWeaponInHand("kalashnikov");
		player2.setWeaponInHand("sniper");
		
		System.out.println(player2.shouldAttackOponent(player1));
		player2.setWeaponInHand("sniper");
		System.out.println(player1.shouldAttackOponent(player2));
		player1.fight(player2);
		player1.fight(player2);
		player1.fight(player2);
		
	}
}


