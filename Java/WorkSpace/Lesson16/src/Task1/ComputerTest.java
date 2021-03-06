package Task1;

public class ComputerTest {

	public static void main(String[] args) {
		// Set PC1 - Laptop
		Computer pc1 = new Computer(2016, true);
		pc1.setPrice(500);
		pc1.upgradeHDD(1024);
		pc1.changeOperationSystem("Windows 10");
		pc1.useMemory(251);

		// Set PC2 - Desktop
		Computer pc2 = new Computer(2015, 350, false, 600, 600, "MAC OS X");
		pc2.useMemory(700);
		pc2.useMemory(100);
		
		Computer pc3 = new Computer();
		pc3.setPrice(345);
		
		Computer pc4 = new Computer(2017, 234, 2400, 1000);
		
		
		System.out.println(
				"_________________________________________________________________________________________________");
		System.out.println("|\tType\t|\tHDD Size\t|\tFree Memory\t|\tOS\t|\tPrice\t|");
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		System.out.println("|\t" + ((pc1.getIsNotebook()) ? "Laptop" : "Desktop") + "\t|\t" + pc1.getHDDSize()
				+ "GB\t\t|\t" + pc1.getFreeMemory() + "GB\t\t|" + pc1.getOperationSystem() + "\t|\t$" + pc1.getPrice()
				+ "\t|");

		System.out.println("|\t" + ((pc2.getIsNotebook()) ? "Laptop" : "Desktop") + "\t|\t" + pc2.getHDDSize()
				+ "GB\t\t|\t" + pc2.getFreeMemory() + "GB\t\t|" + pc2.getOperationSystem() + "\t|\t$" + pc2.getPrice()
				+ "\t|");
		System.out.println(
				"-------------------------------------------------------------------------------------------------");

		Computer.ComparePriceResults(pc4.comparePrice(pc3));
		Computer.ComparePriceResults(pc3.comparePrice(pc4));
		pc4.setPrice(345);
		Computer.ComparePriceResults(pc3.comparePrice(pc4));
		
		

		
	}

}
