package shop;

import products.Product;

public interface IBuyer {
	void addProduct(Product product);
	void removeProduct(Product product);
	void pay();
}