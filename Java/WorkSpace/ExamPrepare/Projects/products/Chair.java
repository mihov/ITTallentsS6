package products;

public class Chair extends Countable {

	public Chair(String name, double price, int quantity) {
		super(name, price, quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Chair " + super.toString();
	}
	
	

}
