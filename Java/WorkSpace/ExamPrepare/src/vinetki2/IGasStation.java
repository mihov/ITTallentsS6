package vinetki2;

import vinetki2.Vehicles.Vehicle;
import vinetki2.Vinetki.Vinetka;

public interface IGasStation {
	void generateVinetki(int amounth);

	Vinetka sellVinetka(Vehicle vehicle, EDuration duration);
}
