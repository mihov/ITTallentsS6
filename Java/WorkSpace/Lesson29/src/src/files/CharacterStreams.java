package src.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CharacterStreams {

	public static void main(String[] args) throws IOException {
		File f = new File("rocky.txt");
		
		FileReader reader = new FileReader(f);
		char[] bukvi = new char[5];
		System.out.println((char)reader.read(bukvi));
		System.out.println(Arrays.toString(bukvi));
		reader.close();
		FileWriter writer = new FileWriter(f, true);
		writer.write("Ko staa pi4ove!");
		writer.close();
	}
}
