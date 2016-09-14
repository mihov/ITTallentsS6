package singleton;

public class Demo {
	public static void main(String[] args) {
		// TheSystem s1 = TheSystem.getInstance();
		// TheSystem s2 = TheSystem.getInstance();
		// TheSystem s3 = TheSystem.getInstance();
		// TheSystem s4 = TheSystem.getInstance();
		//
		// System.out.println(s1);
		// System.out.println(s2);
		// System.out.println(s3);
		// System.out.println(s4);

		new Thread(() -> {
			while (true) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(2 * 1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		new Thread(() -> {
			while (true) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(3 * 1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();		new Thread(() -> {
			while (true) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(5 * 1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();

	}
}
