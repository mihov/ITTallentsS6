package shop;

import java.util.ArrayList;

import products.Product;

public class Shop {
	private String name;
	private String address;
	private double money;
	private ArrayList<Product> productsList;

	public Shop(String name, String address, double money) {
		this.setName(name);
		this.setAddress(address);
		this.setMoney(money);
		this.productsList = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	private void setAddress(String address) {
		this.address = address;
	}

	public double getMoney() {
		return money;
	}

	private void setMoney(double money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Shop: " + getName() + "\tAddress: " + getAddress() + "\tMoney" + getMoney() + "lv.";
	}

	public boolean bueProduct(Product product) {
		if (product != null) {
			double total = product.getPrice() * product.getQuantity();
			if (this.getMoney() > total) {
				this.addProduct(product);
				// money
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public Product sellProduct(Product product) {
		int index = productExist(product);

		if (index >= 0) {

		} else {
			return product;
		}
		return product;
	}

	private void addProduct(Product product) {
		int index = productExist(product);

		if (index >= 0) {
			double quantity = productsList.get(index).getQuantity();
			product.addQuantity(quantity);
			this.productsList.set(index, product);

		} else {
			productsList.add(product);
		}
	}

	public int productExist(Product product) {
		if (product != null) {
			return productsList.indexOf(product);
		} else {
			return -1;
		}
	}

}
