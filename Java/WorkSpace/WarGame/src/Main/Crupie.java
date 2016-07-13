package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Crupie {
	private final List<Card> initialDeck;
	private int giveToPlayer = 2;
	private Player winner;
	private List<Card> tempDeck;

	public Crupie() {
		initialDeck = new ArrayList<Card>();

		for (Suit suit : Suit.values())
			for (Rank rank : Rank.values())
				initialDeck.add(new Card(rank, suit));

		Collections.shuffle(initialDeck);
		tempDeck = new ArrayList<>();
	}

	public void printDeck(List<Card> deck) {

		int i = 1;
		for (Card card : deck) {
			System.out.print(i + ". ");
			System.out.println(card);
			i++;
		}
	}

	public void printHand(String win) {
		System.out.println("\t[" + tempDeck.get(tempDeck.size() - 2) + "]\t[" + tempDeck.get(tempDeck.size() - 1) + "]"
				+ (win.length() > 0 ? ("\t" + win + "\tWIN") : ""));
	}

	public boolean getInitialDeckToPlayer(Player player) {
		switch (this.giveToPlayer) {
		case 2:

			player.setInitialDeck(new ArrayList<Card>(initialDeck.subList(0, initialDeck.size() / 2)));

			this.giveToPlayer--;
			return true;

		case 1:
			player.setInitialDeck(new ArrayList<Card>(initialDeck.subList(initialDeck.size() / 2, initialDeck.size())));

			this.giveToPlayer--;
			return true;

		default:
			return false;
		}
	}

	public boolean addToTempDeck(Player player1, Player player2) {
		if (player1.willPlay()) {
			tempDeck.add(player1.getNextGard());
		} else
			return true;

		if (player2.willPlay()) {
			tempDeck.add(player2.getNextGard());
		} else
			return true;
		return false;
	}

	public boolean play(Player player1, Player player2) {

		if (addToTempDeck(player1, player2))
			return true;

		switch (tempDeck.get(tempDeck.size() - 2).compare(tempDeck.get(tempDeck.size() - 1))) {

		case 1:
			player1.putInFinalDeck(tempDeck);
			printHand(player1.getName());
			tempDeck = new ArrayList<>();
			return player2.lose();

		case -1:
			printHand(player2.getName());
			player2.putInFinalDeck(tempDeck);
			tempDeck = new ArrayList<>();
			return player1.lose();

		default:
			System.out.println("\t==  WAR  ==");
			printHand("");
			if (addToTempDeck(player1, player2))
				return true;
			printHand("");
			if (addToTempDeck(player1, player2))
				return true;
			printHand("");
			if (addToTempDeck(player1, player2))
				return true;

			this.play(player1, player2);
		}
		return false;

	}

	public void sayWinner(Player player1, Player player2) {

		if (player1.getFinalDeckCount() > player2.getFinalDeckCount())
			this.winner = player1;
		if (player1.getFinalDeckCount() < player2.getFinalDeckCount())
			this.winner = player2;

		System.out.println("\n\t================");
		System.out.println("\t=  W I N N E R =");
		System.out.println("\t================");
		if (this.winner != null) {
			System.out.println("\t Name: " + winner.getName());
			System.out.println("\t Points: " + winner.getFinalDeckCount());
		} else {
			System.out.println("\t No Winner ");
			System.out.println("\t Play again");
		}
		System.out.println("\t================");
	}
}
