package Task1;

public class Computer {
	private int year;
	private double price;
	private boolean isNotebook;
	private double hardDiskMemory;
	private double freeMemory;
	private String operationSystem;

	public Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory,
			String operationSystem) {
		this.year = year;
		this.price = price;
		this.isNotebook = isNotebook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;
	}

	public Computer() {
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}

	public Computer(int year, boolean isNotebook) {
		this();
		this.year = year;
		this.isNotebook = isNotebook;
	}

	public Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;

	}

	public void changeOperationSystem(String newOperationSystem) {
		if (newOperationSystem.length() < 1) {
			System.out.println("Warning no OS installed!!!");
		}
		this.operationSystem = newOperationSystem;
	}

	public String getOperationSystem() {
		return this.operationSystem;
	}

	public int getYear() {
		return this.year;
	}

	public boolean getIsNotebook() {
		return this.isNotebook;
	}

	public void setPrice(float newPrice) {
		if (newPrice < 0) {
			System.out.println("Price is negative!!!");
		} else {
			this.price = newPrice;
		}
	}

	public double getPrice() {
		return this.price;
	}

	public void useMemory(int memory) {
		if (memory > this.freeMemory) {
			System.out.println("Not enough free memory!");
		} else {
			this.freeMemory -= memory;
		}
	}

	public double getFreeMemory() {
		return this.freeMemory;
	}

	public double getHDDSize() {
		return this.hardDiskMemory;
	}

	public int comparePrice(Computer c) {

		if (this.price == c.price) {
			return 0;
		}
		return this.price > c.price ? -1 : 1;
	}

	public void upgradeHDD(double newHDDSize) {
		if (newHDDSize < this.hardDiskMemory) {
			System.out.println("Are you creasy?");
		} else {

			this.freeMemory = newHDDSize - (this.hardDiskMemory - this.freeMemory);
			this.hardDiskMemory = newHDDSize;
		}
	}

	public static void ComparePriceResults(int results) {
		switch (results) {
		case 1:
			System.out.println("First PC has lower price to second PC");
			break;
		case -1:
			System.out.println("First PC has bigger  price to second PC");
			break;
		case 0:
			System.out.println("First PC has equal price to second PC");
			break;

		default:
			System.out.println("Error!!!");
			break;
		}
	}

}
