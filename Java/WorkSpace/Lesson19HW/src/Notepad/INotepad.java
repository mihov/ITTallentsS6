package Notepad;

public interface INotepad {
	public void addTextToPage(String text, int page);
		public void appendTextToPage(String text, int page);
	public void deleteTextAtPage(int page);
	public void printAllPages();
	public boolean searchWord(String word);
	public void printAllPagesWithDigits();
}
