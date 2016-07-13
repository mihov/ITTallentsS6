package Main;

public class Card {
	private Rank rank;
	private Suit suit;

	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	private String convertRak(Rank rank) {
		int swKey = rank.ordinal() + 2;
		switch (swKey) {
		case 11:
			return "J";
		case 12:
			return "Q";
		case 13:
			return "K";
		case 14:
			return "A";

		default:
			return String.valueOf(swKey);
		}
	}

	private String convertSuit(Suit suit) {
		switch (suit) {
		case CLUBS:
			return "♣";
		case DIAMONDS:
			return "♦";
		case HEARTS:
			return "♥";
		case SPADES:
			return "♠";
		default:
			return "";
		}
	}

	public Rank rank() {
		return this.rank;
	}

	public Suit suit() {
		return this.suit;
	}

	public String toString() {
		return convertRak(this.rank) + convertSuit(this.suit);
	}

	public int compare(Card card) {
		return Integer.compare(this.rank.ordinal(), card.rank.ordinal());

	}
}
