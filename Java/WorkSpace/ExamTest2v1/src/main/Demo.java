package main;

import utils.InitialGenerator;

public class Demo {

	public static void main(String[] args) {

		Restaurant priPeshoTalanta = new Restaurant("Pri Pesho Talanta", 1000.0, "Sofia, #1 Vitosha Bvd.");

		InitialGenerator.generateWaiters(priPeshoTalanta, 5);
		InitialGenerator.generateCustomers(priPeshoTalanta, 15);
		InitialGenerator.generateDrinks(priPeshoTalanta, 20);
		InitialGenerator.generateFoods(priPeshoTalanta, 10);
		
		priPeshoTalanta.printMenu();
		
		priPeshoTalanta.showAllWaiters();
		priPeshoTalanta.showAllGuests();
		
		

	}

}
