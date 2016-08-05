package products;

public class Cheese extends Weightable {

	public Cheese(String name, double price, int quantity) {
		super(name, price, quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cheese " + super.toString();
	}

}
