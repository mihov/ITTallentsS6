package food;

import meal.Meal;
import utils.MealType;

public abstract class Food extends Meal {
	private Double weight;

	public Food(String name, Double money, Double weight) {
		super(name, money, MealType.FOOD);
		this.setWeight(weight);

	}

	public Double getWeight() {
		return weight;
	}

	private void setWeight(Double weight) {
		if (weight >= 0) {
			this.weight = weight;
		} else {
		}

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ " - "+this.getWeight()+"gr.";
	}

}
