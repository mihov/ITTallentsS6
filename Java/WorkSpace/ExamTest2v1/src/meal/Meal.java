package meal;

import utils.MealType;
import utils.NameAndMoneyBaseClass;

public abstract class Meal extends NameAndMoneyBaseClass {
	private MealType mealType;

	public Meal(String name, Double money, MealType mealType) {
		super(name, money);
		this.mealType = mealType;
		// TODO Auto-generated constructor stub
	}

	public MealType getMealType() {
		return mealType;
	}
	

}
