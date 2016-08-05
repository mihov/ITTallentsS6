package shop;

import java.util.Random;

import products.*;

public class Generator implements Constants {
	private Random rnd = new Random();

	public Product generateProduct() {
		if (rnd.nextBoolean()) {
			return generateCountable();
		} else {
			return generateWeightable();
		}
	}

	private Weightable generateWeightable() {
		switch (rnd.nextInt(3)) {
		case 0:
			return new Fish(Constants.FISH_NAMES[rnd.nextInt(Constants.FISH_NAMES.length)], (rnd.nextInt(5) + 5),
					(rnd.nextInt(50) + 10));
		case 1:
			return new Cheese(Constants.CHEES_NAMES[rnd.nextInt(Constants.CHEES_NAMES.length)], (rnd.nextInt(5) + 5),
					(rnd.nextInt(50) + 10));

		default:
			return new Meath(Constants.CHEES_NAMES[rnd.nextInt(Constants.CHEES_NAMES.length)], (rnd.nextInt(5) + 5),
					(rnd.nextInt(50) + 10));
		}
	}

	private Countable generateCountable() {
		// TODO Auto-generated method stub
		switch (rnd.nextInt(3)) {
		case 0:
			return new Book(Constants.BOOK_NAMES[rnd.nextInt(Constants.BOOK_NAMES.length)], (rnd.nextInt(5) + 5),
					rnd.nextInt(50) + 10);
		case 1:
			return new Chair(Constants.CHAIR_NAMES[rnd.nextInt(Constants.CHAIR_NAMES.length)], (rnd.nextInt(5) + 5),
					rnd.nextInt(50) + 10);

		default:
			return new Bear(Constants.BEAR_NAMES[rnd.nextInt(Constants.BEAR_NAMES.length)], (rnd.nextInt(5) + 5),
					rnd.nextInt(50) + 10);
		}
	}
}
