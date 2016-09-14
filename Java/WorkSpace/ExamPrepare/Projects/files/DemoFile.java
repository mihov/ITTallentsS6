package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


public class DemoFile {

	public static void main(String[] args) {
		File file  = new File("test.txt");
//		try {
//			file.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(sc.hasNextLine()){
			System.out.printf(sc.nextLine());
			System.out.println();
			//System.out.println(sc.next());
		}
		
		
		PrintStream ps = new PrintStream("test1.txt", "UTF-8");

	}
	
	

}
