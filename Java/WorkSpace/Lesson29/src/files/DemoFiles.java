package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFiles {
	public static void main(String[] args) throws IOException {
		String fileName = "vm1.txt";
		File f1 = new File(fileName);
	
		if (f1.exists()) {
			FileInputStream fis = new FileInputStream(f1);
			int ch = fis.read();
			System.out.println((char) ch);
			while (ch > -1) {
				ch = fis.read();
				System.out.println((char) ch);
			}
			
			fis.close();

		} else {
			System.err.println("File " + f1.getName() + " do not exist");
			FileOutputStream fos =new FileOutputStream(f1);
			fos.write('H');
			fos.write('E');
			fos.write('L');
			fos.write('I');
			fos.write('O');
			fos.close();
		}

	}

}
