package Notepad;

import java.util.ArrayList;
import java.util.List;

public class NotepadTest {

	public static void main(String[] args) {

		System.out.println("=== Simple Notepad ===");
		SimpleNotepad ntp1 = new SimpleNotepad(5);
		ntp1.addTextToPage("Hello 1", 0);
		ntp1.setTitleToPage("Chapter 1", 1);
		ntp1.addTextToPage("Hello1", 4);
		ntp1.addTextToPage("Hello 6", 6);
		ntp1.printAllPages();
		System.out.println("\n=== Print pages with digits. ===");
		ntp1.printAllPagesWithDigits();
		System.out.println("\n=== Search for word ===");
		System.out.println(ntp1.searchWord("Hello1"));

		System.out.println("\n=== Secured Notepad ===");
		SecuredNotepad ntps1 = new SecuredNotepad(5, "Password1");
		ntps1.addTextToPage("Hello sec", 3);
		ntps1.printAllPages();

		System.out.println("\n=== Secured Notepad weak pass ===");
		SecuredNotepad ntps2 = new SecuredNotepad(5, "passw");
		ntps2.addTextToPage("Hello sec", 3);
		ntps2.printAllPages();

		System.out.println("\n=== ElectronicSecuredNotepad ===");
		ElectronicSecuredNotepad esn1 = new ElectronicSecuredNotepad(5, "Password1");
		esn1.addTextToPage("hello esn", 1);
		esn1.start();
		esn1.addTextToPage("hello esn", 2);
		esn1.printAllPages();
		esn1.stop();
		esn1.printAllPages();

		System.out.println("\n=== INotepad List ===");
		List<INotepad> noteList = new ArrayList<INotepad>();

		noteList.add(new SimpleNotepad(3));
		noteList.add(new SecuredNotepad(4, "Password1"));
		noteList.add(new SecuredNotepad(5, "pas"));
		noteList.add(new ElectronicSecuredNotepad(6, "Password1"));
		noteList.add(new ElectronicSecuredNotepad(7, "pass"));

		for (INotepad element : noteList) {
			if (element instanceof ElectronicSecuredNotepad) {
				((ElectronicSecuredNotepad) element).start();
			}
			element.addTextToPage("Hello123", 1);
		}

		for (INotepad element : noteList) {
			element.addTextToPage("Hello123", 1);
		}

	}

}
