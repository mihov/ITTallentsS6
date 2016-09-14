package src.objectStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LoadDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File f = new File("pesho.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person pesho = (Person) ois.readObject();
		System.out.println(pesho.getName());
		System.out.println(pesho.getAge());
		System.out.println(pesho.getGender());
	}
}
