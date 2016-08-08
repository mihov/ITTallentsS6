package people;

import java.util.HashMap;
import java.util.HashSet;

import meal.Meal;
import utils.ICustomer;

public class Waiter extends People {
	private Double tip;
	private HashMap<ICustomer, HashSet<Meal>>customersList; 
	//private ArrayList<ICustomer> customersList;
	

	public Waiter(String name) {
		super(name, 0.0);
		this.tip = 0.0;
		this.customersList = new HashMap<>();
	}
	
	public void addCustomer(ICustomer customer){
		
		
	}

}
