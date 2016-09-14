package src.files;

import java.io.File;
import java.io.IOException;

public class Task1 {

	public static void main(String[] args) {
		
		File folder = new File("Krasi");
		folder.mkdir();
		String s = File.separator;
		String path = new String("Krasi/file1.txt");
		path = path.replace("/", File.separator);
		File file1 = new File(path);
		try {
			file1.createNewFile();
		} catch (IOException e) {
			System.out.println("Error creating the file");
		}
		for(File f : folder.listFiles()){
			System.out.println(f.getAbsolutePath());
		}
		System.out.println("Separator = " + File.separator);
	}
}
