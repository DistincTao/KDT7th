package cardDealer;

public class Card {
	private static int card_cnt = 0;
	String shape;
	String num;
	
	private static Card[] cards = new Card[52];
	
	public Card(String shape, String num) {
		this.shape = shape;
		this.num = num;
	}
	
	public static Card[] newCards() {
		Card newCards = null;
		String[] shapes = {"heart", "spade", "clover", "diamond"};
		String [] nums = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q" ,"K"};
			for (int i = 0; i < shapes.length; i++) {
				String newShape = shapes[i];
				for (int j = 0; j < nums.length; j++) {
					String newNum = nums[j];
					newCards = new Card(newShape, newNum);
					cards[card_cnt] = newCards;
					card_cnt++;
				}
			}
		return cards;
	}

	public static void cardOutput(Card[] newCards) {
		for (int i = 0; i < 52 ; i++) {
			System.out.println("카드 순서 " + (i + 1) + "번째 : " + newCards[i].getShape() + ", " + newCards[i].getNum());			
		}
	}

	public String getShape() {
		return this.shape;
	}

	public String getNum() {
		return this.num;
	}

//	public static Card[] getCards() {
//		return cards;
//	}


}

