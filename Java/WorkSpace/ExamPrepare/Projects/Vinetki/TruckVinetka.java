package Vinetki;

public class TruckVinetka extends Vinetka {

	public TruckVinetka(Period period) {
		super(10, "Blue");
		double pricePerDay = 7;

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
