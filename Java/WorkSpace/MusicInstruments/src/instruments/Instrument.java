package instruments;

public abstract class Instrument implements Comparable<Instrument> {
	private String name;
	private double price;
	private int amounth;
	private InstrumentType type;

	public Instrument(InstrumentType type, String name, double price, int amounth) {
		this.setType(type);
		this.setName(name);
		this.setPrice(price);
		this.setAmounth(amounth);
	}

	private void setAmounth(int amounth) {
		if (amounth > 0) {
			this.amounth = amounth;
		}
	}

	public InstrumentType getType() {
		return type;
	}

	protected void setType(InstrumentType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		if (name != null && name.length() > 2)
			this.name = name;
	}

	public double getPrice() {
		return price;
	}

	private void setPrice(double price) {
		if (price > 0)
			this.price = price;
	}

	public int getAmounth() {
		return amounth;
	}

	public void add(int amounth) {
		if (amounth > 0)
			this.amounth += amounth;
	}

	public void remove(int amounth) {
		if (amounth > 0 && this.amounth >= amounth)
			this.amounth -= amounth;
	}

	@Override
	public boolean equals(Object obj) {
		if (!this.getClass().equals(obj.getClass()))
			return false;

		if (this.getName().equals(((Instrument) obj).getName())) {
			return (this.getType() == ((Instrument) obj).getType());
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		return (type != null ? "\n\tType:" + type + "\t" : "") + (name != null ? "name=" + name + "\t" : "") + "price="
				+ price + "lv.\t amounth=" + amounth + "ps.";
	}

	@Override
	public int compareTo(Instrument o) {

		return this.getName().compareTo(o.getName());
	}

}
