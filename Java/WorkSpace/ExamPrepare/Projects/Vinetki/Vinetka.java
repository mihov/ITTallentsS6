package Vinetki;

import java.util.Calendar;

public abstract class Vinetka {
	private double price;
	private int stickTime;
	private String color;
	private Calendar validTo;
	private boolean isValidToSet = false;

	public Vinetka(int stickTime, String color) {
		this.stickTime = stickTime;
		this.color = color;
	}

	public void setValidTo(Calendar validTo) {
		if (!this.isValidToSet) {
			this.validTo = validTo;
			this.isValidToSet = true;
		}
	}

	protected void setPrice(double price) {
		if (price > 0)
			this.price = price;
	}

	public double getPrice() {
		return this.price;
	}

	// Later
	public int compareTo(Vinetka obj) {
		if (this.getPrice() < obj.getPrice())
			return -1;
		if (this.getPrice() > obj.getPrice())
			return 1;
		return 0;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getPrice());
		sb.append("lv.\t");
		sb.append(this.stickTime);
		sb.append("s\t");
		sb.append(this.color);
		sb.append("");

		return sb.toString();
	}

}
