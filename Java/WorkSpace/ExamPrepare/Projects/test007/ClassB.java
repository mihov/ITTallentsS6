package test007;

public class ClassB implements Runnable{
	private TheSum sss;

	public ClassB(TheSum sss) {
		this.sss = sss;
	}

	@Override
	public void run() {
		while (true) {
			
			try {
				
				Thread.sleep(1000);
				this.sss.setMihus();
				System.err.println("B -");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
