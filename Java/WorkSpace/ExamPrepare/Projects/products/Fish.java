package products;

public class Fish extends Weightable {

	public Fish(String name, double price, double quantity) {
		super(name, price, quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Fish " + super.toString();
	}

}
