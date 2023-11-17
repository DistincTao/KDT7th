package cardDealer2;

import java.util.Arrays;

public class Dealer2 {
	public final static int CARD_NUM = 52;
	private Card2[] cardDeck = new Card2[CARD_NUM];
	public static int currCardCnt = 0; // 현재 가기고 있는 카드수
	
	// 생성자
	public Dealer2() {
		currCardCnt = CARD_NUM;
		int cnt = 0;
		for (int cardKind = 1; cardKind < Card2.KIND_MAX + 1; cardKind++) {
			for (int cardNum = 1; cardNum < Card2.NUMBER_MAX + 1; cardNum++) {
				this.cardDeck[cnt++] = new Card2(cardKind, cardNum);
			}
		}
	}
	
	/**
	 * @Method Name : shuffle
	 * 작성일 : 2023. 11. 17.
	 * 작성자 : goott5
	 * @param
	 * 반환값 : void
	 * @Description
	 */
	public void shuffle() {
		for (int i = 0; i < 1000; i++) {
			int index = (int)(Math.random() * currCardCnt);
			Card2 temp = this.cardDeck[0];
			this.cardDeck[0] = this.cardDeck[index];
			this.cardDeck[index] = temp;
 		}
//		return cardDeck;
	}
	
	public Card2 pickCard() {
		// 랜덤하게 뽑은 카드 요소를 Null로 바꾸기
		int index = 0;
		Card2 returnCard = null;
		do {
			index = (int)(Math.random() * CARD_NUM);
			returnCard = this.cardDeck[index];
		} while (returnCard == null);
		
		this.cardDeck[index] = null;
		currCardCnt--;
		return returnCard;
	}
	
	/**
	 * @Method Name : pickCardWithRemoveArray
	 * 작성일 : 2023. 11. 17.
	 * 작성자 : goott5
	 * @param
	 * 반환값 : Card2
	 * @Description
	 */
	public Card2 pickCardWithRemoveArr() {
		int index = 0;
		Card2 returnCard = null;
		index = (int)(Math.random() * currCardCnt);
		returnCard = this.cardDeck[index];
		this.cardDeck[index] = null;
		currCardCnt--;

		Card2[] newCardDeck = new Card2[currCardCnt];
		int cnt = 0;
		for (int i = 0; i < currCardCnt + 1; i++) {
			if (this.cardDeck[i] != null) {
				newCardDeck[cnt] = this.cardDeck[i];
				cnt++;
			} 
		}
		this.cardDeck = newCardDeck;
		return returnCard;
	}
	
	public Card2 pickCardWithRemoveArray() {
		int index = 0;
		Card2 returnCard = null;
		index = (int)(Math.random() * currCardCnt);
		returnCard = this.cardDeck[index];

		Card2[] newCardDeck = new Card2[currCardCnt - 1];
		for (int from = 0; from < index; from++) {
				newCardDeck[from] = this.cardDeck[from];
		}
		for (int from = index + 1; from < currCardCnt; from++) {
			newCardDeck[from - 1] = this.cardDeck[from];
	}
		currCardCnt--;
		this.cardDeck = newCardDeck;
		return returnCard;
	}
	
	/**
	 * @Method Name : displayCard
	 * 작성일 : 2023. 11. 17.
	 * 작성자 : goott5
	 * @param
	 * 반환값 : String
	 * @Description
	 */
	public String displayCard() {
		return "현재 카드 갯수 : " + this.cardDeck.length + " [Cards] : " + Arrays.toString(this.cardDeck);
	}

}
