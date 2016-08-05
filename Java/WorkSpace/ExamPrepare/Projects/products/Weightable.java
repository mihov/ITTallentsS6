package products;

public abstract class Weightable extends Product {

	public Weightable(String name, double price, double quantity) {
		super(name, price, quantity);
		
	}

	@Override
	public String toString() {
		return super.toString() + "kg.";
	}
	
	

}
