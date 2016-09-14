package library;

public class Reader extends Thread{

	private Book takenBook;
	private static Library biblioteka = new Library("Haskovo Zatvora");
	private int readingTime;//in seconds

	public Reader(String name, int readingTime) {
		setName(name);
		this.readingTime = readingTime;
	}
	
	@Override
	public void run() {
		this.takeBook();
		try {
			Thread.sleep(readingTime*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.returnBook();
	}

	public void takeBook() {
		Book book = biblioteka.giveBook();
		System.out.println(getName() + " takes " + book.getName());
		this.takenBook = book;
	}

	public void returnBook() {
		System.out.println(getName() + " returns " + takenBook.getName());
		biblioteka.receiveBook(takenBook);
		takenBook = null;
	}
}
