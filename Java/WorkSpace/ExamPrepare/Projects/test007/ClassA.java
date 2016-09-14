package test007;

public class ClassA implements Runnable{
	private TheSum sss;

	public ClassA(TheSum sss) {
		this.sss = sss;
	}

	@Override
	public void run() {
		while (true) {
			
			try {
				sss.setPlus();
				System.err.println("A +");
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
