package food;

import utils.WrongWeightExeption;

public class Salad extends Food {

	public Salad(String name, Double weight) throws WrongWeightExeption {
		super(name, 5.0, weight);
		if (weight < 300.0 || weight > 600) {
			throw new WrongWeightExeption(weight.toString());
		}
	}



}
