package files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScannerDemo {

	public static void main(String[] args) throws IOException {
		File f1 = new File("test001.txt");
		// f1.createNewFile();
		// if (f1.exists()) {
		// System.out.println(f1.getName() + "Created.");
		// } else {
		// System.out.println(f1.getName() + " has not Created.");
		// }

		Scanner sc = new Scanner(f1);
		Pattern pattern = Pattern.compile("[^a-zA-Z]+/g");
		//Matcher matcher2 = null;
		// Pattern replace = Pattern.compile("\\s+");
		//matcher2 = pattern.matcher(EXAMPLE_TEST);
		//System.out.println(matcher2.replaceAll("\t"));
		
		
		

		while (sc.hasNextLine()) {
			System.out.println(pattern.matcher(sc.nextLine()).replaceAll("").trim());

		}

	}

}
