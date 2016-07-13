package Main;

public class StartUp {

	public static void main(String[] args) {
		Crupie crupie = new Crupie();

		Player player1 = new Player("Ivan");
		Player player2 = new Player("Georgi");

		crupie.getInitialDeckToPlayer(player1);
		crupie.getInitialDeckToPlayer(player2);

		System.out.println(player1 + "\n" + player2 + "\n");
		System.out.println("\t" + player1.getName() + "\t" + player2.getName());

		while (!crupie.play(player1, player2)) {
		}

		crupie.sayWinner(player1, player2);

		System.out.println(player1);
		System.out.println(player2);
	}
}
