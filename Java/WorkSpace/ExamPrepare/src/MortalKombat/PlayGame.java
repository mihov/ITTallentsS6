package MortalKombat;

import java.util.Random;

public class PlayGame {

	public static void main(String[] args) {
		Random rnd = new Random();
		Fighter[] ring = new Fighter[2];
		int[] wins = new int[2];
		int rounds = 100;

		for (int winns : wins) {
			winns = 0;
		}

		for (int i = 0; i < rounds; i++) {
			ring[0] = new Fighter("Kano", 100, 60, 7, 40);
			ring[1] = new Fighter("Raiden", 100, 60, 7, 40);

			ring[0].setEnemy(ring[1]);
			ring[1].setEnemy(ring[0]);

			System.out.println("\n============= ROUND " + i + "  ======================");
			
			while (ring[0].alive() && ring[1].alive()) {
				if (rnd.nextBoolean()) {
					ring[0].doHit();
					ring[1].doHit();
				} else {
					ring[1].doHit();
					ring[0].doHit();
				}
			}
			System.out.println("\n======================");
			for (int j = 0; j < 2; j++) {
				System.out.println(ring[j].getName() + "\t live:" + ring[j].getLife());
				if (ring[j].alive())
					wins[j]++;
				System.out.println("======================");
			}
		}
		System.out.println("\n============= TOTAL WINS  ======================");
		for (int j = 0; j < 2; j++) {
			System.out.println(ring[j].getName() + "\t wins:" + wins[j]);
			System.out.println("==============================================");
		}
	}

}
/*
 * Goro Johnny Cage Kano Liu Kang Raiden Reptile Scorpion Shang Tsung Sonya
 * Blade Sub-Zero
 */