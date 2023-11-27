package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HandleCloseWithTry {
	// jdk 1.8 버전부터 가능한 방법
	// AutoClosable 인터페이스를 구현한 클래스에 한해서만 가능한 방법
	public static void main(String[] args) {
		try (FileReader fr = new FileReader("D:\\Lectures\\java\\ExceptionTest5\\src\\exception\\score.dat");
				BufferedReader br = new BufferedReader (fr)) {
			while (true) {
				String readLine = br.readLine();
				if (readLine == null) break;
				System.out.println(readLine);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
}
