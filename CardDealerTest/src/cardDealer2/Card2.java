package cardDealer2;

public class Card2 {
	// kind : 하트, 스페이드, 클로버, 다이아몬드
	// number : A(1) ~ 10, J(11), Q(12), K(13)
	private int kind;
	private int number;
	
//	private static int width = 100;
//	private static int height = 200;
	
	private final static int HEART = 1; // 상수
	private final static int SPADE = 2;
	private final static int CLOVER = 3;
	private final static int DIAMOND = 4;
	
	static final int KIND_MAX = 4; // default 접근 제어자 (같은 패키지 안에서 접근 가능)
	static final int NUMBER_MAX = 13;
	
	// 생성자
	public Card2() {}
	// 생성자 오버로딩
	public Card2(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String kind = "";
		String number = "";
		
		switch (this.number) {
		case 1:
			number = "A";
			break;
		case 11:
			number = "J";
			break;
		case 12:
			number = "Q";
			break;
		case 13:
			number = "K";
			break;
		default :
			number = this.number + "";
			break;
		}
		
		switch (this.kind) {
		case HEART :
			kind = "♡";
			break;
		case SPADE :
			kind = "♠";
			break;
		case CLOVER :
			kind = "♣";
			break;
		case DIAMOND :
			kind = "◇";
			break;
		}
		return kind + number;
	}
	
	
}
