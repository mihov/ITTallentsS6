package instrType;

import instruments.Instrument;
import instruments.InstrumentType;

public abstract class Electronics extends Instrument {

	public Electronics( String name, double price, int amounth) {
		super(InstrumentType.Electronics , name, price, amounth);
	}

}
