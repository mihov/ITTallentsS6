package files;

public class RegexTest {

	public static void main(String[] args) {
		String str = "Преди сто години, в края на 1869 г., бе завършен и напечатан романът-епопея „Война и мир“. ";
//String patternStr = "[^a-zA-Z]+/g";
String patternStr = "сто";
		System.out.println(str.replaceAll("[\\a-zA-z]", " ").trim().replaceAll("  ", " "));
		
	}

}
