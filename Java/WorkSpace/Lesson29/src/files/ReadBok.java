package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadBok {

	private static Scanner scFile;

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("vm.txt");
System.out.println("test");
		try (FileInputStream fis = new FileInputStream(file)) {
			scFile = new Scanner(fis);
			if (scFile != null) {
				while (scFile.hasNext()) {
					String string = (String) scFile.next();
					System.out.println(string);
				}
			}
		} catch (IOException e1) {
			System.err.println("File do not exist!");
			e1.printStackTrace();
		}

	}

}
