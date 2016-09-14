package src.objectStreams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveDemo {

	public static void main(String[] args) throws IOException {
		
		File f = new File("pesho.txt");
		f.createNewFile();
		Person pesho = new Person("Petur Ivanov", 33, "Male");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(pesho);
	}
}
