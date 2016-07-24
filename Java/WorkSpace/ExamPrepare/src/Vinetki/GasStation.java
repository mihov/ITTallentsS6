package Vinetki;

import java.util.ArrayList;
import java.util.Random;

public class GasStation {
	private double dailyTurnover;
	private String name;
	ArrayList<Vinetka> vinetkaList;

	public GasStation(String name) {
		// TODO valid
		this.name = name;
		this.vinetkaList = new ArrayList<>(10000);
		this.generateVinetki();
	}

	private void generateVinetki() {
		Random rnd = new Random();
		for (int i = 0; i < 10000; i++) {
			switch (rnd.nextInt(3)) {
			case 0:
				this.vinetkaList.add(new CarVinetka(Period.values()[rnd.nextInt(3)]));
				break;
			case 1:
				this.vinetkaList.add(new BusVinetka(Period.values()[rnd.nextInt(3)]));
				break;
			default:
				this.vinetkaList.add(new TruckVinetka(Period.values()[rnd.nextInt(3)]));
				break;
			}
		}

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
