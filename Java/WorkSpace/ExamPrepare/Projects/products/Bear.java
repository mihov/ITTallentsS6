package products;

public class Bear extends Countable {

	public Bear(String name, double price, int quantity) {
		super(name, price, quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bear " + super.toString();
	}
	
	

}
