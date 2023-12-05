package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class FileSaveTest {

	public static void main(String[] args) {
		String copyPath = "D:\\Lectures\\java\\file_log_Test.txt";

		OutputStream os = null; // 블럭 밖에서 사용 가능하도록 빈 객체를 생성 후 생성 진행
		
		try {
			os = new FileOutputStream(copyPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		String txt = "우리집에 왜 왔니??";
		
		try {
			bw.write(txt + "\r\nI told you....I'll go over your house."); // \r\n 줄바꾸고 새로운 줄로 이동(window)
			
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
