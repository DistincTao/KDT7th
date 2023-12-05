package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_FileTest {
	
	public static void main(String[] args) {
		String filePath = "D:\\Lectures\\java\\ioex.txt";
		String copyFile = "D:\\Lectures\\java\\ioex_Copy.txt";
		
		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		
		try {
			inFile = new FileInputStream(filePath);
			outFile = new FileOutputStream(copyFile);
			
			int data = 0;
			while((data = inFile.read()) != -1) {
				System.out.println((char)data);
				outFile.write(data);
			}
			
			inFile.close();
			outFile.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
