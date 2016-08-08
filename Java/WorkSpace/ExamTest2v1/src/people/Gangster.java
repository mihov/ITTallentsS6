package people;

import java.util.HashMap;

import meal.Meal;
import utils.ICustomer;
import utils.MealType;

public class Gangster extends People implements ICustomer {
	private static int number = 1;

	public Gangster() {
		super("Gangster " + number++, 50.0);
	}

	@Override
	public void readMenu(HashMap<MealType, Meal> menu) {
		// TODO Auto-generated method stub

	}

}
