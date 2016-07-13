package Main;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private final String name;
	private List<Card> initialDeck;
	private List<Card> finalDeck;

	public Player(String name) {
		this.name = name;
		System.out.println("Player " + this.name + " created.");
		this.initialDeck = new ArrayList<Card>();
		this.finalDeck = new ArrayList<Card>();
	}

	public String getName() {
		return name;
	}

	public Card getNextGard() {
		int index = this.initialDeck.size() - 1;

		Card result = this.initialDeck.get(index);
		this.initialDeck.remove(index);

		return result;
	}

	public boolean lose() {
		return this.finalDeck.isEmpty() && this.initialDeck.isEmpty();
	}

	public int getFinalDeckCount() {
		return this.finalDeck.size();
	}

	public boolean willPlay() {
		return !this.initialDeck.isEmpty();
	}

	public boolean setInitialDeck(List<Card> initialDeck) {
		if (initialDeck != null) {
			this.initialDeck = initialDeck;
			return true;
		} else {
			return false;
		}
	}

	public boolean putInFinalDeck(List<Card> setOfCards) {
		if (setOfCards != null) {
			return this.finalDeck.addAll(setOfCards);
		} else {
			return false;
		}
	}

	public String toString() {
		return "Name: " + this.getName() + "\t Point: " + this.getFinalDeckCount() + "\tIn deck: "
				+ this.initialDeck.size();
	}
}
