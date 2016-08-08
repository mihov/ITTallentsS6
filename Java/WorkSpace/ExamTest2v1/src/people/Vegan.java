package people;

import java.util.HashMap;

import meal.Meal;
import utils.ICustomer;
import utils.MealType;

public class Vegan extends People implements ICustomer {

	private static int number = 1;

	public Vegan() {
		super("Vegan " + (number++), 30.0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void readMenu(HashMap<MealType, Meal> menu) {
		// TODO Auto-generated method stub

	}

}
