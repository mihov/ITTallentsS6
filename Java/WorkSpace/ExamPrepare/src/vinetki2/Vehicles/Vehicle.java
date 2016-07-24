package vinetki2.Vehicles;

import vinetki2.Vinetki.Vinetka;

public abstract class Vehicle {
	private String model;
	private Vinetka vinetka;
	private int madeYear;

	public Vehicle(String model, int madeYear) {
		this.model = model;
		this.madeYear = madeYear;
	}

	public Vinetka getVinetka() {
		return vinetka;
	}

	public void setVinetka(Vinetka vinetka) {
		this.vinetka = vinetka;
	}

	public String getModel() {
		return model;
	}

	public int getMadeYear() {
		return madeYear;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nVehicle [");
		if (getClass() != null) {
			builder.append("Type: ");
			builder.append(getClass().getSimpleName());
			builder.append("\t");
		}
		
		if (model != null) {
			builder.append("model:");
			builder.append(model);
			builder.append("\t");
		}
		if (vinetka != null) {
			builder.append("vinetka=");
			builder.append(vinetka);
			builder.append("\t");
		}
		builder.append("made:");
		builder.append(madeYear);

		builder.append("]");
		return builder.toString();
	}
	
	

}
// Всяко превозно средство има следните характеристики:
//  Модел на превозното средство ,
//  Винетка, която е залепена на стъклото му,
//  Година на производство.
