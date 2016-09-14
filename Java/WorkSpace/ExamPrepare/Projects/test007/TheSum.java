package test007;

public class TheSum {
	private volatile int sum007;

	public TheSum(int i) {
		this.sum007 = i;
	}

	public int getSum007() {
		return sum007;
	}

	public void setSum007(int sum007) {
		this.sum007 = sum007;
	}

	public void setPlus() {
		if (this.sum007 > 10) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.sum007++;
		notifyAll();
	}

	public void setMihus() {
		if (this.sum007 < 3) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.sum007--;
			notifyAll();
		}
	}
}
