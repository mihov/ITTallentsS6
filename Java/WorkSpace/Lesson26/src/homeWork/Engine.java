package homeWork;

public class Engine extends Thread {
	private int creationTime;

	public Engine(int creationTime) {
		this.creationTime = creationTime;

	}

	@Override
	public void run() {
		System.out.println("The engine is ready to be built.");
		try {
			Thread.sleep(this.creationTime);
		} catch (InterruptedException e) {
			System.out.println("Engine was interupted.");
			return;
		}
		System.out.println("Engine ready.");
	}

}
