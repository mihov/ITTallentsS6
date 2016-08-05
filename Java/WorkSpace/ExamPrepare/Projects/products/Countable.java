package products;

public abstract class Countable extends Product {

	public Countable(String name, double price, int quantity) {
		super(name, price, quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + "ps.";
	}
}
