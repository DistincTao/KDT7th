package CardTestEx1;

import java.util.Scanner;

public class CardTest {

	public static void main(String[] args) {
		//class 변수는 클래스명.변수명 => 객체 생성 없이 호출 가능
		System.out.println("카드의 가로는 " + Card.width + ", 세로는 " + Card.height);
		Card card1 = new Card();
		card1.kind = "Heart";
		card1.number = 7;
		System.out.println("card1 : 무늬는 : " + card1.kind + ", 숫자는 : " + card1.number);
		
		Card card2 = new Card();
		card2.kind = "Diamond";
		card2.number = 4;
		System.out.println("card2 : 무늬는 : " + card2.kind + ", 숫자는 : " + card2.number);
		
//		System.out.println("카드의 가로는 " + card1.width + ", 세로는 " + card1.height);

		// 메소드
		// static method -> 언제든 불러다 쓸 수 있음
		System.out.println(Math.abs(-3));
		
		// non-static method
		Scanner sc = new Scanner(System.in);
		System.out.println("num >>>>");
		int num = sc.nextInt();
		
//		sc.close(); // => 닫아주거나 초기화 해줘야함
//		sc = null; // => error 발생
		
		System.out.println("num >>>>");
		int num1 = sc.nextInt();
		
	}

}

class Card {
	String kind;  // 카드 무늬 (인스턴스 변수)
	int number;  // 카드 숫자 (인스턴스 변수)
	static int width = 100; // (클래스 변수)
 	static int height = 200; // (클래스 변수)
	
}
