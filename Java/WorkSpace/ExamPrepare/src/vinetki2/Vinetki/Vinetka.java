package vinetki2.Vinetki;

import java.util.Calendar;

import vinetki2.EDuration;

public abstract class Vinetka implements IVinetka {
	private Calendar dateIzdavane;
	private String color;
	private Calendar dateValidnost;
	private double price;
	private int timeToStick;
	private EDuration duration;

	public Vinetka(String color, int timeToStick, double daylyPrice, EDuration duration) {
		this.setColor(color);
		this.setTimeToStick(timeToStick);
		this.setPrice(daylyPrice, duration);
		this.duration = duration;
	}

	@Override
	public Double getPrice() {
		return this.price;
	}

	public Calendar getDateIzdavane() {
		return dateIzdavane;
	}

	protected void setDateIzdavane(Calendar dateIzdavane) {
		this.dateIzdavane = dateIzdavane;
	}

	public String getColor() {
		return color;
	}

	private void setColor(String color) {
		this.color = color;
	}

	public Calendar getDateValidnost() {
		return dateValidnost;
	}

	protected void setDateValidnost(Calendar dateValidnost) {
		this.dateValidnost = dateValidnost;
	}

	protected void setPrice(double daylyPrice, EDuration duration) {

		switch (duration) {
		case Dayly:
			this.price = daylyPrice;
			break;

		case Monthly:
			this.price = daylyPrice * MONTHLY_PRICE;
			break;

		default:
			this.price = daylyPrice * MONTHLY_PRICE * YEARLY_PRICE;
			break;
		}

	}

	public int getTimeToStick() {
		return timeToStick;
	}
	
	public EDuration getDuration(){
		return this.duration;
	}

	private void setTimeToStick(int timeToStick) {
		this.timeToStick = timeToStick;
	}

	@Override
	public int stickOnWindSheald() {
		return this.getTimeToStick();
	}

	@Override
	public String toString() {
		return "T:" + this.getClass().getSimpleName() + "\t D:" + this.duration + "\t C:" + this.getColor()+ "\t P:" + this.getPrice() ;
	}

}

// Всяка винетка има следните характеристики:
//  Дата на издаване – ден, месец и година
//  Цвят
//  Срок на валидност – дневна, месечна или годишна.
