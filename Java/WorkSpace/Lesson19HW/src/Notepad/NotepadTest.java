package Notepad;

public class NotepadTest {

	public static void main(String[] args) {
		SimpleNotepad ntp1 = new SimpleNotepad(5);
		ntp1.addTextToPage("Hello 1", 0);
		ntp1.setTitleToPage("Chapter 1", 1);
		ntp1.addTextToPage("Hello1", 4);
		ntp1.addTextToPage("Hello 6", 6);
		ntp1.printAllPages();
		System.out.println("Print pages with digits.");
		ntp1.printAllPagesWithDigits();
		System.out.println("Search for word:");
	System.out.println(	ntp1.searchWord("Hello1"));
		
		SecuredNotepad ntps1 = new SecuredNotepad(5, "Aass4yyyy");
		ntps1.addTextToPage("Hello sec", 3);
		ntps1.printAllPages();

	}

}
