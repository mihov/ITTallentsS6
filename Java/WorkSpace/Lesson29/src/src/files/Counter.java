package src.files;

public class Counter extends Thread {
	private String str;
	private char ch;
	private int counter = 0;

	public Counter(String str, char ch) {
		this.str = str;
		this.ch = ch;
	}

	public int getCount() {
		return this.counter;
	}

	@Override
	public void run() {
		for (int i = 0; i < this.str.length(); i++) {
			if (str.charAt(i) == this.ch) {
				this.counter++;
			}
		}
		
		System.out.println(this.counter);

	}

}
