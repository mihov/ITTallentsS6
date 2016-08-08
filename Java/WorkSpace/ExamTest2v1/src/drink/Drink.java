package drink;

import meal.Meal;
import utils.MealType;

public abstract class Drink extends Meal {

	public Drink(String name, Double money) {
		super(name, money, MealType.DRINK);
	}

}
