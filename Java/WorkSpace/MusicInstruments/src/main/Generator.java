package main;

import java.util.Random;

import instrType.*;
import instruments.Instrument;
import instruments.InstrumentType;

public class Generator {
	private Random rnd;

	public Generator() {
		rnd = new Random();
		// TODO Auto-generated constructor stub
	}

	public Instrument generateInstrument(InstrumentType type) {
		switch (type) {
		case Strings:
			return generateString();

		case Electronics:
			return generateElectronic();

		case Horns:
			return generateHorn();

		case Keyboards:
			return generateKeyboard();

		case Percussions:
			return generatePercussion();
		default:

		}
		return null;
	}

	private Instrument generatePercussion() {
		// TODO Auto-generated method stub
		return null;
	}

	private Instrument generateKeyboard() {
		// TODO Auto-generated method stub
		return null;
	}

	private Instrument generateHorn() {
		// TODO Auto-generated method stub
		return null;
	}

	private Electronics generateElectronic() {
		// TODO Auto-generated method stub
		return null;
	}

	public Strings generateString() {
		return null;

	}
}
