package Vinetki;

import java.util.Calendar;

public class CarVinetka extends Vinetka {

	public CarVinetka(Period period) {
		super(5, "Red");
		double pricePerDay = 5;

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

	@Override
	public String toString() {
		
		return "T: Car\t" + super.toString();
	}
	
	
}
