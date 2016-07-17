package Notepad;

public class SimpleNotepad implements INotepad {

	private Page[] pages;

	public SimpleNotepad(int pagesCount) {
		this.pages = new Page[pagesCount];
		for (int i = 0; i < pages.length; i++) {
			this.pages[i] = new Page();
		}
	}

	@Override
	public void addTextToPage(String text, int page) {
		if (page >= 0 && page < pages.length) {
			this.pages[page].addText(text);
		} else {
			printPageDoNotExist(page);
		}

	}

	@Override
	public void appendTextToPage(String text, int page) {
		if (page >= 0 && page < pages.length) {
			this.pages[page].appendText(text);
		} else {
			printPageDoNotExist(page);
		}
	}

	@Override
	public void deleteTextAtPage(int page) {
		if (page >= 0 && page < pages.length) {
			this.pages[page].deleteText();
		} else {
			printPageDoNotExist(page);
		}
	}

	@Override
	public void printAllPages() {
		int pageNumber = 1;
		for (Page page : this.pages) {
			System.out.println(pageNumber++ + ". " + page);
		}

	}

	public void setTitleToPage(String title, int page) {
		if (page >= 0 && page < pages.length) {
			this.pages[page].setTitle(title);
		} else {
			printPageDoNotExist(page);
		}
	}

	private void printPageDoNotExist(int page) {
		System.out.println("Page " + page + " do not exist.");
	}

	@Override
	public boolean searchWord(String word) {
		for (Page page : this.pages) {
			if (page.searchWord(word))
				return true;
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		for (Page page :this.pages) {
			if(page.containsDigits()){
				System.out.println(page);
			}
		}

	}

}
