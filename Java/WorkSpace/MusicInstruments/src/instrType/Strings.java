package instrType;

import instruments.Instrument;
import instruments.InstrumentType;

public abstract class Strings extends Instrument {

	public Strings(String name, double price, int amounth) {
		super(InstrumentType.Strings, name, price, amounth);
	}
}
