package files;

public class RegexTest {

	public static void main(String[] args) {
		String str = "����� ��� ������, � ���� �� 1869 �., �� �������� � ��������� �������-������ ������ � ���. ";
//String patternStr = "[^a-zA-Z]+/g";
String patternStr = "���";
		System.out.println(str.replaceAll("[\\a-zA-z]", " ").trim().replaceAll("  ", " "));
		
	}

}
