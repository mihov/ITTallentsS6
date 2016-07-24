package Vinetki;

public class BusVinetka extends Vinetka {

	public BusVinetka(Period period) {
		super(20, "Grean");
		double pricePerDay = 9;

		switch (period) {
		case Day:
			this.setPrice(pricePerDay);

			break;

		case Month:
			this.setPrice(pricePerDay * 7 * 10);

			break;

		case Year:
			this.setPrice(pricePerDay * 7 * 10 * 6);
			break;

		default:
			break;
		}
	}
}
