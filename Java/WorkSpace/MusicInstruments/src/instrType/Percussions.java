package instrType;

import instruments.Instrument;
import instruments.InstrumentType;

public abstract class Percussions extends Instrument {

	public Percussions(String name, double price, int amounth) {
		super(InstrumentType.Percussions, name, price, amounth);
	}

}
