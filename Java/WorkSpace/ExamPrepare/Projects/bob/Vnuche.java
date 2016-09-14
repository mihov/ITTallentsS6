package bob;

public class Vnuche extends Thread {
	private Garne g;


	public Vnuche(Garne g) {

		this.g = g;
	}

	@Override
	public void run() {
		while (true) {
			this.g.getBob();
			//System.out.println(Thread.currentThread().getName() + ">V>" + g.remainingCapacity());
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
