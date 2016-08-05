package instrType;

import instruments.Instrument;
import instruments.InstrumentType;

public abstract class Horns extends Instrument {

	public Horns(String name, double price, int amounth) {
		super(InstrumentType.Horns, name, price, amounth);
		
	}

}
