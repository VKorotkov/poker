
public class Card {
	
	int value;
	String suit;
	
	public int getValue(){
		return value;
	}
	
	public void setValue(Card c, int a) {
		c.value = a;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public void setSuit(Card c, String s) {
		c.suit = s;
	}
	
	public Card(int v, String s) {
		value = v;
		suit = s;
	}
	
}	
