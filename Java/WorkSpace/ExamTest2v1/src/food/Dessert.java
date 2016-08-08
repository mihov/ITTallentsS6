package food;

import utils.WrongWeightExeption;

public class Dessert extends Food {

	public Dessert(String name, Double weight) throws WrongWeightExeption {
		super(name, 4.0, weight);

		if (weight < 200.0 || weight > 300) {
			throw new WrongWeightExeption(weight.toString());
		}
	}

}
