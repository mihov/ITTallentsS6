package products;

public abstract class Product implements Cloneable {
	private String name;
	private double price;
	private double quantity;

	public Product(String name, double price, double quantity) {
		super();
		this.setName(name);
		this.setPrice(price);
		this.setQuantity(quantity);
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setPrice(double price) {
		this.price = price;
	}

	private void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return getName() + "\tPrice: " + getPrice() + "\tQuantity:" + getQuantity();
	}

	public void addQuantity(double quantity) {
		if (quantity > 0)
			this.quantity += quantity;
	}

	public boolean removeQuantity(double quantity) {
		if (quantity > 0 && this.quantity >= quantity)
			this.quantity -= quantity;
		return false;
	}

	public boolean equals(Product prouct) {
		return this.getName().equals(prouct.getName())
				&& ((Math.abs(this.getPrice()) - Math.abs(prouct.getPrice())) < 0.001);
	}

	public Product clone() {
		try {
			return ((Product) super.clone());
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

}
