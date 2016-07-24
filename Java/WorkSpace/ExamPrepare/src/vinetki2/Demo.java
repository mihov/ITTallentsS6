package vinetki2;

import java.util.ArrayList;

import vinetki2.Driver.Driver;
import vinetki2.Vehicles.*;

public class Demo implements Constants {

	public static void main(String[] args) {
		ArrayList<Driver> driverList = new ArrayList<>();
		ArrayList<GasStation> gasStationList = new ArrayList<>();
		ArrayList<Vehicle> vehicleList = new ArrayList<>();

		Generator gn = new Generator();

		for (int i = 0; i < G_S_NAMES.length; i++) {
			gasStationList.add(new GasStation(G_S_NAMES[i], 10000));
		}
		System.out.println(gasStationList);

		for (int i = 0; i < DRIVERS_COUNT; i++) {
			driverList.add(gn.generateDriver(gn.randomGasStation(gasStationList)));

		}
		System.out.println(driverList);

		for (int i = 0; i < VEHICLES_COUNT; i++) {
			vehicleList.add(gn.generateCar());
		}
		System.out.println(vehicleList);

		for (int i = 0; i < driverList.size(); i++) {
			for (int j = 0; j < (VEHICLES_COUNT / DRIVERS_COUNT); j++) {
				driverList.get(i).addVehicle(vehicleList.remove(vehicleList.size() - 1));
			}
		}
		System.out.println(driverList);

		gn = null;
	}

}
