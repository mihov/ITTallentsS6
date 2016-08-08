package homeWork;

public class Seat extends Thread {
	static int count = 1;
	private String name;
	private int creationTime;

	public Seat(int creationTime) {
		this.name = "Seat " + count++;
		this.creationTime = creationTime;
	}

	@Override
	public void run() {
		System.out.println("The " + this.name + " is ready to be built.");
		try {
			Thread.sleep(this.creationTime);
		} catch (InterruptedException e) {
			System.out.println(this.name + " was interupted.");
			return;
		}
		System.out.println(this.name + " ready.");
	}

}
