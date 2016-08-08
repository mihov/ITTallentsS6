package food;

import utils.IGangsterMeal;
import utils.WrongWeightExeption;

public class MainDish extends Food implements IGangsterMeal {

	public MainDish(String name, Double weight) throws WrongWeightExeption {
		super(name, 9.0, weight);
		if (weight < 400.0 || weight > 800) {
			throw new WrongWeightExeption(weight.toString());
		}
	}
}
