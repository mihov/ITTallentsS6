package main;

public class PrintQuee extends Thread {

	private WorkFlow wf;

	public PrintQuee(WorkFlow wf) {
		this.wf = wf;
	}

	@Override
	public void run() {
		while(true)
			try {
				Thread.sleep(1000);
				System.out.println(wf.getElementsCount());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
