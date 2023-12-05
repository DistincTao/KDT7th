package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class BufferedInputOutputTest {

	public static void main(String[] args) {
		
		String filePath = "D:\\Lectures\\java\\ioex.txt";
		String copyPath = "D:\\Lectures\\java\\ioex_Copy2.txt";

		InputStreamReader inStr = null;
		OutputStream outStr = null;
		
		try {
			FileInputStream inFile = new FileInputStream(filePath);
			inStr = new InputStreamReader(inFile, "UTF-8");
			outStr = new FileOutputStream(copyPath);
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		BufferedReader br = new BufferedReader(inStr);
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new OutputStreamWriter(outStr, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		int data = 0;
		
		try {
			while ((data = br.read()) != -1) {
				System.out.println((char)data);
				bw.write(data);
			}	
				
				bw.flush(); // 버퍼에 잔류하는 모든 문자를 출력 (버퍼 비우기)
				
				br.close(); 
				bw.close(); // 출력 스트림을 닫고 메모리르 해제

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
