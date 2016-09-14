package src.files;

import java.io.File;
import java.io.IOException;

public class CreatingFiles {

	public static void main(String[] args) {
		
		System.out.println("start");
		File rocky = new File("Videos/rocky.txt");
		File videos = new File("Videos");
		if(!rocky.exists()){
			try {
				rocky.createNewFile();
				System.out.println("Creating file");
			} catch (IOException e) {
				System.out.println("Error creating the dir:" + e.getMessage());
			}
		}
		if(!videos.exists()){
			videos.mkdir();
		}
		File gusi = new File("Videos/gusi.txt");
		File gusi2 = new File("gusi.txt");
		try {
			gusi.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
		for(File f : videos.listFiles()){
			System.out.println(f.getName());
		}
		
	}
}
