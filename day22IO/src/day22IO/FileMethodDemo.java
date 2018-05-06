package day22IO;

import java.io.File;

public class FileMethodDemo {

	public static void main(String[] args) {
		
		File file = new File("Test22.java");
		String absPath = file.getAbsolutePath();
		String path = file.getPath();
		String filename = file.getName();
		long size = file.length();
		
		System.out.println("absPath="+absPath);
		System.out.println("path="+path);
		System.out.println("filename="+filename);
		System.out.println("size="+size);

	}
}
