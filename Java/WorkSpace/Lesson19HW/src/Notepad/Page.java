package Notepad;

public class Page {
	private String title;
	private StringBuilder text;

	public Page() {
		this.text = new StringBuilder();
		this.title = "No title";
	}

	public Page(String title) {
		this();
		this.setTitle(title);
	}

	public Page(String title, String text) {
		this(title);
		this.addText(text);
	}

	public void addText(String text) {
		this.text.setLength(0);
		this.text.append(text);
		System.out.println("Text added.");
	}

	public void appendText(String text) {
		this.appendText(text);
		System.out.println("Text appended.");
	}

	public void deleteText() {
		this.text.setLength(0);
		System.out.println("Text deleted.");
	}

	public void setTitle(String title) {
		if (title.length() > 0) {
			this.title = title;
			System.out.println("Title set.");
		} else {
			System.out.println("Pagetitle can not be empty.");
		}
	}

	public boolean searchWord(String word) {
		return this.text.indexOf(word) > 0;
	}
	
	public boolean containsDigits(){
		return this.text.toString().matches(".*[0-9].*");
	}

	@Override
	public String toString() {
		return this.title + "\n" + this.text.toString();
	}
}
