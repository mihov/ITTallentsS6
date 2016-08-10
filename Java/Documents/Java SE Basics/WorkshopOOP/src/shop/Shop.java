package shop;

import products.Product;

public class Shop {

	private String name;
	private String address;
	private double money;
	private Product[] products;
	private int freePlaces;
	
	public Shop(String name, String address, double money, int maxProducts) {
		this.name = name;
		this.address = address;
		this.money = money;
		this.products = new Product[maxProducts];
		freePlaces = 0;
	}

	public void addProduct(Product p) throws ShopFullException{
		int index = existsProduct(p);
		if(index != -1){
			//get it and increase its quantity
			Product productInShop = products[index];
			productInShop.addQuantity(p.getQuantity());
		}
		else{
			if(freePlaces>= products.length){
				throw new ShopFullException();
			}
			products[freePlaces++] = p;
		}
	}
	
	/**
	 * searches for a product in the array
	 * @param x - the product to be found
	 * @return -1 if not found, or the index of the product if found
	 */
	public int existsProduct(Product x){
		for (int i = 0; i < products.length; i++) {
			if(products[i] != null && products[i].getName().equals(x.getName())){
				return i;
			}
		}
		return -1;
	}
	
	public void pay(double money){
		if(money > 0){
			this.money+=money;
		}
	}

	public void showProducts() {
		System.out.println("========= SHOP INFO =========");
		System.out.println("Total cash = " + this.money);
		for (int i = 0; i < products.length; i++) {
			if(products[i] != null){
				System.out.print(products[i].getName() +   " - " + products[i].getQuantity() + "\n");
			}
		}
	}

	public Product getProduct(int index) {
		return products[index];
	}
}
