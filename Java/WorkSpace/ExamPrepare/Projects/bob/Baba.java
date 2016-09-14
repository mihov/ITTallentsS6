package bob;

public class Baba extends Thread {
	private Garne g;


	public Baba(Garne g) {
		this.g = g;

	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			this.g.setBob(new Bob());
			//System.err.println(Thread.currentThread().getName() + ">B>" + g.remainingCapacity());
		}
	}

}
