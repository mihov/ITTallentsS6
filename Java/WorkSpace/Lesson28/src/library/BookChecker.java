package library;

public class BookChecker extends Thread {

	private Library biblioteka;
	private String bookName;
	
	
	public BookChecker(Library biblioteka, String bookName) {
		this.biblioteka = biblioteka;
		this.bookName = bookName;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(Book.LENDING_TIME*1000);
		} catch (InterruptedException e) {
			return;
		}
		while(true){
			try {
				biblioteka.increaseTax(bookName);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}
