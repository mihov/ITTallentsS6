package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

import meal.Meal;
import people.Waiter;
import utils.ICustomer;
import utils.MealType;
import utils.NameAndMoneyBaseClass;

public class Restaurant extends NameAndMoneyBaseClass {

	private String address;
	private HashSet<Waiter> waiterList;
	private HashSet<ICustomer> customersList;
	private HashMap<MealType, HashSet<Meal>> menu;

	public Restaurant(String name, Double money, String address) {
		super(name, money);
		this.address = address;
		this.waiterList = new HashSet<>();
		this.menu = new HashMap<>();
		this.customersList = new HashSet<>();
		System.out.println(this);

	}

	public void addToMenu(Meal meal) {
		if (!this.menu.containsKey(meal.getMealType())) {
			this.menu.put(meal.getMealType(), new HashSet<>());
		}
		this.menu.get(meal.getMealType()).add(meal);
	}

	public void newCustomerEnters(ICustomer customer) {
		if (customer != null) {
			if (this.customersList.add(customer)) {
				System.out.println("Customer " + customer + " entered.");
			}
		}
	}

	public void waiterRedyForWork(Waiter waiter) {
		if (waiter != null) {
			if (this.waiterList.add(waiter)) {
				System.out.println("Waiter " + waiter + " added.");
			}
		}
	}

	@Override
	public String toString() {
		return String.format("New restaurant '%s' created on %s with initial money $%s", getName(), address,
				getMoney());
	}

	public void showAllWaiters() {
		System.out.println("=== Waiters List ===");
		ArrayList<Waiter> waiters = new ArrayList<>(waiterList);
		Collections.sort(waiters, new WaiterComparator());

		for (Waiter waiter : waiters) {
			System.out.println(waiter);
		}
		System.out.println("=== Waiters List END ===");
	}

	public void showAllGuests() {
		System.out.println("=== Guests List ===");
		TreeSet<ICustomer> customers = new TreeSet<>((o1, o2) -> o1.getName().compareTo(o2.getName()));

		customers.addAll(customersList);

		for (ICustomer customer : customers) {
			System.out.println(customer);
		}
		System.out.println("=== Guests List END ===");
	}

	public void printMenu() {
		TreeMap<MealType, TreeMap<String, Integer>> menuList = new TreeMap<>();
		String className = "";
		int count = 0;
		for (MealType element : menu.keySet()) {
			//System.out.println(element + ":");
			menuList.put(element, new TreeMap<>());
			for (Object menuElement : (menu.get(element).toArray())) {

				className = menuElement.getClass().getSimpleName();

				if (menuList.get(((Meal) menuElement).getMealType()).containsKey(className)) {

					count = menuList.get(((Meal) menuElement).getMealType()).get(className) + 1;
					menuList.get(((Meal) menuElement).getMealType()).put(className, count);

				} else {
					menuList.get(((Meal) menuElement).getMealType()).put(className, 1);
				}
			}
		}

		for (MealType mealType : menuList.keySet()) {
			System.out.println(mealType + ":");
			for (Entry<String, Integer> element : menuList.get(mealType).entrySet()) {
				System.out.println("\t"+element.getKey() +" - "+element.getValue()+(mealType == MealType.DRINK? " броя":" порции"));
			}
		}
	}

}
