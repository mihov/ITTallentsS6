package Threads;

public class ProducerConsumerTest {
	public static void main(String[] args) {
		CubbyHole c = new CubbyHole();

		
		
		 new Producer(c, 1).start();
		new Consumer(c, 1).start();
		
		 new Producer(c, 1).start();
		new Consumer(c, 1).start();		 new Producer(c, 1).start();
		new Consumer(c, 1).start();

	}
}

class CubbyHole {
	private int contents;
	private boolean available = false;

	public synchronized int get() {
		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		available = false;
		notifyAll();
		return contents;
	}

	public synchronized void put(int value) {
		while (available == true) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		contents = value;
		available = true;
		notifyAll();
	}
}

class Consumer extends Thread {
	private CubbyHole cubbyhole;
	private int number;

	public Consumer(CubbyHole c, int number) {
		cubbyhole = c;
		this.number = number;
	}

	public void run() {
		int value = 0;
		while (true) {
			value = cubbyhole.get();
			try {
				Thread.sleep(2*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Consumer #" + this.number + " got: " + value);
		}
	}
}

class Producer extends Thread {
	private CubbyHole cubbyhole;
	private int number;

	public Producer(CubbyHole c, int number) {
		cubbyhole = c;
		this.number = number;
	}

	public void run() {
		while (true) {
			cubbyhole.put(1);
			System.out.println("Producer #" + this.number + " put: " + 1);
			try {
				sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
			}
		}
	}
}