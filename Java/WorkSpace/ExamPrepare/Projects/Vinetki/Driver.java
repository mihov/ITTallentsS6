package Vinetki;

import java.util.ArrayList;

public class Driver {
	private String name;
	private ArrayList<Vehicle> vehicleList;
	private double money;
	private GasStation gasStation;

	public Driver(String name, double money, GasStation gasStation) {

		this.name = name;
		this.money = money;
		this.gasStation = gasStation;
		vehicleList = new ArrayList<>();
	}

	public void addVehicle(Vehicle vehicle) {
		if (vehicle != null) {
			this.vehicleList.add(vehicle);
			System.out.println("[" + vehicle + "added!]");
		}
	}
/*
 * Когато шофьор купува винетка, той се обръща към бензиностанцията, в която
пазарува и изпълнява съответната операция.
Това намалява парите му и освен това той задава новата винетка на съответното
превозно средство, за което я е купил.
Последната операция, която извършват
 * */
	public void bueVinetkaForAll() {

	}

	public void bueVinetkaFor(int index, Period period ) {

	}

}

/*
 * Шофьорът има следните характеристики:  Име,  Списък с превозни средства, за
 * които отговаря,  Пари,  Бензиностанция, от която пазарува.
 */
