package shop;

import products.Product;

public class Buyer implements IBuyer{
	private Shop shop;
	private double money;
	private int maxCount;
	
	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeProduct(Product product) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public int getMaxCount() {
		return maxCount;
	}
	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}
	
	

}
