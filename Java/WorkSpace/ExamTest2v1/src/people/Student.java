package people;

import java.util.HashMap;

import meal.Meal;
import utils.ICustomer;
import utils.MealType;

public class Student extends People implements ICustomer {
	private static int number = 1;

	public Student() {
		super("Student " + number++, 10.0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void readMenu(HashMap<MealType, Meal> menu) {
		// TODO Auto-generated method stub

	}

}
