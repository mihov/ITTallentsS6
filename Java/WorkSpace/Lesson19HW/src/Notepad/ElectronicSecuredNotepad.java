package Notepad;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IÅlectronicDevice {
	private boolean isStartedState;

	public ElectronicSecuredNotepad(int pagesCount, String password) {
		super(pagesCount, password);
		this.isStartedState = false;
	}

	@Override
	public void start() {
		this.isStartedState = true;
		System.out.println("ESN Started.");
	}

	@Override
	public void stop() {
		this.isStartedState = false;
		System.out.println("ESN Stopped.");
	}

	@Override
	public boolean searchWord(String word) {
		if (this.isStartedState)
			return super.searchWord(word);
		else
			return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		if (this.isStartedState)
			super.printAllPagesWithDigits();
	}

	@Override
	public boolean isStarted() {

		return this.isStartedState;
	}

	@Override
	public void addTextToPage(String text, int page) {
		if (this.isStartedState)
			super.addTextToPage(text, page);
	}

	@Override
	public void appendTextToPage(String text, int page) {
		if (this.isStartedState)
			super.appendTextToPage(text, page);
	}

	@Override
	public void deleteTextAtPage(int page) {
		if (this.isStartedState)
			super.deleteTextAtPage(page);
	}

	@Override
	public void printAllPages() {
		if (this.isStartedState)
			super.printAllPages();
	}

	@Override
	public void setTitleToPage(String title, int page) {
		if (this.isStartedState)
			super.setTitleToPage(title, page);
	}

}
