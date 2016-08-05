package shop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

import instruments.Instrument;
import instruments.InstrumentType;

public class MusicShop {

	private String name;
	private double money;
	private TreeMap<InstrumentType, TreeSet<Instrument>> catalog;

	public MusicShop(String name, double money) {
		this.setName(name);
		this.setMoney(money);
		this.catalog = new TreeMap<InstrumentType, TreeSet<Instrument>>();
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		if (name != null && name.length() > 2)
			this.name = name;
	}

	public double getMoney() {
		return money;
	}

	private void setMoney(double money) {
		if (money > 0)
			this.money = money;
	}

	private void addMoney(double money) {
		if (money >= 0) {
			this.money += money;
		}
	}

	public void addInstrument(Instrument instrument) {
		if (!this.catalog.containsKey(instrument.getType())) {
			this.catalog.put(instrument.getType(), new TreeSet<>());
		}
		this.catalog.get(instrument.getType()).add(instrument);
	}

	public void sell(Instrument instrument) {

		if (this.catalog.containsKey(instrument.getType())) {
			if (this.catalog.get(instrument.getType()).contains(instrument)) {
				Instrument currentInst = this.catalog.get(instrument.getType()).ceiling(instrument);
				if (currentInst.getAmounth() >= instrument.getAmounth()) {
					double total = instrument.getAmounth() * currentInst.getPrice();
					this.addMoney(total);
					currentInst.remove(instrument.getAmounth());
					
					System.err.println("\n"+this.getName() +" sold "+ instrument.getAmounth() +" "+ instrument.getName() +" by "+ currentInst.getPrice()+"lv. = "+total+"lv.");

				} else {
					System.err.println(instrument.getName() + " no enought!");
				}

				System.out.println();
			} else {
				System.err.println(instrument.getName() + " do not exist!");
			}
		} else {
			System.out.println(instrument.getType() + " do not exist!");
		}

	}

	@Override
	public String toString() {
		return (name != null ? "\n" + name + ", " : "") + "money:" + money + ", "
				+ (catalog != null ? "\n\t" + catalog : "");
	}

}
