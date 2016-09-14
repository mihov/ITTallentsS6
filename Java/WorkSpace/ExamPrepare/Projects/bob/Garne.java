package bob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Garne {
	private BlockingQueue<Bob> garneto;
	private static Garne instance = new Garne();
	private Object oGet = new Object();
	private Object oSet = new Object();

	private Garne() {
		this.garneto = new ArrayBlockingQueue<Bob>(100);
	}

	public static Garne getInstance() {
		return instance;
	}

	public Bob getBob() {
		synchronized (oGet) {
			try {

				return this.garneto.take();
			} catch (InterruptedException e) {
				System.out.println("getBob - ooops");
				e.printStackTrace();
			}
			return null;
		}
	}

	public void setBob(Bob bob) {
		synchronized (oSet) {
			try {
				this.garneto.put(bob);
			} catch (InterruptedException e) {
				System.out.println("setBob - ooops");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public int remainingCapacity() {
		return this.garneto.remainingCapacity();
	}

	public int size() {
		return this.garneto.size();
	}

}
