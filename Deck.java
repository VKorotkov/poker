import java.util.Date;
import java.util.Random;

public class Deck {
		
	Card c2OfHearts = new Card(2, "Hearts");	
	Card c2OfDiamonds = new Card(2, "Diamonds");	
	Card c2OfCrosses = new Card(2, "Crosses");	
	Card c2OfSpades = new Card(2, "Spades");
	
	
	Card c3OfHearts = new Card(3, "Hearts");	
	Card c3OfDiamonds = new Card(3, "Diamonds");	
	Card c3OfCrosses = new Card(3, "Crosses");
	Card c3OfSpades = new Card(3, "Spades");
	
	Card c4OfHearts = new Card(4, "Hearts");
	Card c4OfDiamonds = new Card(4, "Diamonds");
	Card c4OfCrosses = new Card(4, "Crosses");
	Card c4OfSpades = new Card(4, "Spades");
	
	Card c5OfHearts = new Card(5, "Hearts");
	Card c5OfDiamonds = new Card(5, "Diamonds");
	Card c5OfCrosses = new Card(5, "Crosses");
	Card c5OfSpades = new Card(5, "Spades");
	
	Card c6OfHearts = new Card(6, "Hearts");
	Card c6OfDiamonds = new Card(6, "Diamonds");
	Card c6OfCrosses = new Card(6, "Crosses");
	Card c6OfSpades = new Card(6, "Spades");
	
	Card c7OfHearts = new Card(7, "Hearts");
	Card c7OfDiamonds = new Card(7, "Diamonds");
	Card c7OfCrosses = new Card(7, "Crosses");
	Card c7OfSpades = new Card(7, "Spades");
	
	Card c8OfHearts = new Card(8, "Hearts");
	Card c8OfDiamonds = new Card(8, "Diamonds");
	Card c8OfCrosses = new Card(8, "Crosses");
	Card c8OfSpades = new Card(8, "Spades");
	
	Card c9OfHearts = new Card(9, "Hearts");
	Card c9OfDiamonds = new Card(9, "Diamonds");
	Card c9OfCrosses = new Card(9, "Crosses");
	Card c9OfSpades = new Card(9, "Spades");
	
	Card c10OfHearts = new Card(10, "Hearts");
	Card c10OfDiamonds = new Card(10, "Diamonds");
	Card c10OfCrosses = new Card(10, "Crosses");
	Card c10OfSpades = new Card(10, "Spades");
	
	Card cJOfHearts = new Card(11, "Hearts");
	Card cJOfDiamonds = new Card(11, "Diamonds");
	Card cJOfCrosses = new Card(11, "Crosses");
	Card cJOfSpades = new Card(11, "Spades");
	
	Card cQOfHearts = new Card(12, "Hearts");
	Card cQOfDiamonds = new Card(12, "Diamonds");
	Card cQOfCrosses = new Card(12, "Crosses");
	Card cQOfSpades = new Card(12, "Spades");
	
	Card cKOfHearts = new Card(13, "Hearts");
	Card cKOfDiamonds = new Card(13, "Diamonds");
	Card cKOfCrosses = new Card(13, "Crosses");
	Card cKOfSpades = new Card(13, "Spades");
	
	Card cAOfHearts = new Card(14, "Hearts");
	Card cAOfDiamonds = new Card(14, "Diamonds");
	Card cAOfCrosses = new Card(14, "Crosses");
	Card cAOfSpades = new Card(14, "Spades");
	
	
	
	Card[] deck = {c2OfHearts, c2OfDiamonds, c2OfCrosses, c2OfSpades, 
			c3OfHearts, c3OfDiamonds, c3OfCrosses, c3OfSpades,
			c4OfHearts, c4OfDiamonds, c4OfCrosses, c4OfSpades,
			c5OfHearts, c5OfDiamonds, c5OfCrosses, c5OfSpades,
			c6OfHearts, c6OfDiamonds, c6OfCrosses, c6OfSpades,
			c7OfHearts, c7OfDiamonds, c7OfCrosses, c7OfSpades,
			c8OfHearts, c8OfDiamonds, c8OfCrosses, c8OfSpades,
			c9OfHearts, c9OfDiamonds, c9OfCrosses, c9OfSpades,
			c10OfHearts, c10OfDiamonds, c10OfCrosses, c10OfSpades,
			cJOfHearts, cJOfDiamonds, cJOfCrosses, cJOfSpades,
			cQOfHearts, cQOfDiamonds, cQOfCrosses, cQOfSpades,
			cKOfHearts, cKOfDiamonds, cKOfCrosses, cKOfSpades,
			cAOfHearts, cAOfDiamonds, cAOfCrosses, cAOfSpades};
	
	public Card[] getDeck() {
		return deck;
	}
	
	public static void reshuffle(Card[] a) {
		
		int length = a.length;
		
		Random generator = new Random(new Date().getTime());
		for (int i = 0; i < length; i++) {
			int newPos = generator.nextInt(length);
			Card curCard = a[i];
			a[i] = a[newPos];
			a[newPos] = curCard;
			
			if(i%(length/4) == 0) {
				int pause = generator.nextInt(20);
				try {
					Thread.currentThread().sleep(pause);
				}
				catch (InterruptedException ex) {
					generator.setSeed(new Date().getTime());
				}
			}
		}
			
	}

}
