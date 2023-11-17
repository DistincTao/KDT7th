package cardDealer;

public class CardDealerTest {

	public static void main(String[] args) {
		Card[] cards = new Card[52];
		Card[] players = new Card[6];
		Card newCard = new Card("heart", "A");
		System.out.println(newCard.shape + ", " + newCard.num);
		
		cards = Card.newCards();
		Card.cardOutput(cards);
		
		Dealer.shuffle(cards);
		Card.cardOutput(cards);
		
		players = Dealer.pickCard(cards, 6);
		Dealer.playerCard(players);

	}
	
	
	
}
