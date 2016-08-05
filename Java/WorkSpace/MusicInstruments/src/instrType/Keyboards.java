package instrType;

import instruments.Instrument;
import instruments.InstrumentType;

public abstract class Keyboards extends Instrument {

	public Keyboards(String name, double price, int amounth) {
		super(InstrumentType.Keyboards, name, price, amounth);
	}

}
