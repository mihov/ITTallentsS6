package utils;

import java.util.HashMap;

import meal.Meal;

public interface ICustomer {

	void makeOrder();

	void askBill();

	void payBill();
	
	void readMenu(HashMap<MealType, Meal> menu);
	
	String getName();

}
