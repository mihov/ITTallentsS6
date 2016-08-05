package vinetki2;

import java.util.ArrayList;
import java.util.Random;

import vinetki2.Driver.*;
import vinetki2.Vehicles.*;

public class Generator implements Constants {
	private Random rn;

	public Generator() {
		rn = new Random();
	}

	public Driver generateDriver(GasStation gasStation) {
		int index = this.rn.nextInt(NAMES.length);
		int index1 = this.rn.nextInt(NAMES.length);
		return new Driver(NAMES[index] + " " + NAMES[index1], (double) (rn.nextInt(2000) + 50), gasStation);
	}

	public GasStation randomGasStation(ArrayList<GasStation> gSList) {
		return gSList.get(this.rn.nextInt(gSList.size()));
	}

	public Vehicle generateCar() {
		switch (rn.nextInt(3)) {
		case 0:
			return new Car(CAR_BRANDS[rn.nextInt(CAR_BRANDS.length)], (1990 + rn.nextInt(15)));

		case 1:
			return new Truck(CAR_BRANDS[rn.nextInt(CAR_BRANDS.length)], (1990 + rn.nextInt(15)));

		default:
			return new Bus(CAR_BRANDS[rn.nextInt(CAR_BRANDS.length)], (1990 + rn.nextInt(15)));
		}

	}
}
