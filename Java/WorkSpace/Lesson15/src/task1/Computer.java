package task1;
public class Computer {
	private int year;
	private float price;
	private boolean isNotebook;
	private int hardDiskMemory;
	private int freeMemory;
	private String operationSystem;

	public Computer(int vYear, float vPrice, boolean vIsNotebook, int vHardDisk, String vOS) {
		this.year = vYear;
		this.price = vPrice;
		this.isNotebook = vIsNotebook;
		this.hardDiskMemory = vHardDisk;
		this.freeMemory = this.hardDiskMemory;
		this.operationSystem = vOS;
	}

	public Computer(int vYear, boolean vIsNotebook) {
		this.year = vYear;
		this.isNotebook = vIsNotebook;
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

	public float getPrice() {
		return this.price;
	}

	public void useMemory(int memory) {
		if (memory > this.freeMemory) {
			System.out.println("Not enough free memory!");
		} else {
			this.freeMemory -= memory;
		}
	}

	public int getFreeMemory() {
		return this.freeMemory;
	}

	public int getHDDSize() {
		return this.hardDiskMemory;
	}

	public void upgradeHDD(int newHDDSize) {
		if (newHDDSize < this.hardDiskMemory) {
			System.out.println("Are you creasy?");
		} else {

			this.freeMemory = newHDDSize - (this.hardDiskMemory - this.freeMemory);
			this.hardDiskMemory = newHDDSize;
		}
	}

}
