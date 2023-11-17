package cardDealer;

public class Dealer {
	public static Card[] shuffle(Card[] cards) {
		for (int i = 0; i < cards.length; i++) {
			int index = (int)(Math.random() * 52);
			String temp = cards[0].shape;
			cards[0].shape = cards[index].shape;
			cards[index].shape = temp;
		}
		return cards;
	}

	public static Card[] pickCard(Card[] cards, int num) {
		Card[] players = new Card[num];
		Card pickedCard = null;
		for (int i = 0; i < num; i++) {
			if (cards[i] != null) {
				pickedCard = cards[i];
				cards[i] = null; 
//				newPlayer[i] = pickedCard;
				players[i] = pickedCard;
			}
		}
		return players;
	}

	public static void playerCard(Card[] players) {
		for (int i = 0; i < players.length; i++) {
			System.out.println("player" + (i + 1) + "의 카드: " + players[i].getShape() + ", " + players[i].getNum());			
		}
	}

	

	
}
