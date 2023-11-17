package cardDealer2;

public class CardDealerTest2 {

	public static void main(String[] args) {
//		Card2 card1 = new Card2(1, 1);
//		System.out.println(card1.toString());
		
		Dealer2 현성 = new Dealer2();
		System.out.println(현성.displayCard());

		현성.shuffle();
		System.out.println(현성.displayCard());
		
//		for (int i = 0; i < Dealer2.CARD_NUM; i++ ) {
//			Card2 pick = 현성.pickCard();
//			System.out.println((i + 1) + "번째 카드 : " + pick.toString());
//			System.out.println(현성.displayCard());
//		}
		
		for (int i = 0; i < Dealer2.CARD_NUM; i++ ) {
			Card2 pick2 = 현성.pickCardWithRemoveArr();
			System.out.println((i + 1) + "번째 카드 : " + pick2.toString());
			System.out.println(현성.displayCard());
		}
		
//		for (int i = 0; i < Dealer2.CARD_NUM; i++ ) {
//			Card2 pick2 = 현성.pickCardWithRemoveArray();
//			System.out.println((i + 1) + "번째 카드 : " + pick2.toString());
//			System.out.println(현성.displayCard());
//		}
	}
}
