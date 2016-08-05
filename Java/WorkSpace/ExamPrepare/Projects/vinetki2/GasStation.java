package vinetki2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import vinetki2.Vehicles.*;
import vinetki2.Vinetki.*;

public class GasStation implements IGasStation {
	private double oborot;
	private List<Vinetka> vinetkiList;
	private String name;

	public GasStation(String name, int amounthVinetki) {
		vinetkiList = new ArrayList<Vinetka>();
		this.oborot = 0;
		this.name = name;
		generateVinetki(amounthVinetki);
	}

	public double getOborot() {
		return oborot;
	}

	public String getName() {
		return name;
	}

	private void sort() {
		Collections.sort(vinetkiList, new Comparator<Vinetka>() {
			public int compare(Vinetka vinetka1, Vinetka vinetka2) {
				return vinetka1.getPrice().compareTo(vinetka2.getPrice());
			}
		});
	}

	@Override
	public void generateVinetki(int amounth) {
		Random rnd = new Random();
		for (int i = 0; i < amounth; i++) {
			switch (rnd.nextInt(3)) {
			case 0:
				this.vinetkiList.add(new CarVinetka(EDuration.values()[rnd.nextInt(3)]));
				break;

			case 1:
				this.vinetkiList.add(new TruckVinetka(EDuration.values()[rnd.nextInt(3)]));
				break;

			default:
				this.vinetkiList.add(new BusVinetka(EDuration.values()[rnd.nextInt(3)]));
				break;
			}
		}
	}

	@Override
	public Vinetka sellVinetka(Vehicle vehicle, EDuration duration) {
		System.out.println("==============");
		System.out.println(vehicle.getClass());
		// int index = this.vinetkiList.lastIndexOf(new )
		return new CarVinetka(EDuration.Dayly);
	}

	public void printAllVinetki() {
		this.sort();
		double sum = 0;
		int i = 1;
		for (Vinetka vinetka : vinetkiList) {
			System.out.println(i++ + ". " + vinetka);

			sum += vinetka.getPrice();
		}

		System.out.println("Total: " + sum + "lv.");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nGasStation [");
		if (name != null) {
			builder.append("name:");
			builder.append(name);
			builder.append(",\t");
		}
		builder.append("oborot:");
		builder.append(oborot);
		builder.append("lv.,\t");
		if (vinetkiList != null) {
			builder.append("vinetki:");
			builder.append(vinetkiList.size());
		}
		builder.append("]");
		return builder.toString();
	}

}

// Всяка бензиностанция има следните характеристики:
//  Оборот за деня,
//  Списък с винетки, налични за продажба

// Бензиностанцията има следните операции :
// • при създаване да генерира на произволен принцип 10 000 винетки от
// всякакъв тип (за кола, за камион, за автобус, дневни, месечни, годишни).
// Изисква се бензиностанцията да поддържа този списък постоянно
// сортиран по цена.
// • Бензиностанцията има и операция за продажба на винетка за определено
// превозно средство и за даден период (дневна, месечна, годишна). След
// продажба на винетка останалите трябва да останат, отново в сортирана
// последователност