package vinetki2.Driver;

import java.util.ArrayList;

import vinetki2.EDuration;
import vinetki2.GasStation;
import vinetki2.Vehicles.Vehicle;

public class Driver implements IDriver {
	private String name;
	private ArrayList<Vehicle> vehicleList;
	private double money;
	private GasStation gasStation;

	public Driver(String name, double money, GasStation gasStation) {
		this.name = name;
		this.money = money;
		this.gasStation = gasStation;
		this.vehicleList = new ArrayList<>();
	}

	@Override
	public void bueVinetkiForAll() {
		// TODO Auto-generated method stub
	}

	@Override
	public void bueVinetkaForID(int index, EDuration duration) {
		if (index >= 0 && index < this.vehicleList.size())
			System.out.println(this.vehicleList.get(index).getClass());

	}

	@Override
	public ArrayList<Vehicle> returnAllVehicleIztekliVinetki(int day, int month, int year) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addVehicle(Vehicle vehicle) {
		if (vehicle != null)
			this.vehicleList.add(vehicle);

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nDriver [name:").append(name).append(", vehicles:").append(vehicleList.size())
				.append(", money:").append(money).append("lv., gasStation:").append(gasStation.getName()).append("]");
		return builder.toString();
	}

}

//  Име,
//  Списък с превозни средства, за които отговаря,
//  Пари,
//  Бензиностанция, от която пазарува.
