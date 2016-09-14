package src.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ReadingAndWriting {

	public static void main(String[] args) {
		
		File rocky = new File("rocky.txt");
		System.out.println("start");
		try {
			OutputStream os = new FileOutputStream(rocky);
			os.write('H');
			os.write('E');
			os.write('L');
			os.write('L');
			os.write('O');
			os.write('!');
		} catch (FileNotFoundException e) {
			System.out.println("No such file .. damn!");
		} catch (IOException e) {
			System.out.println("An IO error occured .. double damn!");
		}
		System.out.println("end");
	}
}
