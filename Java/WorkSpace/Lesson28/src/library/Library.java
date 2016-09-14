package library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class Library {

	private static final double INTEREST = 17;//percent
	
	private String name;
	private ArrayList<Book> books;
	private ConcurrentHashMap<String, Double> taxes;//book name -> book tax
	private ConcurrentHashMap<String, Thread> takenBooks;//book name -> book checker
	
	public Library(String name) {
		this.name = name;
		this.books = new ArrayList<>();
		this.taxes = new ConcurrentHashMap<>();
		this.takenBooks = new ConcurrentHashMap<>();
		books.add(new Book("Pyramids"));
		books.add(new Book("Golden book of talent"));
		books.add(new Book("I love New York"));
		books.add(new Book("Strange seasons"));
		books.add(new Book("Harry Potter"));
		for(Book b : books){
			taxes.put(b.getName(), Book.TAX);
		}
	}

	public synchronized Book giveBook() {
		Book book = books.get( new Random().nextInt(books.size()) );
		BookChecker checker = new BookChecker(this, book.getName());
		checker.start();
		books.remove(book);
		takenBooks.put(book.getName(), checker);
		return book;
	}

	public void receiveBook(Book takenBook) {
		books.add(takenBook);
		Thread checker = takenBooks.get(takenBook.getName());
		checker.interrupt();
		System.out.println("You owe us " + taxes.get(takenBook.getName()));
		taxes.put(takenBook.getName(), Book.TAX);
	}

	public void increaseTax(String bookName) {
		double tax = taxes.get(bookName);
		tax = tax + (tax/100)*INTEREST;
		taxes.put(bookName, tax);
	}
	
	
}
