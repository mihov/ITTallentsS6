package Notepad;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {
	private String password;
	private boolean secured;
	private Scanner sc;

	public SecuredNotepad(int pagesCount, String password) {
		super(pagesCount);
		this.sc = new Scanner(System.in);
		this.setPassword(password);
	}

	@Override
	public void addTextToPage(String text, int page) {
		if (checkPassword())
			super.addTextToPage(text, page);
		else
			System.out.println("Wrong password!");
	}

	@Override
	public void appendTextToPage(String text, int page) {
		if (checkPassword())
			super.appendTextToPage(text, page);
		else
			System.out.println("Wrong password!");
	}

	@Override
	public void deleteTextAtPage(int page) {
		if (checkPassword())
			super.deleteTextAtPage(page);
		else
			System.out.println("Wrong password!");
	}

	@Override
	public void printAllPages() {
		if (checkPassword())
			super.printAllPages();
		else
			System.out.println("Wrong password!");
	}

	@Override
	public boolean searchWord(String word) {
		if (checkPassword())
			return super.searchWord(word);
		else
			System.out.println("Wrong password!");
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		if (checkPassword())
			super.printAllPagesWithDigits();
		else
			System.out.println("Wrong password!");
	}

	@Override
	public void setTitleToPage(String title, int page) {
		if (checkPassword())
			super.setTitleToPage(title, page);
		else
			System.out.println("Wrong password!");
	}

	private void setPassword(String newPassword) {
		this.password = newPassword;
		this.secured = this.checkPasswordComplexity();
	}

	private boolean checkPassword() {
		if (this.secured) {
			System.out.print("Password:");
			return this.password.equals(this.sc.nextLine());
		} else {
			return true;
		}
	}

	private boolean checkPasswordComplexity() {
		return this.password.length() > 5 && this.password.matches(".*[0-9].*") && this.password.matches(".*[a-z].*+")
				&& this.password.matches(".*[A-Z].*");
	}

}
