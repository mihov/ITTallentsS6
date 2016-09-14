package src.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerAndPrinter {

	public static void main(String[] args) {

		File f = new File("vm.txt");
		long start = System.currentTimeMillis();
		Scanner sc = null;
		
		try {
			sc = new Scanner(f);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		int symbols = 0;
		int bukvi = 0;
		int commas = 0;
		
		StringBuilder sb  = new StringBuilder();
	
		
	
		String str = null;
		while (sc.hasNextLine()) {
			
			
			String row = sc.nextLine();
			sb.append(row);
			//sb.append("\n");
			
			for (char c : row.toCharArray()) {
//				if (Character.isLetter(c)) {
//					bukvi++;
//				}
				if (c == ',') {
					commas++;
				}
			}
			symbols += row.length();
		}
		
		str =  sb.toString();
		
		DevideWork.devideAndStart(str, 3, ',');
		
		// System.err.println(sb.toString());
//		
//		
//		System.out.println("Symbols = " + symbols);
//		System.out.println("Letters = " + bukvi);
		System.out.println("Commas = " + commas);
		long end = System.currentTimeMillis();
		System.out.println("duration = " + (end - start) + " milliseconds ");

		// PrintStream ps = new PrintStream(f);
		// ps.println("Zdrasti rocky!");
		// ps.print("Kak e havata?");
		// ps.print("Jiv li si?");
		// ps.println();
		// ps.println("Aide da pishem domashni!");
	}
}
