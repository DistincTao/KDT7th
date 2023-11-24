package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		int num = 0;
		
		while (true){
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("양수를 입력하세요 >>");
				num = sc.nextInt();
				
				if (num  > 0) {
					System.out.print("입력한 숫자 : " + num);
					break;
				} else {
					// 사용자 저으이 예외 발생
					throw new NotPositiveInteger("양수가 아닙니다.");
				}
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.print("숫자 => 양수를 입력하시라니까요 !!!");
			} catch (NotPositiveInteger e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println("입력한 숫자 " + num + "은 양수가 아닙니다");
				System.out.println(e.getMessage());
			}
		}
		
	}
}
