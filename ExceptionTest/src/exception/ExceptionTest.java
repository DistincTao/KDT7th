package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		double result = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 >>>");
		
		try {
			int num = sc.nextInt();
			result = 3.0 / num;
			System.out.println("입력한 수는 " + num + "입니다.");
			System.out.println("결과는 " + result + "입니다.");
			
			// 모든 예외의 최고 조아이므로 가장 마지막에 사용해야만 함 => 미리 예외를 잡아서 처리함
			// 다른 예외보다 먼저 사용 시 오류 발생 
			// 오류 : Unreachable catch block for InputMismatchException. It is already handled by the catch block for Exception
//		} catch (Exception e) {
//			System.out.println("처리하지 않은 다른 예외가 발생했네;;;");
			
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace(); // 에러의 경로를 추적하여 예외 메시지를 출력해주는 메소드 (빨간 글씨)
			System.out.println("정수를 입력하라니까!!");
			System.out.println("반드시 정수만 입력하셔요~~~");
		} catch (ArithmeticException e) {
			System.out.println((e.getMessage())); // 발생한 예외 클래스의 인스턴스에 저장된 메시지를 반환
			System.out.println("0으로는 못나눈다고!!");

		} catch (Exception e) {
			System.out.println("처리하지 않은 다른 예외가 발생했네;;;");
		} finally { // try 블럭에서 예외가 발생하든 안하든 마지막에 수행될 블럭 (생략 가능
			System.out.println("Finally 제대로좀 하자구!!!");
		}

		System.out.println("모든 작업 끝");
		
	}

}
