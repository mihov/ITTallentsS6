package products;

public class Book extends Countable {

	public Book(String name, double price, int quantity) {
		super(name, price, quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book " + super.toString();
	}

}
