package src.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFile {

	public static void main(String[] args) throws IOException {
		
		File file = new File("grumpy.jpeg");
		File file2 = new File("rocky.txt");
		FileInputStream fis = new FileInputStream(file);
		FileInputStream fis2 = new FileInputStream(file2);
		int bukva = fis.read();
		int bukva2 = fis2.read();
		while(bukva != -1 || bukva2 != -1){
			if(bukva != bukva2){
				System.out.println("Not equal ");
				return;
			}
			bukva = fis.read();			
			bukva2 = fis2.read();
		}
		fis.close();
		fis2.close();
		System.out.println("Equal");
	}
}
