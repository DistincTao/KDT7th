package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class IO_ByteTest {

	public static void main(String[] args) {
		byte [] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // 원본 (데이터의 출발지)
		byte [] outSrc = null; // 목적지
		
		// outSrc = inSrc; // 배열 복사의 개념이 아닌 스트림 객체를 통해 전송하는데 의미를 두고 보기!
		
		// 입출력 Stream 객체 생성
		InputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		int data = 0;
		
		try {
			while((data = input.read()) != -1) { // input 객체를 통해 읽은 값이 -1 (EOF - End Of File) 이 아닌 동안에 읽음
				output.write(data);
				System.out.println(output);
				System.out.println(data);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		outSrc = output.toByteArray(); // output에 있는 데이터를 byte[]로 변환
		
		System.out.println(Arrays.toString(outSrc));

		try {
			input.close(); // 입출력 스트림 객체는 입출력이 완료되면 close 해줘야 한다.
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
