package merchants;

import java.util.Random;

import suppliers.SmallSupplier;
import tradingObj.IETShop;
import tradingObj.TradingObject;

public class ET extends Merchant {

	private SmallSupplier[] suppliers;
	private IETShop shop;
	
	public ET(double capital, String name){
		super(capital, name);
		suppliers = new SmallSupplier[5];
		for (int i = 0; i < suppliers.length; i++) {
			suppliers[i] = new SmallSupplier();
		}
	}

	public void setTradingObject(IETShop tradingObject) {
		this.shop = tradingObject;
	}

	@Override
	public void startTrading() throws NotEnoughMoneyException {
		TradingObject shop = (TradingObject)this.shop;
		//������� �� ����� �� ��������� �� ����� ��������� ����� 
		makeOrder(capital/3, suppliers[new Random().nextInt(suppliers.length)], shop);
		//��������� �� ������ �� ����� ��������� �����
		cacheOut(shop);
		//������� �� ������� ����� ��� ��������� �� ����� ��������� �����.
		payTaxes(shop);
	}

	@Override
	public int getSoldProducts() {
		return ((TradingObject) shop).getSoldProducts();
	}
	
	@Override
	public int getTaxesPaid() {
		return ((TradingObject) shop).getTax();
	}
}
