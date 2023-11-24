package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionThrowsTest  {

	public static void main(String[] args) throws InputMismatchException, NumberFormatException {
//		getPositiveNumber();
		
//		num = getPositiveNumber();
//		System.out.println("값은 : " + num);
		
		System.out.print("숫자를 입력하세요 >>>>");
		int num = 0;
		try {
			num = getPositiveNumber();
			System.out.println("값은 : " + num);
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("숫자가 아닙니다");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("문자열을 입력하세요");
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		
		try {
			int num2 = Integer.parseInt(str);
			System.out.println("값은 : " + num2);
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("숫자가 아닙니다");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("정수로 바꿀 수 없는 문자열입니다!!");
		}
		
	}

	private static int getPositiveNumber() throws InputMismatchException {
		Scanner sc = new Scanner (System.in);
		int tmp = sc.nextInt();
		
		return tmp;
	}
}
