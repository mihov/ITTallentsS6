package bob;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
Thread t1 = new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.err.println(Garne.getInstance().remainingCapacity());
				System.err.println("T: " + Thread.activeCount());
			}
		});
		t1.setDaemon(true);
		t1.start();
		
		
		for (int i = 0; i < 100; i++) {
			Thread.sleep(500);
			new Baba(Garne.getInstance()).start();

			new Vnuche(Garne.getInstance()).start();
			System.err.println("T: " + Thread.activeCount());
		}

		

	}
}
