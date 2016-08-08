package utils;

public abstract class NameAndMoneyBaseClass implements Comparable<NameAndMoneyBaseClass>{
	private String name;
	private Double money;

	public NameAndMoneyBaseClass(String name, Double money) {
		this.setName(name);
		this.setMoney(money);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		if (name.length() > 0) {
			this.name = name;
		}
	}

	private void setMoney(Double money) {
		if (money >= 0) {
			this.money = money;
		}

	}

	public Double getMoney() {
		return money;
	}

	@Override
	public String toString() {
		return String.format("%s - $%s", name, money);
	}
	
	@Override
	public int compareTo(NameAndMoneyBaseClass o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}

}
