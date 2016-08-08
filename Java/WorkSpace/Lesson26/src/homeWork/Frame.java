package homeWork;

public class Frame extends Thread {
	private int creationTime;

	public Frame(int creationTime) {
		this.creationTime = creationTime;
	}

	@Override
	public void run() {
		System.out.println("The frame is ready to be built.");
		try {
			Thread.sleep(this.creationTime);
		} catch (InterruptedException e) {
			System.out.println("Frame was interupted.");
			return;
		}
		System.out.println("Frame ready.");
	}

}
