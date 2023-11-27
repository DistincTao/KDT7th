package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HandleCloseEx {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			// 1) 파일을 읽기 위한 객체 생성 - 파일에 스트림 연결
			br = new BufferedReader(new FileReader("D:\\Lectures\\java\\ExceptionTest5\\src\\exception\\score.dat"));

			// 2) File 읽기
			while (true) {
				String readLine = br.readLine();
				if (readLine == null)
					break;
				System.out.println(readLine);
			}

		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("file을 찾을 수 없습니다.");
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("IO 예외가 발생했습니다.");
		}

		// 3) 파일 스트림 닫기
		try {
			if (br != null)
				br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
