package utils;

import java.util.Random;

import drink.Alcohol;
import drink.SoftDrink;
import food.Dessert;
import food.MainDish;
import food.Salad;
import main.Restaurant;
import people.Gangster;
import people.Student;
import people.Vegan;
import people.Waiter;

public class InitialGenerator {

	public static void generateWaiters(Restaurant restaurant, int count) {
		if (count > 0) {
			System.out.println("====    Waiters    ====");
			for (int i = 0; i < count; i++) {
				restaurant.waiterRedyForWork(new Waiter("Waiter " + (i + 1)));
			}
			System.out.println("====    Waiters END   ====");
		}
	}

	public static void generateCustomers(Restaurant restaurant, int count) {
		Random rnd = new Random();

		if (count > 0) {
			System.out.println("====    Customers    ====");
			for (int i = 0; i < count; i++) {
				switch ((rnd.nextInt(10) + 1)) {
				case 1:
				case 2:
					restaurant.newCustomerEnters(new Vegan());
					break;
				case 3:
				case 4:
				case 5:
					restaurant.newCustomerEnters(new Student());
					break;
				default:
					restaurant.newCustomerEnters(new Gangster());
					break;
				}
			}
			System.out.println("====    Customers END   ====");
		}

	}

	public static void generateDrinks(Restaurant restaurant, int count) {
		for (int i = 1; i <= count; i++) {
			restaurant.addToMenu(new SoftDrink("Soft Drink " + i));
			restaurant.addToMenu(new Alcohol("Alcohol Drink " + i));
		}

	}

	public static void generateFoods(Restaurant restaurant, int count) {
		Random rnd = new Random();
		for (int i = 1; i <= count; i++) {
			try {
				restaurant.addToMenu(new Dessert("Desert " + i, (double) (rnd.nextInt(100) + 200)));
			} catch (WrongWeightExeption e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				restaurant.addToMenu(new Salad("Salad " + i, (double) (rnd.nextInt(300) + 300)));
			} catch (WrongWeightExeption e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				restaurant.addToMenu(new MainDish("Desert " + i, (double) (rnd.nextInt(400) + 400)));
			} catch (WrongWeightExeption e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
