package test007;

public class Demo {

	public static void main(String[] args) {
		TheSum sss = new TheSum(10);
		

		
		Thread tr = new Thread(()-> {
			while (true) {
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(sss.getSum007());
			}
		});
		tr.setDaemon(true);
		tr.start();
		
		new Thread(new ClassA(sss)).start();
		new Thread(new ClassA(sss)).start();
		new Thread(new ClassB(sss)).start();
		

	}

}
