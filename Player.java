import java.util.ArrayList;

public class Player {
	
	Hand hand;
	String name;
	ArrayList<Card> playerCombCards;
	Combination combination;
	int money;
	
	
	public Player(String n) {
		name = n;
	}
	
	public void setHand(Card c1, Card c2){
		playerCombCards = new ArrayList<Card>();
		hand = new Hand(c1, c2);
		playerCombCards.add(c1);
		playerCombCards.add(c2);	    
	}
	
	public Hand getHand() {
		return hand;
	}
	
	public void printHand() {
		getHand();
		System.out.println(hand.card1.getValue() + " of " + hand.card1.getSuit() +
		" - " + hand.card2.getValue() + " of " + hand.card2.getSuit());
	}
	
	public void printCombCards() {
		for(int i = 0; i < playerCombCards.size(); i++) {
			if(i != playerCombCards.size() - 1) {
			System.out.print(playerCombCards.get(i).getValue() + " of " +
		                     playerCombCards.get(i).getSuit() + "; ");
			}
			else
				System.out.println(playerCombCards.get(i).getValue() + " of " +
	                     playerCombCards.get(i).getSuit());
			
				
		}
	}
	
	public void setMoney(int a) {
		this.money = a;
	}
	
	public int getMoney() {
		return money;
	}
	
	
	
	public void checkCombination() {
		int max = 0;
		boolean straight = false;
		ArrayList<Card> list = playerCombCards;
		ArrayList<Integer> checkStraight = new ArrayList<Integer>();
		for(int i = 0; i < list.size(); i++) {
			checkStraight.add(list.get(i).getValue());
		}
		ArrayList<Card> hearts = new ArrayList<Card>();
		ArrayList<Card> diamonds = new ArrayList<Card>();
		ArrayList<Card> crosses = new ArrayList<Card>();
		ArrayList<Card> spades = new ArrayList<Card>();
		
		ArrayList<Card> aces = new ArrayList<Card>();		
		ArrayList<Card> kings = new ArrayList<Card>();
		ArrayList<Card> queens = new ArrayList<Card>();
		ArrayList<Card> jacks = new ArrayList<Card>();
		ArrayList<Card> tens = new ArrayList<Card>();
		ArrayList<Card> nines = new ArrayList<Card>();
		ArrayList<Card> eights = new ArrayList<Card>();
		ArrayList<Card> sevens = new ArrayList<Card>();
		ArrayList<Card> sixes = new ArrayList<Card>();
		ArrayList<Card> fives = new ArrayList<Card>();
		ArrayList<Card> fours = new ArrayList<Card>();
		ArrayList<Card> threes = new ArrayList<Card>();
		ArrayList<Card> deuces = new ArrayList<Card>();
		ArrayList<Integer> straightToAce = new ArrayList();
		straightToAce.add(10);
		straightToAce.add(11);
		straightToAce.add(12);
		straightToAce.add(13);
		straightToAce.add(14);
		ArrayList<Integer> straightToKing = new ArrayList();
		straightToKing.add(9);
		straightToKing.add(10);
		straightToKing.add(11);
		straightToKing.add(12);
		straightToKing.add(13);
		ArrayList<Integer> straightToQueen = new ArrayList();
		straightToQueen.add(8);
		straightToQueen.add(9);
		straightToQueen.add(10);
		straightToQueen.add(11);
		straightToQueen.add(12);
		ArrayList<Integer> straightToJack = new ArrayList();
		straightToJack.add(7);
		straightToJack.add(8);
		straightToJack.add(9);
		straightToJack.add(10);
		straightToJack.add(11);
		ArrayList<Integer> straightTo10 = new ArrayList();
		straightTo10.add(6);
		straightTo10.add(7);
		straightTo10.add(8);
		straightTo10.add(9);
		straightTo10.add(10);
		ArrayList<Integer> straightTo9 = new ArrayList();
		straightTo9.add(5);
		straightTo9.add(6);
		straightTo9.add(7);
		straightTo9.add(8);
		straightTo9.add(9);
		ArrayList<Integer> straightTo8 = new ArrayList();
		straightTo8.add(4);
		straightTo8.add(5);
		straightTo8.add(6);
		straightTo8.add(7);
		straightTo8.add(8);
		ArrayList<Integer> straightTo7 = new ArrayList();
		straightTo7.add(3);
		straightTo7.add(4);
		straightTo7.add(5);
		straightTo7.add(6);
		straightTo7.add(7);
		ArrayList<Integer> straightTo6 = new ArrayList();
		straightTo6.add(2);
		straightTo6.add(3);
		straightTo6.add(4);
		straightTo6.add(5);
		straightTo6.add(6);
		ArrayList<Integer> straightTo5 = new ArrayList();
		straightTo5.add(14);
		straightTo5.add(2);
		straightTo5.add(3);
		straightTo5.add(4);
		straightTo5.add(5);

		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getSuit().equals("Hearts")) {
				hearts.add(list.get(i));
				
			}else
			if(list.get(i).getSuit().equals("Diamonds")) {
				diamonds.add(list.get(i));
				
			}else
			if(list.get(i).getSuit().equals("Crosses")) {
				crosses.add(list.get(i));
				
			}else
			if(list.get(i).getSuit().equals("Spades")) {
				spades.add(list.get(i));
				
			}
		}	
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getValue() == 14) {
				aces.add(list.get(i));
			}else
			if(list.get(i).getValue() == 13) {
				kings.add(list.get(i));
			}
			else
			if(list.get(i).getValue() == 12) {
				queens.add(list.get(i));
			}else
			if(list.get(i).getValue() == 11) {
				jacks.add(list.get(i));
			}else
			if(list.get(i).getValue() == 10) {
				tens.add(list.get(i));
			}else
			if(list.get(i).getValue() == 9) {
				nines.add(list.get(i));
			}else
			if(list.get(i).getValue() == 8) {
				eights.add(list.get(i));
			}else
			if(list.get(i).getValue() == 7) {
				sevens.add(list.get(i));
			}else
			if(list.get(i).getValue() == 6) {
				sixes.add(list.get(i));
			}else
			if(list.get(i).getValue() == 5) {
				fives.add(list.get(i));
			}else
			if(list.get(i).getValue() == 4) {
				fours.add(list.get(i));
			}else
			if(list.get(i).getValue() == 3) {
				threes.add(list.get(i));
			}else
				deuces.add(list.get(i));
		}
		
		for(int i = hearts.size()-1; i >= 0; i--) {
		    for(int j = 0; j < i; j++) {
		    	if(hearts.get(j).getValue() >= hearts.get(j+1).getValue()) {
		    		Card n = hearts.get(j);
		    		hearts.set(j, hearts.get(j+1));
		    		hearts.set(j + 1, n);
		    	}
		    }
		}
		
		for(int i = diamonds.size()-1; i >= 0; i--) {
		    for(int j = 0; j < i; j++) {
		    	if(diamonds.get(j).getValue() >= diamonds.get(j+1).getValue()) {
		    		Card n = diamonds.get(j);
		    		diamonds.set(j, diamonds.get(j+1));
		    		diamonds.set(j + 1, n);
		    	}
		    }
		}
		
		for(int i = crosses.size()-1; i >= 0; i--) {
		    for(int j = 0; j < i; j++) {
		    	if(crosses.get(j).getValue() >= crosses.get(j+1).getValue()) {
		    		Card n = crosses.get(j);
		    		crosses.set(j, crosses.get(j+1));
		    		crosses.set(j + 1, n);
		    	}
		    }
		}
		
		for(int i = spades.size()-1; i >= 0; i--) {
		    for(int j = 0; j < i; j++) {
		    	if(spades.get(j).getValue() >= spades.get(j+1).getValue()) {
		    		Card n = spades.get(j);
		    		spades.set(j, spades.get(j+1));
		    		spades.set(j + 1, n);
		    	}
		    }
		}
	
		for(int i = list.size()-1; i >= 0; i--) {
		    for(int j = 0; j < i; j++) {
		    	if(list.get(j).getValue() <= list.get(j+1).getValue()) {
		    		Card n = list.get(j);
		    		list.set(j, list.get(j+1));
		    		list.set(j + 1, n);
		    	}
		    }
		}
		
		if(hearts.size() >= 5) {
			ArrayList<Integer> l = new ArrayList();
			for(int i = 0; i < hearts.size(); i++) {
				int r = hearts.get(i).getValue();
				l.add(r);
			}
			if(l.containsAll(straightToAce)) {
				straight = true;
				
				combination = new Combination("Royal Flush");
				for(int i = 0; i < hearts.size(); i++) {
					if(straightToAce.contains(hearts.get(i).getValue())) {
						combination.comb.add(hearts.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightToKing)) {
				straight = true;
				
				combination = new Combination("Straight Flush, King high");
				for(int i = 0; i < hearts.size(); i++) {
					if(straightToKing.contains(hearts.get(i).getValue())) {
						combination.comb.add(hearts.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightToQueen)) {
				straight = true;
				
				combination = new Combination("Straight Flush, Queen high");
				for(int i = 0; i < hearts.size(); i++) {
					if(straightToQueen.contains(hearts.get(i).getValue())) {
						combination.comb.add(hearts.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightToJack)) {
				straight = true;
				
				combination = new Combination("Straight Flush, Jack high");
				for(int i = 0; i < hearts.size(); i++) {
					if(straightToJack.contains(hearts.get(i).getValue())) {
						combination.comb.add(hearts.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightTo10)) {
				straight = true;
				
				combination = new Combination("Straight Flush, 10 high");
				for(int i = 0; i < hearts.size(); i++) {
					if(straightTo10.contains(hearts.get(i).getValue())) {
						combination.comb.add(hearts.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightTo9)) {
				straight = true;
				
				combination = new Combination("Straight Flush, 9 high");
				for(int i = 0; i < hearts.size(); i++) {
					if(straightTo9.contains(hearts.get(i).getValue())) {
						combination.comb.add(hearts.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightTo8)) {
				straight = true;
				
				combination = new Combination("Straight Flush, 8 high");
				for(int i = 0; i < hearts.size(); i++) {
					if(straightTo8.contains(hearts.get(i).getValue())) {
						combination.comb.add(hearts.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightTo7)) {
				straight = true;
				
				combination = new Combination("Straight Flush, 7 high");
				for(int i = 0; i < hearts.size(); i++) {
					if(straightTo7.contains(hearts.get(i).getValue())) {
						combination.comb.add(hearts.get(i));
					}
				}
				
			}else 
			if(l.containsAll(straightTo6)) {
				straight = true;
				
				combination = new Combination("Straight Flush, 6 high");
				for(int i = 0; i < hearts.size(); i++) {
					if(straightTo6.contains(hearts.get(i).getValue())) {
						combination.comb.add(hearts.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightTo5)) {
				straight = true;
				
				combination = new Combination("Straight Flush, 5 high");
				combination.comb.add(hearts.get(0));
				for(int i = hearts.size() - 1; i > 0; i--) {
					if(straightTo5.contains(hearts.get(i).getValue())) {
						combination.comb.add(hearts.get(i));
					}
				}
				
			}else
			if(l.contains(14)) {
				max = 14;
			}else
			if(l.contains(13)) {
				max = 13;
			}else
			if(l.contains(12)) {
				max = 12;
			}else
			if(l.contains(11)) {
				max = 11;
			}else
			if(l.contains(10)) {
				max = 10;
			}else
			if(l.contains(9)) {
				max = 9;
			}else
			if(l.contains(8)) {
				max = 8;
			}else
			if(l.contains(7)) {
				max = 7;
			}else
			if(l.contains(6)) {
				max = 6;
			}
				
		}else
		if(diamonds.size() >= 5) {
			ArrayList<Integer> l = new ArrayList();
			for(int i = 0; i < diamonds.size(); i++) {
				int r = diamonds.get(i).getValue();
				l.add(r);
			}
			if(l.containsAll(straightToAce)) {
				straight = true;
				
				combination = new Combination("Royal Flush");
				for(int i = 0; i < diamonds.size(); i++) {
					if(straightToAce.contains(diamonds.get(i).getValue())) {
						combination.comb.add(diamonds.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightToKing)) {
				straight = true;
				
				combination = new Combination("Straight Flush, King high");
				for(int i = 0; i < diamonds.size(); i++) {
					if(straightToKing.contains(diamonds.get(i).getValue())) {
						combination.comb.add(diamonds.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightToQueen)) {
				straight = true;
				
				combination = new Combination("Straight Flush, Queen high");
				for(int i = 0; i < diamonds.size(); i++) {
					if(straightToQueen.contains(diamonds.get(i).getValue())) {
						combination.comb.add(diamonds.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightToJack)) {
				straight = true;
				
				combination = new Combination("Straight Flush, Jack high");
				for(int i = 0; i < diamonds.size(); i++) {
					if(straightToJack.contains(diamonds.get(i).getValue())) {
						combination.comb.add(diamonds.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightTo10)) {
				straight = true;
				
				combination = new Combination("Straight Flush, 10 high");
				for(int i = 0; i < diamonds.size(); i++) {
					if(straightTo10.contains(diamonds.get(i).getValue())) {
						combination.comb.add(diamonds.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightTo9)) {
				straight = true;
				
				combination = new Combination("Straight Flush, 9 high");
				for(int i = 0; i < diamonds.size(); i++) {
					if(straightTo9.contains(diamonds.get(i).getValue())) {
						combination.comb.add(diamonds.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightTo8)) {
				straight = true;
				
				combination = new Combination("Straight Flush, 8 high");
				for(int i = 0; i < diamonds.size(); i++) {
					if(straightTo8.contains(diamonds.get(i).getValue())) {
						combination.comb.add(diamonds.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightTo7)) {
				straight = true;
				
				combination = new Combination("Straight Flush, 7 high");
				for(int i = 0; i < diamonds.size(); i++) {
					if(straightTo7.contains(diamonds.get(i).getValue())) {
						combination.comb.add(diamonds.get(i));
					}
				}
				
			}else 
			if(l.containsAll(straightTo6)) {
				straight = true;
				
				combination = new Combination("Straight Flush, 6 high");
				for(int i = 0; i < diamonds.size(); i++) {
					if(straightTo6.contains(diamonds.get(i).getValue())) {
						combination.comb.add(diamonds.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightTo5)) {
				straight = true;
				
				combination = new Combination("Straight Flush, 5 high");
				combination.comb.add(diamonds.get(0));
				for(int i = diamonds.size() - 1; i > 0; i--) {
					if(straightTo5.contains(diamonds.get(i).getValue())) {
						combination.comb.add(diamonds.get(i));
					}
				}
				
			}else
				if(l.contains(14)) {
					max = 14;
				}else
				if(l.contains(13)) {
					max = 13;
				}else
				if(l.contains(12)) {
					max = 12;
				}else
				if(l.contains(11)) {
					max = 11;
				}else
				if(l.contains(10)) {
					max = 10;
				}else
				if(l.contains(9)) {
					max = 9;
				}else
				if(l.contains(8)) {
					max = 8;
				}else
				if(l.contains(7)) {
					max = 7;
				}else
				if(l.contains(6)) {
					max = 6;
				}
		}else
		if(crosses.size() >= 5) {
			ArrayList<Integer> l = new ArrayList();
			for(int i = 0; i < crosses.size(); i++) {
				int r = crosses.get(i).getValue();
				l.add(r);
			}
			if(l.containsAll(straightToAce)) {
				straight = true;
				
				combination = new Combination("Royal Flush");
				for(int i = 0; i < crosses.size(); i++) {
					if(straightToAce.contains(crosses.get(i).getValue())) {
						combination.comb.add(crosses.get(i));
					}
				}				
				
			}else
			if(l.containsAll(straightToKing)) {
				straight = true;
				
				combination = new Combination("Straight Flush, King high");
				for(int i = 0; i < crosses.size(); i++) {
					if(straightToKing.contains(crosses.get(i).getValue())) {
						combination.comb.add(crosses.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightToQueen)) {
				straight = true;
				
				combination = new Combination("Straight Flush, Queen high");
				for(int i = 0; i < crosses.size(); i++) {
					if(straightToQueen.contains(crosses.get(i).getValue())) {
						combination.comb.add(crosses.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightToJack)) {
				straight = true;
				
				combination = new Combination("Straight Flush, Jack high");
				for(int i = 0; i < crosses.size(); i++) {
					if(straightToJack.contains(crosses.get(i).getValue())) {
						combination.comb.add(crosses.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightTo10)) {
				straight = true;
				
				combination = new Combination("Straight Flush, 10 high");
				for(int i = 0; i < crosses.size(); i++) {
					if(straightTo10.contains(crosses.get(i).getValue())) {
						combination.comb.add(crosses.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightTo9)) {
				straight = true;
				
				combination = new Combination("Straight Flush, 9 high");
				for(int i = 0; i < crosses.size(); i++) {
					if(straightTo9.contains(crosses.get(i).getValue())) {
						combination.comb.add(crosses.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightTo8)) {
				straight = true;
				
				combination = new Combination("Straight Flush, 8 high");
				for(int i = 0; i < crosses.size(); i++) {
					if(straightTo8.contains(crosses.get(i).getValue())) {
						combination.comb.add(crosses.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightTo7)) {
				straight = true;
				
				combination = new Combination("Straight Flush, 7 high");
				for(int i = 0; i < crosses.size(); i++) {
					if(straightTo7.contains(crosses.get(i).getValue())) {
						combination.comb.add(crosses.get(i));
					}
				}
				
			}else 
			if(l.containsAll(straightTo6)) {
				straight = true;
				
				combination = new Combination("Straight Flush, 6 high");
				for(int i = 0; i < crosses.size(); i++) {
					if(straightTo6.contains(crosses.get(i).getValue())) {
						combination.comb.add(crosses.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightTo5)) {
				straight = true;
				
				combination = new Combination("Straight Flush, 5 high");
				combination.comb.add(crosses.get(0));
				for(int i = crosses.size() - 1; i > 0; i--) {
					if(straightTo5.contains(crosses.get(i).getValue())) {
						combination.comb.add(crosses.get(i));
					}
				}
				
			}else
				if(l.contains(14)) {
					max = 14;
				}else
				if(l.contains(13)) {
					max = 13;
				}else
				if(l.contains(12)) {
					max = 12;
				}else
				if(l.contains(11)) {
					max = 11;
				}else
				if(l.contains(10)) {
					max = 10;
				}else
				if(l.contains(9)) {
					max = 9;
				}else
				if(l.contains(8)) {
					max = 8;
				}else
				if(l.contains(7)) {
					max = 7;
				}else
				if(l.contains(6)) {
					max = 6;
				}
		}else
		if(spades.size() >= 5) {
			ArrayList<Integer> l = new ArrayList();
			for(int i = 0; i < spades.size(); i++) {
				int r = spades.get(i).getValue();
				l.add(r);
			}
			if(l.containsAll(straightToAce)) {
				straight = true;
				
				combination = new Combination("Royal Flush");
				for(int i = 0; i < spades.size(); i++) {
					if(straightToAce.contains(spades.get(i).getValue())) {
						combination.comb.add(spades.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightToKing)) {
				straight = true;
				
				combination = new Combination("Straight Flush, King high");
				for(int i = 0; i < spades.size(); i++) {
					if(straightToKing.contains(spades.get(i).getValue())) {
						combination.comb.add(spades.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightToQueen)) {
				straight = true;
				
				combination = new Combination("Straight Flush, Queen high");
				for(int i = 0; i < spades.size(); i++) {
					if(straightToQueen.contains(spades.get(i).getValue())) {
						combination.comb.add(spades.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightToJack)) {
				straight = true;
				
				combination = new Combination("Straight Flush, Jack high");
				for(int i = 0; i < spades.size(); i++) {
					if(straightToJack.contains(spades.get(i).getValue())) {
						combination.comb.add(spades.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightTo10)) {
				straight = true;
				
				combination = new Combination("Straight Flush, 10 high");
				for(int i = 0; i < spades.size(); i++) {
					if(straightTo10.contains(spades.get(i).getValue())) {
						combination.comb.add(spades.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightTo9)) {
				straight = true;
				
				combination = new Combination("Straight Flush, 9 high");
				for(int i = 0; i < spades.size(); i++) {
					if(straightTo9.contains(spades.get(i).getValue())) {
						combination.comb.add(spades.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightTo8)) {
				straight = true;
				
				combination = new Combination("Straight Flush, 8 high");
				for(int i = 0; i < spades.size(); i++) {
					if(straightTo8.contains(spades.get(i).getValue())) {
						combination.comb.add(spades.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightTo7)) {
				straight = true;
				
				combination = new Combination("Straight Flush, 7 high");
				for(int i = 0; i < spades.size(); i++) {
					if(straightTo7.contains(spades.get(i).getValue())) {
						combination.comb.add(spades.get(i));
					}
				}
				
				
			}else 
			if(l.containsAll(straightTo6)) {
				straight = true;
				
				combination = new Combination("Straight Flush, 6 high");
				for(int i = 0; i < spades.size(); i++) {
					if(straightTo6.contains(spades.get(i).getValue())) {
						combination.comb.add(spades.get(i));
					}
				}
				
			}else
			if(l.containsAll(straightTo5)) {
				straight = true;
				
				combination = new Combination("Straight Flush, 5 high");
				combination.comb.add(spades.get(0));
				for(int i = spades.size() - 1; i > 0; i--) {
					if(straightTo5.contains(spades.get(i).getValue())) {
						combination.comb.add(spades.get(i));
					}
				}
				
			}else
				if(l.contains(14)) {
					max = 14;					
				}else
				if(l.contains(13)) {
					max = 13;
				}else
				if(l.contains(12)) {
					max = 12;
				}else
				if(l.contains(11)) {
					max = 11;
				}else
				if(l.contains(10)) {
					max = 10;
				}else
				if(l.contains(9)) {
					max = 9;
				}else
				if(l.contains(8)) {
					max = 8;
				}else
				if(l.contains(7)) {
					max = 7;
				}else
				if(l.contains(6)) {
					max = 6;
				}
		}
		if(straight == false) {
		if(aces.size() == 4) {
			
			combination = new Combination("Quads of Aces");
			combination.comb.addAll(aces);
		    while (combination.comb.size() < 5) {
		    	for(int i = 0; i < list.size(); i++) {
		    		if(list.get(i).getValue() != 14)
		    			combination.comb.add(list.get(i));
		    	}
		    }
			
		}else
		if(kings.size() == 4) {
			
			combination = new Combination("Quads of Kings");
			combination.comb.addAll(kings);
			 while (combination.comb.size() < 5) {
			    	for(int i = 0; i < list.size(); i++) {
			    		if(list.get(i).getValue() != 13)
			    			combination.comb.add(list.get(i));
			    	}
			    }
			
		}else
		if(queens.size() == 4) {
			
			combination = new Combination("Quads of Queens");
			combination.comb.addAll(queens);
			 while (combination.comb.size() < 5) {
			    	for(int i = 0; i < list.size(); i++) {
			    		if(list.get(i).getValue() != 12)
			    			combination.comb.add(list.get(i));
			    	}
			    }
			
		}else
		if(jacks.size() == 4) {
			
			combination = new Combination("Quads of Jacks");
			combination.comb.addAll(jacks);
			 while (combination.comb.size() < 5) {
			    	for(int i = 0; i < list.size(); i++) {
			    		if(list.get(i).getValue() != 11)
			    			combination.comb.add(list.get(i));
			    	}
			    }
			
		}else
		if(tens.size() == 4) {
			
			combination = new Combination("Quads of tens");
			combination.comb.addAll(tens);
			 while (combination.comb.size() < 5) {
			    	for(int i = 0; i < list.size(); i++) {
			    		if(list.get(i).getValue() != 10)
			    			combination.comb.add(list.get(i));
			    	}
			    }
			
		}else
		if(nines.size() == 4) {
			
			combination = new Combination("Quads of nines");
			combination.comb.addAll(nines);
			 while (combination.comb.size() < 5) {
			    	for(int i = 0; i < list.size(); i++) {
			    		if(list.get(i).getValue() != 9)
			    			combination.comb.add(list.get(i));
			    	}
			    }
			
		}else
		if(eights.size() == 4) {
			
			combination = new Combination("Quads of eights");
			combination.comb.addAll(eights);
			 while (combination.comb.size() < 5) {
			    	for(int i = 0; i < list.size(); i++) {
			    		if(list.get(i).getValue() != 8)
			    			combination.comb.add(list.get(i));
			    	}
			    }
			
		}else
		if(sevens.size() == 4) {
			
			combination = new Combination("Quads of sevens");
			combination.comb.addAll(sevens);
			 while (combination.comb.size() < 5) {
			    	for(int i = 0; i < list.size(); i++) {
			    		if(list.get(i).getValue() != 7)
			    			combination.comb.add(list.get(i));
			    	}
			    }
			
		}else
		if(sixes.size() == 4) {
			
			combination = new Combination("Quads of sixes");
			combination.comb.addAll(sixes);
			 while (combination.comb.size() < 5) {
			    	for(int i = 0; i < list.size(); i++) {
			    		if(list.get(i).getValue() != 6)
			    			combination.comb.add(list.get(i));
			    	}
			    }
			
		}else
		if(fives.size() == 4) {
			
			combination = new Combination("Quads of fives");
			combination.comb.addAll(fives);
			 while (combination.comb.size() < 5) {
			    	for(int i = 0; i < list.size(); i++) {
			    		if(list.get(i).getValue() != 5)
			    			combination.comb.add(list.get(i));
			    	}
			    }
			
		}else
		if(fours.size() == 4) {
			
			combination = new Combination("Quads of fours");
			combination.comb.addAll(fours);
			 while (combination.comb.size() < 5) {
			    	for(int i = 0; i < list.size(); i++) {
			    		if(list.get(i).getValue() != 4)
			    			combination.comb.add(list.get(i));
			    	}
			    }
			
		}else
		if(threes.size() == 4) {
			
			combination = new Combination("Quads of threes");
			combination.comb.addAll(threes);
			 while (combination.comb.size() < 5) {
			    	for(int i = 0; i < list.size(); i++) {
			    		if(list.get(i).getValue() != 3)
			    			combination.comb.add(list.get(i));
			    	}
			    }
			
		}else
		if(deuces.size() == 4) {
			
			combination = new Combination("Quads of deuces");
			combination.comb.addAll(deuces);
			combination.comb.add(list.get(0));
			
		}else
		if(aces.size() == 3 && kings.size() >= 2) {
			combination = new Combination("Full house Aces and Kings");
			combination.comb.addAll(aces);
			combination.comb.addAll(kings);
			
		}else
		if(aces.size() == 3 && queens.size() >= 2) {
			combination = new Combination("Full house Aces and Queens");
			combination.comb.addAll(aces);
			combination.comb.addAll(queens);
			
		}else
		if(aces.size() == 3 && jacks.size() >= 2) {
			combination = new Combination("Full house Aces and Jacks");
			combination.comb.addAll(aces);
			combination.comb.addAll(jacks);
			
		}else
		if(aces.size() == 3 && tens.size() >= 2) {
			combination = new Combination("Full house Aces and Tens");
			combination.comb.addAll(aces);
			combination.comb.addAll(tens);
			
		}else
		if(aces.size() == 3 && nines.size() >= 2) {
			combination = new Combination("Full house Aces and Nines");
			combination.comb.addAll(aces);
			combination.comb.addAll(nines);
			
		}else	
		if(aces.size() == 3 && eights.size() >= 2) {
			combination = new Combination("Full house Aces and Eights");
			combination.comb.addAll(aces);
			combination.comb.addAll(eights);
			
		}else	
		if(aces.size() == 3 && sevens.size() >= 2) {
			combination = new Combination("Full house Aces and Sevens");
			combination.comb.addAll(aces);
			combination.comb.addAll(sevens);
			
		}else
		if(aces.size() == 3 && sixes.size() >= 2) {
			combination = new Combination("Full house Aces and Sixes");
			combination.comb.addAll(aces);
			combination.comb.addAll(sixes);
			
		}else	
		if(aces.size() == 3 && fives.size() >= 2) {
			combination = new Combination("Full house Aces and Fives");
			combination.comb.addAll(aces);
			combination.comb.addAll(fives);
			
		}else
		if(aces.size() == 3 && fours.size() >= 2) {
			combination = new Combination("Full house Aces and Fours");
			combination.comb.addAll(aces);
			combination.comb.addAll(fours);
			
		}else
		if(aces.size() == 3 && threes.size() >= 2) {
			combination = new Combination("Full house Aces and Threes");
			combination.comb.addAll(aces);
			combination.comb.addAll(threes);
			
		}else
		if(aces.size() == 3 && deuces.size() >= 2) {
			combination = new Combination("Full house Aces and Deuces");
			combination.comb.addAll(aces);
			combination.comb.addAll(deuces);
			
		}else
		if(kings.size() == 3 && aces.size() == 2) {
			combination = new Combination("Full house Kings and Aces");
			combination.comb.addAll(kings);
			combination.comb.addAll(aces);
			
		}else
		if(kings.size() == 3 && queens.size() >= 2) {
			combination = new Combination("Full house Kings and Queens");
			combination.comb.addAll(kings);
			combination.comb.addAll(queens);
			
		}else
		if(kings.size() == 3 && jacks.size() >= 2) {
			combination = new Combination("Full house Kings and Jacks");
			combination.comb.addAll(kings);
			combination.comb.addAll(jacks);
			
		}else
		if(kings.size() == 3 && tens.size() >= 2) {
			combination = new Combination("Full house Kings and Tens");
			combination.comb.addAll(kings);
			combination.comb.addAll(tens);
			
		}else
		if(kings.size() == 3 && nines.size() >= 2) {
			combination = new Combination("Full house Kings and Nines");
			combination.comb.addAll(kings);
			combination.comb.addAll(nines);
			
		}else
		if(kings.size() == 3 && eights.size() >= 2) {
			combination = new Combination("Full house Kings and Eights");
			combination.comb.addAll(kings);
			combination.comb.addAll(eights);
		
		}else
		if(kings.size() == 3 && sevens.size() >= 2) {
			combination = new Combination("Full house Kings and Sevens");
			combination.comb.addAll(kings);
			combination.comb.addAll(sevens);
			
		}else
		if(kings.size() == 3 && sixes.size() >= 2) {
			combination = new Combination("Full house Kings and Sixes");
			combination.comb.addAll(kings);
			combination.comb.addAll(sixes);
			
		}else
		if(kings.size() == 3 && fives.size() >= 2) {
			combination = new Combination("Full house Kings and Fives");
			combination.comb.addAll(kings);
			combination.comb.addAll(fives);
			
		}else
		if(kings.size() == 3 && fours.size() >= 2) {
			combination = new Combination("Full house Kings and Fours");
			combination.comb.addAll(kings);
			combination.comb.addAll(fours);
			
		}else
		if(kings.size() == 3 && threes.size() >= 2) {
			combination = new Combination("Full house Kings and Threes");
			combination.comb.addAll(kings);
			combination.comb.addAll(threes);
			
		}else
		if(kings.size() == 3 && deuces.size() >= 2) {
			combination = new Combination("Full house Kings and Deuces");
			combination.comb.addAll(kings);
			combination.comb.addAll(deuces);
			
		}else
		if(queens.size() == 3 && aces.size() == 2) {
			combination = new Combination("Full house Queens and Aces");
			combination.comb.addAll(queens);
			combination.comb.addAll(aces);
			
		}else
		if(queens.size() == 3 && kings.size() == 2) {
			combination = new Combination("Full house Queens and Kings");
			combination.comb.addAll(queens);
			combination.comb.addAll(kings);
			
		}else
		if(queens.size() == 3 && jacks.size() >= 2) {
			combination = new Combination("Full house Queens and Jacks");
			combination.comb.addAll(queens);
			combination.comb.addAll(jacks);
			
		}else
		if(queens.size() == 3 && tens.size() >= 2) {
			combination = new Combination("Full house Queens and Tens");
			combination.comb.addAll(queens);
			combination.comb.addAll(tens);
			
		}else
		if(queens.size() == 3 && nines.size() >= 2) {
			combination = new Combination("Full house Queens and Nines");
			combination.comb.addAll(queens);
			combination.comb.addAll(nines);
			
		}else
		if(queens.size() == 3 && eights.size() >= 2) {
			combination = new Combination("Full house Queens and Eights");
			combination.comb.addAll(queens);
			combination.comb.addAll(eights);
			
		}else
		if(queens.size() == 3 && sevens.size() >= 2) {
			combination = new Combination("Full house Queens and Sevens");
			combination.comb.addAll(queens);
			combination.comb.addAll(sevens);
			
		}else
		if(queens.size() == 3 && sixes.size() >= 2) {
			combination = new Combination("Full house Queens and Sixes");
			combination.comb.addAll(queens);
			combination.comb.addAll(sixes);
			
		}else
		if(queens.size() == 3 && fives.size() >= 2) {
			combination = new Combination("Full house Queens and Fives");
			combination.comb.addAll(queens);
			combination.comb.addAll(fives);
			
		}else
		if(queens.size() == 3 && fours.size() >= 2) {
			combination = new Combination("Full house Queens and Fours");
			combination.comb.addAll(queens);
			combination.comb.addAll(fours);
			
		}else
		if(queens.size() == 3 && threes.size() >= 2) {
			combination = new Combination("Full house Queens and Threes");
			combination.comb.addAll(queens);
			combination.comb.addAll(threes);
			
		}else
		if(queens.size() == 3 && deuces.size() >= 2) {
			combination = new Combination("Full house Queens and Deuces");
			combination.comb.addAll(queens);
			combination.comb.addAll(deuces);
			
		}else
		if(jacks.size() == 3 && aces.size() == 2) {
			combination = new Combination("Full house Jacks and Aces");
			combination.comb.addAll(jacks);
			combination.comb.addAll(aces);
			
		}else
		if(jacks.size() == 3 && kings.size() == 2) {
			combination = new Combination("Full house Jacks and Kings");
			combination.comb.addAll(jacks);
			combination.comb.addAll(kings);
			
		}else
		if(jacks.size() == 3 && queens.size() == 2) {
			combination = new Combination("Full house Jacks and Queens");
			combination.comb.addAll(jacks);
			combination.comb.addAll(queens);
			
		}else
		if(jacks.size() == 3 && tens.size() >= 2) {
			combination = new Combination("Full house Jacks and Tens");
			combination.comb.addAll(jacks);
			combination.comb.addAll(tens);
			
		}else
		if(jacks.size() == 3 && nines.size() >= 2) {
			combination = new Combination("Full house Jacks and Niness");
			combination.comb.addAll(jacks);
			combination.comb.addAll(nines);
			
		}else
		if(jacks.size() == 3 && eights.size() >= 2) {
			combination = new Combination("Full house Jacks and Eights");
			combination.comb.addAll(jacks);
			combination.comb.addAll(eights);
			
		}else
		if(jacks.size() == 3 && sevens.size() >= 2) {
			combination = new Combination("Full house Jacks and Sevens");
			combination.comb.addAll(jacks);
			combination.comb.addAll(sevens);
			
		}else
		if(jacks.size() == 3 && sixes.size() >= 2) {
			combination = new Combination("Full house Jacks and Sixes");
			combination.comb.addAll(jacks);
			combination.comb.addAll(sixes);
			
		}else
		if(jacks.size() == 3 && fives.size() >= 2) {
			combination = new Combination("Full house Jacks and Fives");
			combination.comb.addAll(jacks);
			combination.comb.addAll(fives);
			
		}else
		if(jacks.size() == 3 && fours.size() >= 2) {
			combination = new Combination("Full house Jacks and Fours");
			combination.comb.addAll(jacks);
			combination.comb.addAll(fours);
			
		}else
		if(jacks.size() == 3 && threes.size() >= 2) {
			combination = new Combination("Full house Jacks and Threes");
			combination.comb.addAll(jacks);
			combination.comb.addAll(threes);
			
		}else
		if(jacks.size() == 3 && deuces.size() >= 2) {
			combination = new Combination("Full house Jacks and Deuces");
			combination.comb.addAll(jacks);
			combination.comb.addAll(deuces);
			
		}else
		if(tens.size() == 3 && aces.size() == 2) {
			combination = new Combination("Full house Tens and Aces");
			combination.comb.addAll(tens);
			combination.comb.addAll(aces);
			
		}else
		if(tens.size() == 3 && kings.size() == 2) {
			combination = new Combination("Full house Tens and Kings");
			combination.comb.addAll(tens);
			combination.comb.addAll(kings);
			
		}else
		if(tens.size() == 3 && queens.size() == 2) {
			combination = new Combination("Full house Tens and Queens");
			combination.comb.addAll(tens);
			combination.comb.addAll(queens);
			
		}else
		if(tens.size() == 3 && jacks.size() == 2) {
			combination = new Combination("Full house Tens and Jacks");
			combination.comb.addAll(tens);
			combination.comb.addAll(jacks);
			
		}else
		if(tens.size() == 3 && nines.size() >= 2) {
			combination = new Combination("Full house Tens and Nines");
			combination.comb.addAll(tens);
			combination.comb.addAll(nines);
			
		}else
		if(tens.size() == 3 && eights.size() >= 2) {
			combination = new Combination("Full house Tens and Eights");
			combination.comb.addAll(tens);
			combination.comb.addAll(eights);
			
		}else
		if(tens.size() == 3 && sevens.size() >= 2) {
			combination = new Combination("Full house Tens and Sevens");
			combination.comb.addAll(tens);
			combination.comb.addAll(sevens);
			
		}else
		if(tens.size() == 3 && sixes.size() >= 2) {
			combination = new Combination("Full house Tens and Sixes");
			combination.comb.addAll(tens);
			combination.comb.addAll(sixes);
			
		}else
		if(tens.size() == 3 && fives.size() >= 2) {
			combination = new Combination("Full house Tens and Fives");
			combination.comb.addAll(tens);
			combination.comb.addAll(fives);
			
		}else
		if(tens.size() == 3 && fours.size() >= 2) {
			combination = new Combination("Full house Tens and Fours");
			combination.comb.addAll(tens);
			combination.comb.addAll(fours);
			
		}else
		if(tens.size() == 3 && threes.size() >= 2) {
			combination = new Combination("Full house Tens and Threes");
			combination.comb.addAll(tens);
			combination.comb.addAll(threes);
			
		}else
		if(tens.size() == 3 && deuces.size() >= 2) {
			combination = new Combination("Full house Tens and Deuces");
			combination.comb.addAll(tens);
			combination.comb.addAll(deuces);
			
		}else
		if(nines.size() == 3 && aces.size() == 2) {
			combination = new Combination("Full house Nines and Aces");
			combination.comb.addAll(nines);
			combination.comb.addAll(aces);
			
		}else
		if(nines.size() == 3 && kings.size() == 2) {
			combination = new Combination("Full house Nines and Kings");
			combination.comb.addAll(nines);
			combination.comb.addAll(kings);
			
		}else
		if(nines.size() == 3 && queens.size() == 2) {
			combination = new Combination("Full house Nines and Queens");
			combination.comb.addAll(nines);
			combination.comb.addAll(queens);
			
		}else
		if(nines.size() == 3 && jacks.size() == 2) {
			combination = new Combination("Full house Nines and Jacks");
			combination.comb.addAll(nines);
			combination.comb.addAll(jacks);
			
		}else
		if(nines.size() == 3 && tens.size() == 2) {
			combination = new Combination("Full house Nines and Tens");
			combination.comb.addAll(nines);
			combination.comb.addAll(tens);
			
		}else
		if(nines.size() == 3 && eights.size() >= 2) {
			combination = new Combination("Full house Nines and Eights");
			combination.comb.addAll(nines);
			combination.comb.addAll(eights);
			
		}else
		if(nines.size() == 3 && sevens.size() >= 2) {
			combination = new Combination("Full house Nines and Sevens");
			combination.comb.addAll(nines);
			combination.comb.addAll(sevens);
			
		}else
		if(nines.size() == 3 && sixes.size() >= 2) {
			combination = new Combination("Full house Nines and Sixes");
			combination.comb.addAll(nines);
			combination.comb.addAll(sixes);
			
		}else
		if(nines.size() == 3 && fives.size() >= 2) {
			combination = new Combination("Full house Nines and Fives");
			combination.comb.addAll(nines);
			combination.comb.addAll(fives);
			
		}else
		if(nines.size() == 3 && fours.size() >= 2) {
			combination = new Combination("Full house Nines and Fours");
			combination.comb.addAll(nines);
			combination.comb.addAll(fours);
			
		}else
		if(nines.size() == 3 && threes.size() >= 2) {
			combination = new Combination("Full house Nines and Threes");
			combination.comb.addAll(nines);
			combination.comb.addAll(threes);
			
		}else
		if(nines.size() == 3 && deuces.size() >= 2) {
			combination = new Combination("Full house Nines and Deuces");
			combination.comb.addAll(nines);
			combination.comb.addAll(deuces);
			
		}else
		if(eights.size() == 3 && aces.size() == 2) {
			combination = new Combination("Full house Eights and Aces");
			combination.comb.addAll(eights);
			combination.comb.addAll(aces);
			
		}else
		if(eights.size() == 3 && kings.size() == 2) {
			combination = new Combination("Full house Eights and Kings");
			combination.comb.addAll(eights);
			combination.comb.addAll(kings);
			
		}else
		if(eights.size() == 3 && queens.size() == 2) {
			combination = new Combination("Full house Eights and Queens");
			combination.comb.addAll(eights);
			combination.comb.addAll(queens);
			
		}else
		if(eights.size() == 3 && jacks.size() == 2) {
			combination = new Combination("Full house Eights and Jacks");
			combination.comb.addAll(eights);
			combination.comb.addAll(jacks);
			
		}else
		if(eights.size() == 3 && tens.size() == 2) {
			combination = new Combination("Full house Eights and Tens");
			combination.comb.addAll(eights);
			combination.comb.addAll(tens);
			
		}else
		if(eights.size() == 3 && nines.size() == 2) {
			combination = new Combination("Full house Eights and Nines");
			combination.comb.addAll(eights);
			combination.comb.addAll(nines);
			
		}else
		if(eights.size() == 3 && sevens.size() >= 2) {
			combination = new Combination("Full house Eights and Sevens");
			combination.comb.addAll(eights);
			combination.comb.addAll(sevens);
			
		}else
		if(eights.size() == 3 && sixes.size() >= 2) {
			combination = new Combination("Full house Eights and Sixes");
			combination.comb.addAll(eights);
			combination.comb.addAll(sixes);
			
		}else
		if(eights.size() == 3 && fives.size() >= 2) {
			combination = new Combination("Full house Eights and Fives");
			combination.comb.addAll(eights);
			combination.comb.addAll(fives);
			
		}else
		if(eights.size() == 3 && fours.size() >= 2) {
			combination = new Combination("Full house Eights and Fours");
			combination.comb.addAll(eights);
			combination.comb.addAll(fours);
			
		}else
		if(eights.size() == 3 && threes.size() >= 2) {
			combination = new Combination("Full house Eights and Threes");
			combination.comb.addAll(eights);
			combination.comb.addAll(threes);
			
		}else
		if(eights.size() == 3 && deuces.size() >= 2) {
			combination = new Combination("Full house Eights and Deuces");
			combination.comb.addAll(eights);
			combination.comb.addAll(deuces);
			
		}else
		if(sevens.size() == 3 && aces.size() == 2) {
			combination = new Combination("Full house Sevens and Aces");
			combination.comb.addAll(sevens);
			combination.comb.addAll(aces);
			
		}else
		if(sevens.size() == 3 && kings.size() == 2) {
			combination = new Combination("Full house Sevens and Kings");
			combination.comb.addAll(sevens);
			combination.comb.addAll(kings);
			
		}else
		if(sevens.size() == 3 && queens.size() == 2) {
			combination = new Combination("Full house Sevens and Queens");
			combination.comb.addAll(sevens);
			combination.comb.addAll(queens);
			
		}else
		if(sevens.size() == 3 && jacks.size() == 2) {
			combination = new Combination("Full house Sevens and Jacks");
			combination.comb.addAll(sevens);
			combination.comb.addAll(jacks);
			
		}else
		if(sevens.size() == 3 && tens.size() == 2) {
			combination = new Combination("Full house Sevens and Tens");
			combination.comb.addAll(sevens);
			combination.comb.addAll(tens);
			
		}else
		if(sevens.size() == 3 && nines.size() == 2) {
			combination = new Combination("Full house Sevens and Nines");
			combination.comb.addAll(sevens);
			combination.comb.addAll(nines);
			
		}else
		if(sevens.size() == 3 && eights.size() == 2) {
			combination = new Combination("Full house Sevens and Eights");
			combination.comb.addAll(sevens);
			combination.comb.addAll(eights);
			
		}else
		if(sevens.size() == 3 && sixes.size() >= 2) {
			combination = new Combination("Full house Sevens and Sixes");
			combination.comb.addAll(sevens);
			combination.comb.addAll(sixes);
			
		}else
		if(sevens.size() == 3 && fives.size() >= 2) {
			combination = new Combination("Full house Sevens and Fives");
			combination.comb.addAll(sevens);
			combination.comb.addAll(fives);
			
		}else
		if(sevens.size() == 3 && fours.size() >= 2) {
			combination = new Combination("Full house Sevens and Fours");
			combination.comb.addAll(sevens);
			combination.comb.addAll(fours);
			
		}else
		if(sevens.size() == 3 && threes.size() >= 2) {
			combination = new Combination("Full house Sevens and Threes");
			combination.comb.addAll(sevens);
			combination.comb.addAll(threes);
			
		}else
		if(sevens.size() == 3 && deuces.size() >= 2) {
			combination = new Combination("Full house Sevens and Deuces");
			combination.comb.addAll(sevens);
			combination.comb.addAll(deuces);
			
		}else
		if(sixes.size() == 3 && aces.size() == 2) {
			combination = new Combination("Full house Sixes and Aces");
			combination.comb.addAll(sixes);
			combination.comb.addAll(aces);
			
		}else
		if(sixes.size() == 3 && kings.size() == 2) {
			combination = new Combination("Full house Sixes and Kings");
			combination.comb.addAll(sixes);
			combination.comb.addAll(kings);
			
		}else
		if(sixes.size() == 3 && queens.size() == 2) {
			combination = new Combination("Full house Sixes and Queens");
			combination.comb.addAll(sixes);
			combination.comb.addAll(queens);
			
		}else
		if(sixes.size() == 3 && jacks.size() == 2) {
			combination = new Combination("Full house Sixes and Jacks");
			combination.comb.addAll(sixes);
			combination.comb.addAll(jacks);
			
		}else
		if(sixes.size() == 3 && tens.size() == 2) {
			combination = new Combination("Full house Sixes and Tens");
			combination.comb.addAll(sixes);
			combination.comb.addAll(tens);
			
		}else
		if(sixes.size() == 3 && nines.size() == 2) {
			combination = new Combination("Full house Sixes and Nines");
			combination.comb.addAll(sixes);
			combination.comb.addAll(nines);
			
		}else
		if(sixes.size() == 3 && eights.size() == 2) {
			combination = new Combination("Full house Sixes and Eights");
			combination.comb.addAll(sixes);
			combination.comb.addAll(eights);
			
		}else
		if(sixes.size() == 3 && sevens.size() == 2) {
			combination = new Combination("Full house Sixes and Sevens");
			combination.comb.addAll(sixes);
			combination.comb.addAll(sevens);
			
		}else
		if(sixes.size() == 3 && fives.size() >= 2) {
			combination = new Combination("Full house Sixes and Fives");
			combination.comb.addAll(sixes);
			combination.comb.addAll(fives);
			
		}else
		if(sixes.size() == 3 && fours.size() >= 2) {
			combination = new Combination("Full house Sixes and Fours");
			combination.comb.addAll(sixes);
			combination.comb.addAll(fours);
			
		}else
		if(sixes.size() == 3 && threes.size() >= 2) {
			combination = new Combination("Full house Sixes and Threes");
			combination.comb.addAll(sixes);
			combination.comb.addAll(threes);
			
		}else
		if(sixes.size() == 3 && deuces.size() >= 2) {
			combination = new Combination("Full house Sixes and Deuces");
			combination.comb.addAll(sixes);
			combination.comb.addAll(deuces);
			
		}else
		if(fives.size() == 3 && aces.size() == 2) {
			combination = new Combination("Full house Fives and Aces");
			combination.comb.addAll(fives);
			combination.comb.addAll(aces);
			
		}else
		if(fives.size() == 3 && kings.size() == 2) {
			combination = new Combination("Full house Fives and Kings");
			combination.comb.addAll(fives);
			combination.comb.addAll(kings);
			
		}else
		if(fives.size() == 3 && queens.size() == 2) {
			combination = new Combination("Full house Fives and Queens");
			combination.comb.addAll(fives);
			combination.comb.addAll(queens);
			
		}else
		if(fives.size() == 3 && jacks.size() == 2) {
			combination = new Combination("Full house Fives and Jacks");
			combination.comb.addAll(fives);
			combination.comb.addAll(jacks);
			
		}else
		if(fives.size() == 3 && tens.size() == 2) {
			combination = new Combination("Full house Fives and Tens");
			combination.comb.addAll(fives);
			combination.comb.addAll(tens);
			
		}else
		if(fives.size() == 3 && nines.size() == 2) {
			combination = new Combination("Full house Fives and Nines");
			combination.comb.addAll(fives);
			combination.comb.addAll(nines);
			
		}else
		if(fives.size() == 3 && eights.size() == 2) {
			combination = new Combination("Full house Fives and Eights");
			combination.comb.addAll(fives);
			combination.comb.addAll(eights);
			
		}else
		if(fives.size() == 3 && sevens.size() == 2) {
			combination = new Combination("Full house Fives and Sevens");
			combination.comb.addAll(fives);
			combination.comb.addAll(sevens);
			
		}else
		if(fives.size() == 3 && sixes.size() == 2) {
			combination = new Combination("Full house Fives and Sixes");
			combination.comb.addAll(fives);
			combination.comb.addAll(sixes);
			
		}else
		if(fives.size() == 3 && fours.size() >= 2) {
			combination = new Combination("Full house Fives and Fours");
			combination.comb.addAll(fives);
			combination.comb.addAll(fours);
			
		}else
		if(fives.size() == 3 && threes.size() >= 2) {
			combination = new Combination("Full house Fives and Threes");
			combination.comb.addAll(fives);
			combination.comb.addAll(threes);
			
		}else
		if(fives.size() == 3 && deuces.size() >= 2) {
			combination = new Combination("Full house Fives and Deuces");
			combination.comb.addAll(fives);
			combination.comb.addAll(deuces);
			
		}else
		if(fours.size() == 3 && aces.size() == 2) {
			combination = new Combination("Full house Fours and Aces");
			combination.comb.addAll(fours);
			combination.comb.addAll(aces);
			
		}else
		if(fours.size() == 3 && kings.size() == 2) {
			combination = new Combination("Full house Fours and Kings");
			combination.comb.addAll(fours);
			combination.comb.addAll(kings);
			
		}else
		if(fours.size() == 3 && queens.size() == 2) {
			combination = new Combination("Full house Fours and Queens");
			combination.comb.addAll(fours);
			combination.comb.addAll(queens);
			
		}else
		if(fours.size() == 3 && jacks.size() == 2) {
			combination = new Combination("Full house Fours and Jacks");
			combination.comb.addAll(fours);
			combination.comb.addAll(jacks);
			
		}else
		if(fours.size() == 3 && tens.size() == 2) {
			combination = new Combination("Full house Fours and Tens");
			combination.comb.addAll(fours);
			combination.comb.addAll(tens);
			
		}else
		if(fours.size() == 3 && nines.size() == 2) {
			combination = new Combination("Full house Fours and Nines");
			combination.comb.addAll(fours);
			combination.comb.addAll(nines);
			
		}else
		if(fours.size() == 3 && eights.size() == 2) {
			combination = new Combination("Full house Fours and Eights");
			combination.comb.addAll(fours);
			combination.comb.addAll(eights);
			
		}else
		if(fours.size() == 3 && sevens.size() == 2) {
			combination = new Combination("Full house Fours and Sevens");
			combination.comb.addAll(fours);
			combination.comb.addAll(sevens);
			
		}else
		if(fours.size() == 3 && sixes.size() == 2) {
			combination = new Combination("Full house Fours and Sixes");
			combination.comb.addAll(fours);
			combination.comb.addAll(sixes);
			
		}else
		if(fours.size() == 3 && fives.size() == 2) {
			combination = new Combination("Full house Fours and Fives");
			combination.comb.addAll(fours);
			combination.comb.addAll(fives);
		
		}else
		if(fours.size() == 3 && threes.size() >= 2) {
			combination = new Combination("Full house Fours and Threes");
			combination.comb.addAll(fours);
			combination.comb.addAll(threes);
			
		}else
		if(fours.size() == 3 && deuces.size() >= 2) {
			combination = new Combination("Full house Fours and Deuces");
			combination.comb.addAll(fours);
			combination.comb.addAll(deuces);
			
		}else
		if(threes.size() == 3 && aces.size() == 2) {
			combination = new Combination("Full house Threes and Aces");
			combination.comb.addAll(threes);
			combination.comb.addAll(aces);
			
		}else
		if(threes.size() == 3 && kings.size() == 2) {
			combination = new Combination("Full house Threes and Kings");
			combination.comb.addAll(threes);
			combination.comb.addAll(kings);
			
		}else
		if(threes.size() == 3 && queens.size() == 2) {
			combination = new Combination("Full house Threes and Queens");
			combination.comb.addAll(threes);
			combination.comb.addAll(queens);
			
		}else
		if(threes.size() == 3 && jacks.size() == 2) {
			combination = new Combination("Full house Threes and Jacks");
			combination.comb.addAll(threes);
			combination.comb.addAll(jacks);
			
		}else
		if(threes.size() == 3 && tens.size() == 2) {
			combination = new Combination("Full house Threes and Tens");
			combination.comb.addAll(threes);
			combination.comb.addAll(tens);
			
		}else
		if(threes.size() == 3 && nines.size() == 2) {
			combination = new Combination("Full house Threes and Nines");
			combination.comb.addAll(threes);
			combination.comb.addAll(nines);
			
		}else
		if(threes.size() == 3 && eights.size() == 2) {
			combination = new Combination("Full house Threes and Eights");
			combination.comb.addAll(threes);
			combination.comb.addAll(eights);
			
		}else
		if(threes.size() == 3 && sevens.size() == 2) {
			combination = new Combination("Full house Threes and Sevens");
			combination.comb.addAll(threes);
			combination.comb.addAll(sevens);
			
		}else
		if(threes.size() == 3 && sixes.size() == 2) {
			combination = new Combination("Full house Threes and Sixes");
			combination.comb.addAll(threes);
			combination.comb.addAll(sixes);
			
		}else
		if(threes.size() == 3 && fives.size() == 2) {
			combination = new Combination("Full house Threes and Fives");
			combination.comb.addAll(threes);
			combination.comb.addAll(fives);
			
		}else
		if(threes.size() == 3 && fours.size() == 2) {
			combination = new Combination("Full house Threes and Fours");
			combination.comb.addAll(threes);
			combination.comb.addAll(fours);
			
		}else
		if(threes.size() == 3 && deuces.size() >= 2) {
			combination = new Combination("Full house Threes and Deuces");
			combination.comb.addAll(threes);
			combination.comb.addAll(deuces);
			
		}else
		if(deuces.size() == 3 && aces.size() == 2) {
			combination = new Combination("Full house Deuces and Aces");
			combination.comb.addAll(deuces);
			combination.comb.addAll(aces);
			
		}else
		if(deuces.size() == 3 && kings.size() == 2) {
			combination = new Combination("Full house Deuces and Kings");
			combination.comb.addAll(deuces);
			combination.comb.addAll(kings);
			
		}else
		if(deuces.size() == 3 && queens.size() == 2) {
			combination = new Combination("Full house Deuces and Queens");
			combination.comb.addAll(deuces);
			combination.comb.addAll(queens);
			
		}else
		if(deuces.size() == 3 && jacks.size() == 2) {
			combination = new Combination("Full house Deuces and Jacks");
			combination.comb.addAll(deuces);
			combination.comb.addAll(jacks);
			
		}else
		if(deuces.size() == 3 && tens.size() == 2) {
			combination = new Combination("Full house Deuces and Tens");
			combination.comb.addAll(deuces);
			combination.comb.addAll(tens);
			
		}else
		if(deuces.size() == 3 && nines.size() == 2) {
			combination = new Combination("Full house Deuces and Nines");
			combination.comb.addAll(deuces);
			combination.comb.addAll(nines);
			
		}else
		if(deuces.size() == 3 && eights.size() == 2) {
			combination = new Combination("Full house Deuces and Eights");
			combination.comb.addAll(deuces);
			combination.comb.addAll(eights);
			
		}else
		if(deuces.size() == 3 && sevens.size() == 2) {
			combination = new Combination("Full house Deuces and Sevens");
			combination.comb.addAll(deuces);
			combination.comb.addAll(sevens);
			
		}else
		if(deuces.size() == 3 && sixes.size() == 2) {
			combination = new Combination("Full house Deuces and Sixes");
			combination.comb.addAll(deuces);
			combination.comb.addAll(sixes);
			
		}else
		if(deuces.size() == 3 && fives.size() == 2) {
			combination = new Combination("Full house Deuces and Fives");
			combination.comb.addAll(deuces);
			combination.comb.addAll(fives);
			
		}else
		if(deuces.size() == 3 && fours.size() == 2) {
			combination = new Combination("Full house Deuces and Fours");
			combination.comb.addAll(deuces);
			combination.comb.addAll(fours);
			
		}else
		if(deuces.size() == 3 && threes.size() == 2) {
			combination = new Combination("Full house Deuces and Threes");
			combination.comb.addAll(deuces);
			combination.comb.addAll(threes);
			
		}else
			
			//place for flush
			
		if(max == 14) {
			
			if(hearts.size() >= 5) {
				combination = new Combination("Flush, Ace");
				
				for(int i = 0; i < 5; i++) {
					combination.comb.add(hearts.get(i));
				}
			}else
			if(diamonds.size() >= 5) {
				combination = new Combination("Flush, Ace");
				
				for(int i = 0; i < 5; i++) {
					combination.comb.add(diamonds.get(i));
				}
			}else
			if(crosses.size() >= 5) {
				combination = new Combination("Flush, Ace");
				
				for(int i = 0; i < 5; i++) {
					combination.comb.add(crosses.get(i));
				}
			}else
			if(spades.size() >= 5) {
				combination = new Combination("Flush, Ace");
					
			    for(int i = 0; i < 5; i++) {
						combination.comb.add(spades.get(i));
					}
				}
			
		}else
		if(max == 13) {
			
			if(hearts.size() >= 5) {
				combination = new Combination("Flush, King");
				
				for(int i = 0; i < 5; i++) {
					combination.comb.add(hearts.get(i));
				}
			}else
			if(diamonds.size() >= 5) {
				combination = new Combination("Flush, King");
				
				for(int i = 0; i < 5; i++) {
					combination.comb.add(diamonds.get(i));
				}
			}else
			if(crosses.size() >= 5) {
				combination = new Combination("Flush, King");
				
				for(int i = 0; i < 5; i++) {
					combination.comb.add(crosses.get(i));
				}
			}else
			if(spades.size() >= 5) {
				combination = new Combination("Flush, King");
					
					for(int i = 0; i < 5; i++) {
						combination.comb.add(spades.get(i));
					}
				}
			
		}else
		if(max == 12) {
			
			if(hearts.size() >= 5) {
				combination = new Combination("Flush, Queen");
				
				for(int i = 0; i < 5; i++) {
					combination.comb.add(hearts.get(i));
				}
			}else
			if(diamonds.size() >= 5) {
				combination = new Combination("Flush, Queen");
				
				for(int i = 0; i < 5; i++) {
					combination.comb.add(diamonds.get(i));
				}
			}else
			if(crosses.size() >= 5) {
				combination = new Combination("Flush, Queen");
				
				for(int i = 0; i < 5; i++) {
					combination.comb.add(crosses.get(i));
				}
			}else
			if(spades.size() >= 5) {
				combination = new Combination("Flush, Queen");
					
					for(int i = 0; i < 5; i++) {
						combination.comb.add(spades.get(i));
					}
				}
			
		}else
		if(max == 11) {
			if(hearts.size() >= 5) {
				combination = new Combination("Flush, Jack");
				
				for(int i = 0; i < 5; i++) {
					combination.comb.add(hearts.get(i));
				}
			}else
			if(diamonds.size() >= 5) {
				combination = new Combination("Flush, Jack");
				
				for(int i = 0; i < 5; i++) {
					combination.comb.add(diamonds.get(i));
				}
			}else
			if(crosses.size() >= 5) {
				combination = new Combination("Flush, Jack");
				
				for(int i = 0; i < 5; i++) {
					combination.comb.add(crosses.get(i));
				}
			}else
			if(spades.size() >= 5) {
				combination = new Combination("Flush, Jack");
					
					for(int i = 0; i < 5; i++) {
						combination.comb.add(spades.get(i));
					}
				}
			
		}else
		if(max == 10) {
			
			if(hearts.size() >= 5) {
				combination = new Combination("Flush, 10");
				
				for(int i = 0; i < 5; i++) {
					combination.comb.add(hearts.get(i));
				}
			}else
			if(diamonds.size() >= 5) {
				combination = new Combination("Flush, 10");
				
				for(int i = 0; i < 5; i++) {
					combination.comb.add(diamonds.get(i));
				}
			}else
			if(crosses.size() >= 5) {
				combination = new Combination("Flush, 10");
				
				for(int i = 0; i < 5; i++) {
					combination.comb.add(crosses.get(i));
				}
			}else
			if(spades.size() >= 5) {
				combination = new Combination("Flush, 10");
					
					for(int i = 0; i < 5; i++) {
						combination.comb.add(spades.get(i));
					}
				}
			
		}else
		if(max == 9) {
			
			if(hearts.size() >= 5) {
				combination = new Combination("Flush, 9");
				
				for(int i = 0; i < 5; i++) {
					combination.comb.add(hearts.get(i));
				}
			}else
			if(diamonds.size() >= 5) {
				combination = new Combination("Flush, 9");
				
				for(int i = 0; i < 5; i++) {
					combination.comb.add(diamonds.get(i));
				}
			}else
			if(crosses.size() >= 5) {
				combination = new Combination("Flush, 9");
				
				for(int i = 0; i < 5; i++) {
					combination.comb.add(crosses.get(i));
				}
			}else
			if(spades.size() >= 5) {
				combination = new Combination("Flush, 9");
					
					for(int i = 0; i < 5; i++) {
						combination.comb.add(spades.get(i));
					}
				}
			
		}else
		if(max == 8) {
			combination = new Combination("Flush, 8");
			if(hearts.size() >= 5) {
				
				for(int i = 0; i < 5; i++) {
					combination.comb.add(hearts.get(i));
				}
			}else
			
			if(diamonds.size() >= 5) {
				combination = new Combination("Flush, 8");
				
				for(int i = 0; i < 5; i++) {
					combination.comb.add(diamonds.get(i));
				}
			}else
			
			if(crosses.size() >= 5) {
				combination = new Combination("Flush, 8");
				
				for(int i = 0; i < 5; i++) {
					combination.comb.add(crosses.get(i));
				}
			}else
			
			if(spades.size() >= 5) {
				combination = new Combination("Flush, 8");
					
					for(int i = 0; i < 5; i++) {
						combination.comb.add(spades.get(i));
					}
				}
			
		}else
		if(max == 7) {
			
			if(hearts.size() >= 5) {
				combination = new Combination("Flush, 7");
				
				for(int i = 0; i < 5; i++) {
					combination.comb.add(hearts.get(i));
				}
			}else
			
			if(diamonds.size() >= 5) {
				combination = new Combination("Flush, 7");
				
				for(int i = 0; i < 5; i++) {
					combination.comb.add(diamonds.get(i));
				}
			}else
			
			if(crosses.size() >= 5) {
				combination = new Combination("Flush, 7");
				
				for(int i = 0; i < 5; i++) {
					combination.comb.add(crosses.get(i));
				}
			}else
			
			if(spades.size() >= 5) {
				combination = new Combination("Flush, 7");
					
					for(int i = 0; i < 5; i++) {
						combination.comb.add(spades.get(i));
					}
				}
			
		}else
		
	
			//place for straight
		if(checkStraight.containsAll(straightToAce) & straight == false) {
			
			combination  = new Combination("Straight, Ace");						
			combination.comb.add(tens.get(0));
			combination.comb.add(jacks.get(0));
			combination.comb.add(queens.get(0));
			combination.comb.add(kings.get(0));
			combination.comb.add(aces.get(0));
			
			
			
		}else
		if(checkStraight.containsAll(straightToKing) & straight == false) {
			
			combination  = new Combination("Straight, King");						
			combination.comb.add(nines.get(0));
			combination.comb.add(tens.get(0));
			combination.comb.add(jacks.get(0));
			combination.comb.add(queens.get(0));
			combination.comb.add(kings.get(0));
			
			
			
		}else
		if(checkStraight.containsAll(straightToQueen) & straight == false) {
			
			combination  = new Combination("Straight, Queen");						
			combination.comb.add(eights.get(0));
			combination.comb.add(nines.get(0));
			combination.comb.add(tens.get(0));
			combination.comb.add(jacks.get(0));
			combination.comb.add(queens.get(0));
			
			
			
		}else
		if(checkStraight.containsAll(straightToJack) & straight == false) {
			
			combination  = new Combination("Straight, Jack");						
			combination.comb.add(sevens.get(0));
			combination.comb.add(eights.get(0));
			combination.comb.add(nines.get(0));
			combination.comb.add(tens.get(0));
			combination.comb.add(jacks.get(0));
			
			
			
		}else
		if(checkStraight.containsAll(straightTo10) & straight == false) {
			
			combination  = new Combination("Straight, 10");						
			combination.comb.add(sixes.get(0));
			combination.comb.add(sevens.get(0));
			combination.comb.add(eights.get(0));
			combination.comb.add(nines.get(0));
			combination.comb.add(tens.get(0));
			
			
			
		}else
		if(checkStraight.containsAll(straightTo9) & straight == false) {
			
			combination  = new Combination("Straight, 9");						
			combination.comb.add(fives.get(0));
			combination.comb.add(sixes.get(0));
			combination.comb.add(sevens.get(0));
			combination.comb.add(eights.get(0));
			combination.comb.add(nines.get(0));
			
			
			
		}else
			if(checkStraight.containsAll(straightTo8) & straight == false) {
			
				combination  = new Combination("Straight, 8");						
				combination.comb.add(fours.get(0));
				combination.comb.add(fives.get(0));
				combination.comb.add(sixes.get(0));
				combination.comb.add(sevens.get(0));
				combination.comb.add(eights.get(0));
			
			
			
		}else
		if(checkStraight.containsAll(straightTo7) & straight == false) {
			
			combination  = new Combination("Straight, 7");			
			combination.comb.add(threes.get(0));
			combination.comb.add(fours.get(0));
			combination.comb.add(fives.get(0));
			combination.comb.add(sixes.get(0));
			combination.comb.add(sevens.get(0));
			
			
			
		}else
		if(checkStraight.containsAll(straightTo6) & straight == false) {
			
			combination  = new Combination("Straight, 6");			
			combination.comb.add(deuces.get(0));
			combination.comb.add(threes.get(0));
			combination.comb.add(fours.get(0));
			combination.comb.add(fives.get(0));
			combination.comb.add(sixes.get(0));
			
			
			
		}else
		if(checkStraight.containsAll(straightTo5) & straight == false) {
			
			combination  = new Combination("Straight, 5");
			combination.comb.add(aces.get(0));
			combination.comb.add(deuces.get(0));
			combination.comb.add(threes.get(0));
			combination.comb.add(fours.get(0));
			combination.comb.add(fives.get(0));
			
			
			
		}else
		if(aces.size() == 3) {
			
			combination  = new Combination("Three of a kind Aces");
			combination.comb.addAll(aces);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 14) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(kings.size() == 3) {
			
			combination  = new Combination("Three of a kind Kings");
			combination.comb.addAll(kings);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 13) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(queens.size() == 3) {
			
			combination  = new Combination("Three of a kind Queens");
			combination.comb.addAll(queens);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 12) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(jacks.size() == 3) {
			
			combination  = new Combination("Three of a kind Jacks");
			combination.comb.addAll(jacks);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 11) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(tens.size() == 3) {
			
			combination  = new Combination("Three of a kind Tens");
			combination.comb.addAll(tens);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 10) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(nines.size() == 3) {
			
			combination  = new Combination("Three of a kind Nines");
			combination.comb.addAll(nines);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 9) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(eights.size() == 3) {
			
			combination  = new Combination("Three of a kind Eights");
			combination.comb.addAll(eights);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 8) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(sevens.size() == 3) {
			
			combination  = new Combination("Three of a kind Sevens");
			combination.comb.addAll(sevens);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 7) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(sixes.size() == 3) {
			
			combination  = new Combination("Three of a kind Sixes");
			combination.comb.addAll(sixes);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 6) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(fives.size() == 3) {
			
			combination  = new Combination("Three of a kind Fives");
			combination.comb.addAll(fives);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 5) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(fours.size() == 3) {
			
			combination  = new Combination("Three of a kind Fours");
			combination.comb.addAll(fours);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 4) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(threes.size() == 3) {
			
			combination  = new Combination("Three of a kind Threes");
			combination.comb.addAll(threes);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 3) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(deuces.size() == 3) {
			
			combination  = new Combination("Three of a kind Deuces");
			combination.comb.addAll(deuces);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 2) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(aces.size() == 2 && kings.size() == 2) {
			
			combination  = new Combination("Two pairs Aces and Kings");
			combination.comb.addAll(aces);
			combination.comb.addAll(kings);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 14 && list.get(i).getValue() != 13) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(aces.size() == 2 && queens.size() == 2) {
			
			combination  = new Combination("Two pairs Aces and Queens");
			combination.comb.addAll(aces);
			combination.comb.addAll(queens);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 14 && list.get(i).getValue() != 12) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(aces.size() == 2 && jacks.size() == 2) {
			
			combination  = new Combination("Two pairs Aces and Jacks");
			combination.comb.addAll(aces);
			combination.comb.addAll(jacks);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 14 && list.get(i).getValue() != 11) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(aces.size() == 2 && tens.size() == 2) {
			
			combination  = new Combination("Two pairs Aces and Tens");
			combination.comb.addAll(aces);
			combination.comb.addAll(tens);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 14 && list.get(i).getValue() != 10) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(aces.size() == 2 && nines.size() == 2) {
			
			combination  = new Combination("Two pairs Aces and Nines");
			combination.comb.addAll(aces);
			combination.comb.addAll(nines);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 14 && list.get(i).getValue() != 9) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(aces.size() == 2 && eights.size() == 2) {
			
			combination  = new Combination("Two pairs Aces and Eights");
			combination.comb.addAll(aces);
			combination.comb.addAll(eights);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 14 && list.get(i).getValue() != 8) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(aces.size() == 2 && sevens.size() == 2) {
			
			combination  = new Combination("Two pairs Aces and Sevens");
			combination.comb.addAll(aces);
			combination.comb.addAll(sevens);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 14 && list.get(i).getValue() != 7) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(aces.size() == 2 && sixes.size() == 2) {
			
			combination  = new Combination("Two pairs Aces and Sixes");
			combination.comb.addAll(aces);
			combination.comb.addAll(sixes);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 14 && list.get(i).getValue() != 6) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(aces.size() == 2 && fives.size() == 2) {
			
			combination  = new Combination("Two pairs Aces and Fives");
			combination.comb.addAll(aces);
			combination.comb.addAll(fives);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 14 && list.get(i).getValue() != 5) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(aces.size() == 2 && fours.size() == 2) {
			
			combination  = new Combination("Two pairs Aces and Fours");
			combination.comb.addAll(aces);
			combination.comb.addAll(fours);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 14 && list.get(i).getValue() != 4) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(aces.size() == 2 && threes.size() == 2) {
			
			combination  = new Combination("Two pairs Aces and Threes");
			combination.comb.addAll(aces);
			combination.comb.addAll(threes);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 14 && list.get(i).getValue() != 3) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(aces.size() == 2 && deuces.size() == 2) {
			
			combination  = new Combination("Two pairs Aces and Deuces");
			combination.comb.addAll(aces);
			combination.comb.addAll(deuces);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 14 && list.get(i).getValue() != 2) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(kings.size() == 2 && queens.size() == 2) {
			
			combination  = new Combination("Two pairs Kings and Queens");
			combination.comb.addAll(kings);
			combination.comb.addAll(queens);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 13 && list.get(i).getValue() != 12) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(kings.size() == 2 && jacks.size() == 2) {
			
			combination  = new Combination("Two pairs Kings and Jacks");
			combination.comb.addAll(kings);
			combination.comb.addAll(jacks);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 13 && list.get(i).getValue() != 11) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(kings.size() == 2 && tens.size() == 2) {
			
			combination  = new Combination("Two pairs Kings and Tens");
			combination.comb.addAll(kings);
			combination.comb.addAll(tens);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 13 && list.get(i).getValue() != 10) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(kings.size() == 2 && nines.size() == 2) {
			
			combination  = new Combination("Two pairs Kings and Nines");
			combination.comb.addAll(kings);
			combination.comb.addAll(nines);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 13 && list.get(i).getValue() != 9) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(kings.size() == 2 && eights.size() == 2) {
			
			combination  = new Combination("Two pairs Kings and Eights");
			combination.comb.addAll(kings);
			combination.comb.addAll(eights);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 13 && list.get(i).getValue() != 8) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(kings.size() == 2 && sevens.size() == 2) {
			
			combination  = new Combination("Two pairs Kings and Sevens");
			combination.comb.addAll(kings);
			combination.comb.addAll(sevens);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 13 && list.get(i).getValue() != 7) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(kings.size() == 2 && sixes.size() == 2) {
			
			combination  = new Combination("Two pairs Kings and Sixes");
			combination.comb.addAll(kings);
			combination.comb.addAll(sixes);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 13 && list.get(i).getValue() != 6) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(kings.size() == 2 && fives.size() == 2) {
			
			combination  = new Combination("Two pairs Kings and Fixes");
			combination.comb.addAll(kings);
			combination.comb.addAll(fives);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 13 && list.get(i).getValue() != 5) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(kings.size() == 2 && fours.size() == 2) {
			
			combination  = new Combination("Two pairs Kings and Fours");
			combination.comb.addAll(kings);
			combination.comb.addAll(fours);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 13 && list.get(i).getValue() != 4) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(kings.size() == 2 && threes.size() == 2) {
			
			combination  = new Combination("Two pairs Kings and Threes");
			combination.comb.addAll(kings);
			combination.comb.addAll(threes);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 13 && list.get(i).getValue() != 3) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(kings.size() == 2 && deuces.size() == 2) {
			
			combination  = new Combination("Two pairs Kings and Deuces");
			combination.comb.addAll(kings);
			combination.comb.addAll(deuces);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 13 && list.get(i).getValue() != 2) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(queens.size() == 2 && jacks.size() == 2) {
			
			combination  = new Combination("Two pairs Queens and Jacks");
			combination.comb.addAll(queens);
			combination.comb.addAll(jacks);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 12 && list.get(i).getValue() != 11) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(queens.size() == 2 && tens.size() == 2) {
			
			combination  = new Combination("Two pairs Queens and Tens");
			combination.comb.addAll(queens);
			combination.comb.addAll(tens);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 12 && list.get(i).getValue() != 10) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(queens.size() == 2 && nines.size() == 2) {
			
			combination  = new Combination("Two pairs Queens and Nines");
			combination.comb.addAll(queens);
			combination.comb.addAll(nines);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 12 && list.get(i).getValue() != 9) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(queens.size() == 2 && eights.size() == 2) {
			
			combination  = new Combination("Two pairs Queens and Eights");
			combination.comb.addAll(queens);
			combination.comb.addAll(eights);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 12 && list.get(i).getValue() != 8) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(queens.size() == 2 && sevens.size() == 2) {
			
			combination  = new Combination("Two pairs Queens and Sevens");
			combination.comb.addAll(queens);
			combination.comb.addAll(sevens);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 12 && list.get(i).getValue() != 7) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(queens.size() == 2 && sixes.size() == 2) {
			
			combination  = new Combination("Two pairs Queens and Sixes");
			combination.comb.addAll(queens);
			combination.comb.addAll(sixes);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 12 && list.get(i).getValue() != 6) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(queens.size() == 2 && fives.size() == 2) {
			
			combination  = new Combination("Two pairs Queens and Fives");
			combination.comb.addAll(queens);
			combination.comb.addAll(fives);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 12 && list.get(i).getValue() != 5) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(queens.size() == 2 && fours.size() == 2) {
			
			combination  = new Combination("Two pairs Queens and Fours");
			combination.comb.addAll(queens);
			combination.comb.addAll(fours);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 12 && list.get(i).getValue() != 4) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(queens.size() == 2 && threes.size() == 2) {
			
			combination  = new Combination("Two pairs Queens and Threes");
			combination.comb.addAll(queens);
			combination.comb.addAll(threes);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 12 && list.get(i).getValue() != 3) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(queens.size() == 2 && deuces.size() == 2) {
			
			combination  = new Combination("Two pairs Queens and Deuces");
			combination.comb.addAll(queens);
			combination.comb.addAll(deuces);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 12 && list.get(i).getValue() != 2) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(jacks.size() == 2 && tens.size() == 2) {
			
			combination  = new Combination("Two pairs Jacks and Tens");
			combination.comb.addAll(jacks);
			combination.comb.addAll(tens);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 11 && list.get(i).getValue() != 10) {
					combination.comb.add(list.get(i));
				}
			}
		
		}else
		if(jacks.size() == 2 && nines.size() == 2) {
			
			combination  = new Combination("Two pairs Jacks and Nines");
			combination.comb.addAll(jacks);
			combination.comb.addAll(nines);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 11 && list.get(i).getValue() != 9) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(jacks.size() == 2 && eights.size() == 2) {
			
			combination  = new Combination("Two pairs Jacks and Eights");
			combination.comb.addAll(jacks);
			combination.comb.addAll(eights);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 11 && list.get(i).getValue() != 8) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(jacks.size() == 2 && sevens.size() == 2) {
			
			combination  = new Combination("Two pairs Jacks and Sevens");
			combination.comb.addAll(jacks);
			combination.comb.addAll(sevens);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 11 && list.get(i).getValue() != 7) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(jacks.size() == 2 && sixes.size() == 2) {
			
			combination  = new Combination("Two pairs Jacks and Sixes");
			combination.comb.addAll(jacks);
			combination.comb.addAll(sixes);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 11 && list.get(i).getValue() != 6) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(jacks.size() == 2 && fives.size() == 2) {
			
			combination  = new Combination("Two pairs Jacks and Fives");
			combination.comb.addAll(jacks);
			combination.comb.addAll(fives);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 11 && list.get(i).getValue() != 5) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(jacks.size() == 2 && fours.size() == 2) {
			
			combination  = new Combination("Two pairs Jacks and Fours");
			combination.comb.addAll(jacks);
			combination.comb.addAll(fours);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 11 && list.get(i).getValue() != 4) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(jacks.size() == 2 && threes.size() == 2) {
			
			combination  = new Combination("Two pairs Jacks and Threes");
			combination.comb.addAll(jacks);
			combination.comb.addAll(threes);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 11 && list.get(i).getValue() != 3) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(jacks.size() == 2 && deuces.size() == 2) {
			
			combination  = new Combination("Two pairs Jacks and Deuces");
			combination.comb.addAll(jacks);
			combination.comb.addAll(deuces);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 11 && list.get(i).getValue() != 2) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(tens.size() == 2 && nines.size() == 2) {
			
			combination  = new Combination("Two pairs Tens and Nines");
			combination.comb.addAll(tens);
			combination.comb.addAll(nines);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 10 && list.get(i).getValue() != 9) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(tens.size() == 2 & eights.size() == 2) {
			
			combination  = new Combination("Two pairs Tens and Eights");
			combination.comb.addAll(tens);
			combination.comb.addAll(eights);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 10 && list.get(i).getValue() != 8) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(tens.size() == 2 && sevens.size() == 2) {
			
			combination  = new Combination("Two pairs Tens and Sevens");
			combination.comb.addAll(tens);
			combination.comb.addAll(sevens);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 10 && list.get(i).getValue() != 7) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(tens.size() == 2 && sixes.size() == 2) {
			
			combination  = new Combination("Two pairs Tens and Sixes");
			combination.comb.addAll(tens);
			combination.comb.addAll(sixes);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 10 && list.get(i).getValue() != 6) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(tens.size() == 2 && fives.size() == 2) {
			
			combination  = new Combination("Two pairs Tens and Fives");
			combination.comb.addAll(tens);
			combination.comb.addAll(fives);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 10 && list.get(i).getValue() != 5) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(tens.size() == 2 && fours.size() == 2) {
			
			combination  = new Combination("Two pairs Tens and Fours");
			combination.comb.addAll(tens);
			combination.comb.addAll(fours);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 10 && list.get(i).getValue() != 4) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(tens.size() == 2 && threes.size() == 2) {
			
			combination  = new Combination("Two pairs Tens and Threes");
			combination.comb.addAll(tens);
			combination.comb.addAll(threes);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 10 && list.get(i).getValue() != 3) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(tens.size() == 2 && deuces.size() == 2) {
			
			combination  = new Combination("Two pairs Tens and Deuces");
			combination.comb.addAll(tens);
			combination.comb.addAll(deuces);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 10 && list.get(i).getValue() != 2) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(nines.size() == 2 && eights.size() == 2) {
			
			combination  = new Combination("Two pairs Nines and Eights");
			combination.comb.addAll(nines);
			combination.comb.addAll(eights);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 9 && list.get(i).getValue() != 8) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(nines.size() == 2 && sevens.size() == 2) {
			
			combination  = new Combination("Two pairs Nines and Sevens");
			combination.comb.addAll(nines);
			combination.comb.addAll(sevens);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 9 && list.get(i).getValue() != 7) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(nines.size() == 2 && sixes.size() == 2) {
			
			combination  = new Combination("Two pairs Nines and Sixes");
			combination.comb.addAll(nines);
			combination.comb.addAll(sixes);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 9 && list.get(i).getValue() != 6) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(nines.size() == 2 && fives.size() == 2) {
			
			combination  = new Combination("Two pairs Nines and Fives");
			combination.comb.addAll(nines);
			combination.comb.addAll(fives);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 9 && list.get(i).getValue() != 5) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(nines.size() == 2 && fours.size() == 2) {
			
			combination  = new Combination("Two pairs Nines and Fours");
			combination.comb.addAll(nines);
			combination.comb.addAll(fours);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 9 && list.get(i).getValue() != 4) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(nines.size() == 2 && threes.size() == 2) {
			
			combination  = new Combination("Two pairs Nines and Threes");
			combination.comb.addAll(nines);
			combination.comb.addAll(threes);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 9 && list.get(i).getValue() != 3) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(nines.size() == 2 && deuces.size() == 2) {
			
			combination  = new Combination("Two pairs Nines and Deuces");
			combination.comb.addAll(nines);
			combination.comb.addAll(deuces);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 9 && list.get(i).getValue() != 2) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(eights.size() == 2 && sevens.size() == 2) {
			
			combination  = new Combination("Two pairs Eights and Sevens");
			combination.comb.addAll(eights);
			combination.comb.addAll(sevens);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 8 && list.get(i).getValue() != 7) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(eights.size() == 2 && sixes.size() == 2) {
			
			combination  = new Combination("Two pairs Eights and Sixes");
			combination.comb.addAll(eights);
			combination.comb.addAll(sixes);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 8 && list.get(i).getValue() != 6) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(eights.size() == 2 && fives.size() == 2) {
			
			combination  = new Combination("Two pairs Eights and Fives");
			combination.comb.addAll(eights);
			combination.comb.addAll(fives);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 8 && list.get(i).getValue() != 5) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(eights.size() == 2 && fours.size() == 2) {
			
			combination  = new Combination("Two pairs Eights and Fours");
			combination.comb.addAll(eights);
			combination.comb.addAll(fours);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 8 && list.get(i).getValue() != 4) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(eights.size() == 2 && threes.size() == 2) {
			
			combination  = new Combination("Two pairs Eights and Threes");
			combination.comb.addAll(eights);
			combination.comb.addAll(threes);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 8 && list.get(i).getValue() != 3) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(eights.size() == 2 && deuces.size() == 2) {
						
			combination  = new Combination("Two pairs Eights and Deuces");
			combination.comb.addAll(eights);
			combination.comb.addAll(deuces);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 8 && list.get(i).getValue() != 2) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(sevens.size() == 2 && sixes.size() == 2) {
			
			combination  = new Combination("Two pairs Sevens and Sixes");
			combination.comb.addAll(sevens);
			combination.comb.addAll(sixes);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 7 && list.get(i).getValue() != 6) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(sevens.size() == 2 && fives.size() == 2) {
			
			combination  = new Combination("Two pairs Sevens and Fives");
			combination.comb.addAll(sevens);
			combination.comb.addAll(fives);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 7 && list.get(i).getValue() != 5) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(sevens.size() == 2 && fours.size() == 2) {
			
			combination  = new Combination("Two pairs Sevens and Fours");
			combination.comb.addAll(sevens);
			combination.comb.addAll(fours);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 7 && list.get(i).getValue() != 4) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(sevens.size() == 2 && threes.size() == 2) {
			
			combination  = new Combination("Two pairs Sevens and Threes");
			combination.comb.addAll(sevens);
			combination.comb.addAll(threes);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 7 && list.get(i).getValue() != 3) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(sevens.size() == 2 && deuces.size() == 2) {
			
			combination  = new Combination("Two pairs Sevens and Deuces");
			combination.comb.addAll(sevens);
			combination.comb.addAll(deuces);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 7 && list.get(i).getValue() != 2) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(sixes.size() == 2 && fives.size() == 2) {
			
			combination  = new Combination("Two pairs Sixes and Fives");
			combination.comb.addAll(sixes);
			combination.comb.addAll(fives);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 6 && list.get(i).getValue() != 5) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(sixes.size() == 2 && fours.size() == 2) {
			
			combination  = new Combination("Two pairs Sixes and Fours");
			combination.comb.addAll(sixes);
			combination.comb.addAll(fours);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 6 && list.get(i).getValue() != 4) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(sixes.size() == 2 && threes.size() == 2) {
			
			combination  = new Combination("Two pairs Sixes and Threes");
			combination.comb.addAll(sixes);
			combination.comb.addAll(threes);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 6 && list.get(i).getValue() != 3) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(sixes.size() == 2 && deuces.size() == 2) {
			
			combination  = new Combination("Two pairs Sixes and Deuces");
			combination.comb.addAll(sixes);
			combination.comb.addAll(deuces);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 6 && list.get(i).getValue() != 2) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(fives.size() == 2 && fours.size() == 2) {
			
			combination  = new Combination("Two pairs Fives and Fours");
			combination.comb.addAll(fives);
			combination.comb.addAll(fours);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 5 && list.get(i).getValue() != 4) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(fives.size() == 2 && threes.size() == 2) {
			
			combination  = new Combination("Two pairs Fives and Threes");
			combination.comb.addAll(fives);
			combination.comb.addAll(threes);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 5 && list.get(i).getValue() != 3) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(fives.size() == 2 && deuces.size() == 2) {
			
			combination  = new Combination("Two pairs Fives and Deuces");
			combination.comb.addAll(fives);
			combination.comb.addAll(deuces);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 5 && list.get(i).getValue() != 2) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(fours.size() == 2 && threes.size() == 2) {
			
			combination  = new Combination("Two pairs Fours and Threes");
			combination.comb.addAll(fours);
			combination.comb.addAll(threes);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 3 && list.get(i).getValue() != 4) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(fours.size() == 2 && deuces.size() == 2) {
			
			combination  = new Combination("Two pairs Fours and Deuces");
			combination.comb.addAll(fours);
			combination.comb.addAll(deuces);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 4 && list.get(i).getValue() != 2) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(threes.size() == 2 && deuces.size() == 2) {
			
			combination  = new Combination("Two pairs Threes and Deuces");
			combination.comb.addAll(threes);
			combination.comb.addAll(deuces);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 3 && list.get(i).getValue() != 2) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(aces.size() == 2) {
			
			combination  = new Combination("Pair of Aces");
			combination.comb.addAll(aces);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 14) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(kings.size() == 2) {
			
			combination  = new Combination("Pair of Kings");
			combination.comb.addAll(kings);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 13) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(queens.size() == 2) {
			
			combination  = new Combination("Pair of Queens");
			combination.comb.addAll(queens);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 12) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(jacks.size() == 2) {
			
			combination  = new Combination("Pair of Jacks");
			combination.comb.addAll(jacks);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 11) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(tens.size() == 2) {
			
			combination  = new Combination("Pair of Tens");
			combination.comb.addAll(tens);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 10) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(nines.size() == 2) {
			
			combination  = new Combination("Pair of Nines");
			combination.comb.addAll(nines);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 9) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(eights.size() == 2) {
			
			combination  = new Combination("Pair of Eights");
			combination.comb.addAll(eights);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 8) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(sevens.size() == 2) {
			
			combination  = new Combination("Pair of Sevens");
			combination.comb.addAll(sevens);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 7) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(sixes.size() == 2) {
			
			combination  = new Combination("Pair of Sixes");
			combination.comb.addAll(sixes);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 6) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(fives.size() == 2) {
			
			combination  = new Combination("Pair of Fives");
			combination.comb.addAll(fives);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 5) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(fours.size() == 2) {
			
			combination  = new Combination("Pair of Fours");
			combination.comb.addAll(fours);
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 4) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(threes.size() == 2) {
			
			combination  = new Combination("Pair of Threes");
			combination.comb.addAll(threes);
			
			for (int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 3) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(deuces.size() == 2) {
			
			combination = new Combination("Pair of Deuces");
			combination.comb.addAll(deuces);
			
			for(int i = 0; combination.comb.size() < 5; i++) {
				if(list.get(i).getValue() != 2) {
					combination.comb.add(list.get(i));
				}
			}
			
		}else
		if(straight == false) {			
			System.out.println();			
			combination = new Combination("High Card");	
			for(int i = 0; i < 5; i++) {
							
				combination.comb.add(list.get(i));
			}
			
		}
			
		}	
	    
	}
	
	public void setPower(Combination c) {
		
		if(c.getName().equals("High Card")) {
			c.power = 1;
			c.subPower = c.comb.get(0).getValue();
			c.subPower2 = c.comb.get(1).getValue();
			c.subPower3 = c.comb.get(2).getValue();
			c.subPower4 = c.comb.get(3).getValue();
			c.subPower5 = c.comb.get(4).getValue();
		}else
		if(c.getName().equals("Pair of Deuces")) {
			c.power = 2;
			c.subPower = c.comb.get(2).getValue();
			c.subPower2 = c.comb.get(3).getValue();
			c.subPower3 = c.comb.get(4).getValue();
		}else
		if(c.getName().equals("Pair of Threes")) {
				c.power = 3;
				c.subPower = c.comb.get(2).getValue();
				c.subPower2 = c.comb.get(3).getValue();
				c.subPower3 = c.comb.get(4).getValue();
		}else
		if(c.getName().equals("Pair of Fours")) {
			c.power = 4;
			c.subPower = c.comb.get(2).getValue();
			c.subPower2 = c.comb.get(3).getValue();
			c.subPower3 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Pair of Fives")) {
			c.power = 5;
			c.subPower = c.comb.get(2).getValue();
			c.subPower2 = c.comb.get(3).getValue();
			c.subPower3 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Pair of Sixes")) {
			c.power = 6;
			c.subPower = c.comb.get(2).getValue();
			c.subPower2 = c.comb.get(3).getValue();
			c.subPower3 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Pair of Sevens")) {
			c.power = 7;
			c.subPower = c.comb.get(2).getValue();
			c.subPower2 = c.comb.get(3).getValue();
			c.subPower3 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Pair of Eights")) {
			c.power = 8;
			c.subPower = c.comb.get(2).getValue();
			c.subPower2 = c.comb.get(3).getValue();
			c.subPower3 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Pair of Nines")) {
			c.power = 9;
			c.subPower = c.comb.get(2).getValue();
			c.subPower2 = c.comb.get(3).getValue();
			c.subPower3 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Pair of Tens")) {
			c.power = 10;
			c.subPower = c.comb.get(2).getValue();
			c.subPower2 = c.comb.get(3).getValue();
			c.subPower3 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Pair of Jacks")) {
			c.power = 11;
			c.subPower = c.comb.get(2).getValue();
			c.subPower2 = c.comb.get(3).getValue();
			c.subPower3 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Pair of Queens")) {
			c.power = 12;
			c.subPower = c.comb.get(2).getValue();
			c.subPower2 = c.comb.get(3).getValue();
			c.subPower3 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Pair of Kings")) {
			c.power = 13;
			c.subPower = c.comb.get(2).getValue();
			c.subPower2 = c.comb.get(3).getValue();
			c.subPower3 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Pair of Aces")) {
			c.power = 14;
			c.subPower = c.comb.get(2).getValue();
			c.subPower2 = c.comb.get(3).getValue();
			c.subPower3 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Threes and Deuces")) {
			c.power = 15;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Fours and Deuces")) {
			c.power = 16;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Fours and Threes")) {
			c.power = 17;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Fives and Deuces")) {
			c.power = 18;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Fives and Threes")) {
			c.power = 19;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Fives and Fours")) {
			c.power = 20;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Sixes and Deuces")) {
			c.power = 21;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Sixes and Threes")) {
			c.power = 22;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Sixes and Fours")) {
			c.power = 23;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Sixes and Fives")) {
			c.power = 24;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Sevens and Deuces")) {
			c.power = 25;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Sevens and Threes")) {
			c.power = 26;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Sevens and Fours")) {
			c.power = 27;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Sevens and Fives")) {
			c.power = 28;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Sevens and Sixes")) {
			c.power = 29;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Eights and Deuces")) {
			c.power = 30;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Eights and Threes")) {
			c.power = 31;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Eights and Fours")) {
			c.power = 32;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Eights and Fives")) {
			c.power = 33;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Eights and Sixes")) {
			c.power = 34;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Eights and Sevens")) {
			c.power = 35;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Nines and Deuces")) {
			c.power = 36;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Nines and Threes")) {
			c.power = 37;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Nines and Fours")) {
			c.power = 38;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Nines and Fives")) {
			c.power = 39;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Nines and Sixes")) {
			c.power = 40;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Nines and Sevens")) {
			c.power = 41;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Nines and Eights")) {
			c.power = 42;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Tens and Deuces")) {
			c.power = 43;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Tens and Threes")) {
			c.power = 44;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Tens and Fours")) {
			c.power = 45;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Tens and Fives")) {
			c.power = 46;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Tens and Sixes")) {
			c.power = 47;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Tens and Sevens")) {
			c.power = 48;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Tens and Eights")) {
			c.power = 49;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Tens and Nines")) {
			c.power = 50;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Jacks and Deuces")) {
			c.power = 51;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Jacks and Threes")) {
			c.power = 52;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Jacks and Fours")) {
			c.power = 53;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Jacks and Fives")) {
			c.power = 54;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Jacks and Sixes")) {
			c.power = 55;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Jacks and Sevens")) {
			c.power = 56;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Jacks and Eights")) {
			c.power = 57;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Jacks and Nines")) {
			c.power = 58;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Jacks and Tens")) {
			c.power = 59;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Queens and Deuces")) {
			c.power = 60;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Queens and Threes")) {
			c.power = 61;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Queens and Fours")) {
			c.power = 62;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Queens and Fives")) {
			c.power = 63;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Queens and Sixes")) {
			c.power = 64;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Queens and Sevens")) {
			c.power = 65;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Queens and Eights")) {
			c.power = 66;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Queens and Nines")) {
			c.power = 67;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Queens and Tens")) {
			c.power = 68;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Queens and Jacks")) {
			c.power = 69;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Kings and Deuces")) {
			c.power = 70;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Kings and Threes")) {
			c.power = 71;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Kings and Fours")) {
			c.power = 72;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Kings and Fives")) {
			c.power = 73;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Kings and Sixes")) {
			c.power = 74;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Kings and Sevens")) {
			c.power = 75;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Kings and Eights")) {
			c.power = 76;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Kings and Nines")) {
			c.power = 77;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Kings and Tens")) {
			c.power = 78;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Kings and Jacks")) {
			c.power = 79;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Kings and Queens")) {
			c.power = 80;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Aces and Deuces")) {
			c.power = 81;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Aces and Threes")) {
			c.power = 82;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Aces and Fours")) {
			c.power = 83;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Aces and Fives")) {
			c.power = 84;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Aces and Sixes")) {
			c.power = 85;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Aces and Sevens")) {
			c.power = 86;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Aces and Eights")) {
			c.power = 87;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Aces and Nines")) {
			c.power = 88;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Aces and Tens")) {
			c.power = 89;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Aces and Jacks")) {
			c.power = 90;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Aces and Queens")) {
			c.power = 91;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Two pairs Aces and Kings")) {
			c.power = 92;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Three of a kind Deuces")) {
			c.power = 93;
			c.subPower = c.comb.get(3).getValue();
			c.subPower2 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Three of a kind Threes")) {
			c.power = 94;
			c.subPower = c.comb.get(3).getValue();
			c.subPower2 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Three of a kind Fours")) {
			c.power = 95;
			c.subPower = c.comb.get(3).getValue();
			c.subPower2 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Three of a kind Fives")) {
			c.power = 96;
			c.subPower = c.comb.get(3).getValue();
			c.subPower2 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Three of a kind Sixes")) {
			c.power = 97;
			c.subPower = c.comb.get(3).getValue();
			c.subPower2 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Three of a kind Sevens")) {
			c.power = 98;
			c.subPower = c.comb.get(3).getValue();
			c.subPower2 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Three of a kind Eights")) {
			c.power = 99;
			c.subPower = c.comb.get(3).getValue();
			c.subPower2 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Three of a kind Nines")) {
			c.power = 100;
			c.subPower = c.comb.get(3).getValue();
			c.subPower2 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Three of a kind Tens")) {
			c.power = 101;
			c.subPower = c.comb.get(3).getValue();
			c.subPower2 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Three of a kind Jacks")) {
			c.power = 102;
			c.subPower = c.comb.get(3).getValue();
			c.subPower2 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Three of a kind Queens")) {
			c.power = 103;
			c.subPower = c.comb.get(3).getValue();
			c.subPower2 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Three of a kind Kings")) {
			c.power = 104;
			c.subPower = c.comb.get(3).getValue();
			c.subPower2 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Three of a kind Aces")) {
			c.power = 105;
			c.subPower = c.comb.get(3).getValue();
			c.subPower2 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Straight, 5")) {
			c.power = 106;
	    }else
	    if(c.getName().equals("Straight, 6")) {
			c.power = 107;
	    }else
	    if(c.getName().equals("Straight, 7")) {
			c.power = 108;
	    }else
	    if(c.getName().equals("Straight, 8")) {
			c.power = 109;
	    }else
	    if(c.getName().equals("Straight, 9")) {
			c.power = 110;
	    }else
	    if(c.getName().equals("Straight, 10")) {
			c.power = 111;
	    }else
	    if(c.getName().equals("Straight, Jack")) {
			c.power = 112;
	    }else
	    if(c.getName().equals("Straight, Queen")) {
			c.power = 113;
	    }else
	    if(c.getName().equals("Straight, King")) {
			c.power = 114;
	    }else
	    if(c.getName().equals("Straight, Ace")) {
			c.power = 115;
	    }else
	    if(c.getName().equals("Flush, 7")) {
			c.power = 116;
			c.subPower = c.comb.get(0).getValue();
			c.subPower2 = c.comb.get(1).getValue();
			c.subPower3 = c.comb.get(2).getValue();
			c.subPower4 = c.comb.get(3).getValue();
			c.subPower5 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Flush, 8")) {
			c.power = 117;
			c.subPower = c.comb.get(0).getValue();
			c.subPower2 = c.comb.get(1).getValue();
			c.subPower3 = c.comb.get(2).getValue();
			c.subPower4 = c.comb.get(3).getValue();
			c.subPower5 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Flush, 9")) {
			c.power = 118;
			c.subPower = c.comb.get(0).getValue();
			c.subPower2 = c.comb.get(1).getValue();
			c.subPower3 = c.comb.get(2).getValue();
			c.subPower4 = c.comb.get(3).getValue();
			c.subPower5 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Flush, 10")) {
			c.power = 119;
			c.subPower = c.comb.get(0).getValue();
			c.subPower2 = c.comb.get(1).getValue();
			c.subPower3 = c.comb.get(2).getValue();
			c.subPower4 = c.comb.get(3).getValue();
			c.subPower5 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Flush, Jack")) {
			c.power = 120;
			c.subPower = c.comb.get(0).getValue();
			c.subPower2 = c.comb.get(1).getValue();
			c.subPower3 = c.comb.get(2).getValue();
			c.subPower4 = c.comb.get(3).getValue();
			c.subPower5 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Flush, Queen")) {
			c.power = 121;
			c.subPower = c.comb.get(0).getValue();
			c.subPower2 = c.comb.get(1).getValue();
			c.subPower3 = c.comb.get(2).getValue();
			c.subPower4 = c.comb.get(3).getValue();
			c.subPower5 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Flush, King")) {
			c.power = 122;
			c.subPower = c.comb.get(0).getValue();
			c.subPower2 = c.comb.get(1).getValue();
			c.subPower3 = c.comb.get(2).getValue();
			c.subPower4 = c.comb.get(3).getValue();
			c.subPower5 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Flush, Ace")) {
			c.power = 123;
			c.subPower = c.comb.get(0).getValue();
			c.subPower2 = c.comb.get(1).getValue();
			c.subPower3 = c.comb.get(2).getValue();
			c.subPower4 = c.comb.get(3).getValue();
			c.subPower5 = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Full house Deuces and Threes")) {
			c.power = 124;
	    }else
	    if(c.getName().equals("Full house Deuces and Fours")) {
			c.power = 125;
	    }else
	    if(c.getName().equals("Full house Deuces and Fives")) {
			c.power = 126;
	    }else
	    if(c.getName().equals("Full house Deuces and Sixes")) {
			c.power = 127;
	    }else
	    if(c.getName().equals("Full house Deuces and Sevens")) {
			c.power = 128;
	    }else
	    if(c.getName().equals("Full house Deuces and Eights")) {
			c.power = 129;
	    }else
	    if(c.getName().equals("Full house Deuces and Nines")) {
			c.power = 130;
	    }else
	    if(c.getName().equals("Full house Deuces and Tens")) {
			c.power = 131;
	    }else
	    if(c.getName().equals("Full house Deuces and Jacks")) {
			c.power = 132;
	    }else
	    if(c.getName().equals("Full house Deuces and Queens")) {
			c.power = 133;
	    }else
	    if(c.getName().equals("Full house Deuces and Kings")) {
			c.power = 134;
	    }else
	    if(c.getName().equals("Full house Deuces and Aces")) {
			c.power = 135;
	    }else
	    if(c.getName().equals("Full house Threes and Deuces")) {
			c.power = 136;
	    }else
	    if(c.getName().equals("Full house Threes and Fours")) {
			c.power = 137;
	    }else
	    if(c.getName().equals("Full house Threes and Fives")) {
			c.power = 138;
	    }else
	    if(c.getName().equals("Full house Threes and Sixes")) {
			c.power = 139;
	    }else
	    if(c.getName().equals("Full house Threes and Sevens")) {
			c.power = 140;
	    }else
	    if(c.getName().equals("Full house Threes and Eights")) {
			c.power = 141;
	    }else
	    if(c.getName().equals("Full house Threes and Nines")) {
			c.power = 142;
	    }else
	    if(c.getName().equals("Full house Threes and Tens")) {
			c.power = 143;
	    }else
	    if(c.getName().equals("Full house Threes and Jacks")) {
			c.power = 144;
	    }else
	    if(c.getName().equals("Full house Threes and Queens")) {
			c.power = 145;
	    }else
	    if(c.getName().equals("Full house Threes and Kings")) {
			c.power = 146;
	    }else
	    if(c.getName().equals("Full house Threes and Aces")) {
			c.power = 147;
	    }else
	    if(c.getName().equals("Full house Fours and Deuces")) {
			c.power = 148;
	    }else
	    if(c.getName().equals("Full house Fours and Threes")) {
			c.power = 149;
	    }else
	    if(c.getName().equals("Full house Fours and Fives")) {
			c.power = 150;
	    }else
	    if(c.getName().equals("Full house Fours and Sixes")) {
			c.power = 151;
	    }else
	    if(c.getName().equals("Full house Fours and Sevens")) {
			c.power = 152;
	    }else
	    if(c.getName().equals("Full house Fours and Eights")) {
			c.power = 153;
	    }else
	    if(c.getName().equals("Full house Fours and Nines")) {
			c.power = 154;
	    }else
	    if(c.getName().equals("Full house Fours and Tens")) {
			c.power = 155;
	    }else
	    if(c.getName().equals("Full house Fours and Jacks")) {
			c.power = 156;
	    }else
	    if(c.getName().equals("Full house Fours and Queens")) {
			c.power = 157;
	    }else
	    if(c.getName().equals("Full house Fours and Kings")) {
			c.power = 158;
	    }else
	    if(c.getName().equals("Full house Fours and Aces")) {
			c.power = 159;
	    }else
	    if(c.getName().equals("Full house Fives and Deuces")) {
			c.power = 160;
	    }else
	    if(c.getName().equals("Full house Fives and Threes")) {
			c.power = 161;
	    }else
	    if(c.getName().equals("Full house Fives and Fours")) {
			c.power = 162;
	    }else
	    if(c.getName().equals("Full house Fives and Sixes")) {
			c.power = 163;
	    }else
	    if(c.getName().equals("Full house Fives and Sevens")) {
			c.power = 164;
	    }else
	    if(c.getName().equals("Full house Fives and Eights")) {
			c.power = 165;
	    }else
	    if(c.getName().equals("Full house Fives and Nines")) {
			c.power = 166;
	    }else
	    if(c.getName().equals("Full house Fives and Tens")) {
			c.power = 167;
	    }else
	    if(c.getName().equals("Full house Fives and Jacks")) {
			c.power = 168;
	    }else
	    if(c.getName().equals("Full house Fives and Queens")) {
			c.power = 169;
	    }else
	    if(c.getName().equals("Full house Fives and Kings")) {
			c.power = 170;
	    }else
	    if(c.getName().equals("Full house Fives and Aces")) {
			c.power = 171;
	    }else
	    if(c.getName().equals("Full house Sixes and Deuces")) {
			c.power = 172;
	    }else
	    if(c.getName().equals("Full house Sixes and Threes")) {
			c.power = 173;
	    }else
	    if(c.getName().equals("Full house Sixes and Fours")) {
			c.power = 174;
	    }else
	    if(c.getName().equals("Full house Sixes and Fives")) {
			c.power = 175;
	    }else
	    if(c.getName().equals("Full house Sixes and Sevens")) {
			c.power = 176;
	    }else
	    if(c.getName().equals("Full house Sixes and Eights")) {
			c.power = 177;
	    }else
	    if(c.getName().equals("Full house Sixes and Nines")) {
			c.power = 178;
	    }else
	    if(c.getName().equals("Full house Sixes and Tens")) {
			c.power = 179;
	    }else
	    if(c.getName().equals("Full house Sixes and Jacks")) {
			c.power = 180;
	    }else
	    if(c.getName().equals("Full house Sixes and Queens")) {
			c.power = 181;
	    }else
	    if(c.getName().equals("Full house Sixes and Kings")) {
			c.power = 182;
	    }else
	    if(c.getName().equals("Full house Sixes and Aces")) {
			c.power = 183;
	    }else
	    if(c.getName().equals("Full house Sevens and Deuces")) {
			c.power = 184;
	    }else
	    if(c.getName().equals("Full house Sevens and Threes")) {
			c.power = 185;
	    }else
	    if(c.getName().equals("Full house Sevens and Fours")) {
			c.power = 186;
	    }else
	    if(c.getName().equals("Full house Sevens and Fives")) {
			c.power = 187;
	    }else
	    if(c.getName().equals("Full house Sevens and Sixes")) {
			c.power = 188;
	    }else
	    if(c.getName().equals("Full house Sevens and Eights")) {
			c.power = 189;
	    }else
	    if(c.getName().equals("Full house Sevens and Nines")) {
			c.power = 190;
	    }else
	    if(c.getName().equals("Full house Sevens and Tens")) {
			c.power = 191;
	    }else
	    if(c.getName().equals("Full house Sevens and Jacks")) {
			c.power = 192;
	    }else
	    if(c.getName().equals("Full house Sevens and Queens")) {
			c.power = 193;
	    }else
	    if(c.getName().equals("Full house Sevens and Kings")) {
			c.power = 194;
	    }else
	    if(c.getName().equals("Full house Sevens and Aces")) {
			c.power = 195;
	    }else
	    if(c.getName().equals("Full house Eights and Deuces")) {
			c.power = 196;
	    }else
	    if(c.getName().equals("Full house Eights and Threes")) {
			c.power = 197;
	    }else
	    if(c.getName().equals("Full house Eights and Fours")) {
			c.power = 198;
	    }else
	    if(c.getName().equals("Full house Eights and Fives")) {
			c.power = 199;
	    }else
	    if(c.getName().equals("Full house Eights and Sixes")) {
			c.power = 200;
	    }else
	    if(c.getName().equals("Full house Eights and Sevens")) {
			c.power = 201;
	    }else
	    if(c.getName().equals("Full house Eights and Nines")) {
			c.power = 202;
	    }else
	    if(c.getName().equals("Full house Eights and Tens")) {
			c.power = 203;
	    }else
	    if(c.getName().equals("Full house Eights and Jacks")) {
			c.power = 204;
	    }else
	    if(c.getName().equals("Full house Eights and Queens")) {
			c.power = 205;
	    }else
	    if(c.getName().equals("Full house Eights and Kings")) {
			c.power = 206;
	    }else
	    if(c.getName().equals("Full house Eights and Aces")) {
			c.power = 207;
	    }else
	    if(c.getName().equals("Full house Nines and Deuces")) {
			c.power = 208;
	    }else
	    if(c.getName().equals("Full house Nines and Threes")) {
			c.power = 209;
	    }else
	    if(c.getName().equals("Full house Nines and Fours")) {
			c.power = 210;
	    }else
	    if(c.getName().equals("Full house Nines and Fives")) {
			c.power = 211;
	    }else
	    if(c.getName().equals("Full house Nines and Sixes")) {
			c.power = 212;
	    }else
	    if(c.getName().equals("Full house Nines and Sevens")) {
			c.power = 213;
	    }else
	    if(c.getName().equals("Full house Nines and Eights")) {
			c.power = 214;
	    }else
	    if(c.getName().equals("Full house Nines and Tens")) {
			c.power = 215;
	    }else
	    if(c.getName().equals("Full house Nines and Jacks")) {
			c.power = 216;
	    }else
	    if(c.getName().equals("Full house Nines and Queens")) {
			c.power = 217;
	    }else
	    if(c.getName().equals("Full house Nines and Kings")) {
			c.power = 218;
	    }else
	    if(c.getName().equals("Full house Nines and Aces")) {
			c.power = 219;
	    }else
	    if(c.getName().equals("Full house Tens and Deuces")) {
			c.power = 220;
	    }else
	    if(c.getName().equals("Full house Tens and Threes")) {
			c.power = 221;
	    }else
	    if(c.getName().equals("Full house Tens and Fours")) {
			c.power = 222;
	    }else
	    if(c.getName().equals("Full house Tens and Fives")) {
			c.power = 223;
	    }else
	    if(c.getName().equals("Full house Tens and Sixes")) {
			c.power = 224;
	    }else
	    if(c.getName().equals("Full house Tens and Sevens")) {
			c.power = 225;
	    }else
	    if(c.getName().equals("Full house Tens and Eights")) {
			c.power = 226;
	    }else
	    if(c.getName().equals("Full house Tens and Nines")) {
			c.power = 227;
	    }else
	    if(c.getName().equals("Full house Tens and Jacks")) {
			c.power = 228;
	    }else
	    if(c.getName().equals("Full house Tens and Queens")) {
			c.power = 229;
	    }else
	    if(c.getName().equals("Full house Tens and Kings")) {
			c.power = 230;
	    }else
	    if(c.getName().equals("Full house Tens and Aces")) {
			c.power = 231;
	    }else
	    if(c.getName().equals("Full house Jacks and Deuces")) {
			c.power = 232;
	    }else
	    if(c.getName().equals("Full house Jacks and Threes")) {
			c.power = 233;
	    }else
	    if(c.getName().equals("Full house Jacks and Fours")) {
			c.power = 234;
	    }else
	    if(c.getName().equals("Full house Jacks and Fives")) {
			c.power = 235;
	    }else
	    if(c.getName().equals("Full house Jacks and Sixes")) {
			c.power = 236;
	    }else
	    if(c.getName().equals("Full house Jacks and Sevens")) {
			c.power = 237;
	    }else
	    if(c.getName().equals("Full house Jacks and Eights")) {
			c.power = 238;
	    }else
	    if(c.getName().equals("Full house Jacks and Nines")) {
			c.power = 239;
	    }else
	    if(c.getName().equals("Full house Jacks and Tens")) {
			c.power = 240;
	    }else
	    if(c.getName().equals("Full house Jacks and Queens")) {
			c.power = 241;
	    }else
	    if(c.getName().equals("Full house Jacks and Kings")) {
			c.power = 242;
	    }else
	    if(c.getName().equals("Full house Jacks and Aces")) {
			c.power = 243;
	    }else
	    if(c.getName().equals("Full house Queens and Deuces")) {
			c.power = 244;
	    }else
	    if(c.getName().equals("Full house Queens and Threes")) {
			c.power = 245;
	    }else
	    if(c.getName().equals("Full house Queens and Fours")) {
			c.power = 246;
	    }else
	    if(c.getName().equals("Full house Queens and Fives")) {
			c.power = 247;
	    }else
	    if(c.getName().equals("Full house Queens and Sixes")) {
			c.power = 248;
	    }else
	    if(c.getName().equals("Full house Queens and Sevens")) {
			c.power = 249;
	    }else
	    if(c.getName().equals("Full house Queens and Eights")) {
			c.power = 250;
	    }else
	    if(c.getName().equals("Full house Queens and Nines")) {
			c.power = 251;
	    }else
	    if(c.getName().equals("Full house Queens and Tens")) {
			c.power = 252;
	    }else
	    if(c.getName().equals("Full house Queens and Jacks")) {
			c.power = 253;
	    }else
	    if(c.getName().equals("Full house Queens and Kings")) {
			c.power = 254;
	    }else
	    if(c.getName().equals("Full house Queens and Aces")) {
			c.power = 255;
	    }else
	    if(c.getName().equals("Full house Kings and Deuces")) {
			c.power = 256;
	    }else
	    if(c.getName().equals("Full house Kings and Threes")) {
			c.power = 257;
	    }else
	    if(c.getName().equals("Full house Kings and Fours")) {
			c.power = 258;
	    }else
	    if(c.getName().equals("Full house Kings and Fives")) {
			c.power = 259;
	    }else
	    if(c.getName().equals("Full house Kings and Sixes")) {
			c.power = 260;
	    }else
	    if(c.getName().equals("Full house Kings and Sevens")) {
			c.power = 261;
	    }else
	    if(c.getName().equals("Full house Kings and Eights")) {
			c.power = 262;
	    }else
	    if(c.getName().equals("Full house Kings and Nines")) {
			c.power = 263;
	    }else
	    if(c.getName().equals("Full house Kings and Tens")) {
			c.power = 264;
	    }else
	    if(c.getName().equals("Full house Kings and Jacks")) {
			c.power = 265;
	    }else
	    if(c.getName().equals("Full house Kings and Queens")) {
			c.power = 266;
	    }else
	    if(c.getName().equals("Full house Kings and Aces")) {
			c.power = 267;
	    }else
	    if(c.getName().equals("Full house Aces and Deuces")) {
				c.power = 268;
		}else
		if(c.getName().equals("Full house Aces and Threes")) {
			c.power = 269;
	    }else
	    if(c.getName().equals("Full house Aces and Fours")) {
			c.power = 270;
	    }else
	    if(c.getName().equals("Full house Aces and Fives")) {
			c.power = 271;
	    }else
	    if(c.getName().equals("Full house Aces and Sixes")) {
				c.power = 272;
		}else
		if(c.getName().equals("Full house Aces and Sevens")) {
				c.power = 273;
		}else
		if(c.getName().equals("Full house Aces and Eights")) {
				c.power = 274;
		}else
		if(c.getName().equals("Full house Aces and Nines")) {
				c.power = 275;
		}else
		if(c.getName().equals("Full house Aces and Tens")) {
				c.power = 276;
		}else
		if(c.getName().equals("Full house Aces and Jacks")) {
				c.power = 277;
		}else
		if(c.getName().equals("Full house Aces and Queens")) {
				c.power = 278;
		}else
		if(c.getName().equals("Full house Aces and Kings")) {
				c.power = 279;
		}else
	    if(c.getName().equals("Quads of deuces")) {
			c.power = 280;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Quads of threes")) {
			c.power = 281;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Quads of fours")) {
			c.power = 282;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Quads of fives")) {
			c.power = 283;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Quads of sixes")) {
			c.power = 284;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Quads of sevens")) {
			c.power = 285;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Quads of eights")) {
			c.power = 286;
			c.subPower = c.comb.get(4).getValue();
	    }else
    	if(c.getName().equals("Quads of nines")) {
			c.power = 287;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Quads of tens")) {
			c.power = 288;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Quads of Jacks")) {
			c.power = 289;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Quads of Queens")) {
			c.power = 290;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Quads of Kings")) {
			c.power = 291;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Quads of Aces")) {
			c.power = 292;
			c.subPower = c.comb.get(4).getValue();
	    }else
	    if(c.getName().equals("Straight Flush, 5 high")) {
			c.power = 293;
	    }else 
	    if(c.getName().equals("Straight Flush, 6 high")) {
			c.power = 294;
	    }else
	    if(c.getName().equals("Straight Flush, 7 high")) {
			c.power = 295;
	    }else
	    if(c.getName().equals("Straight Flush, 8 high")) {
			c.power = 296;
	    }else
	    if(c.getName().equals("Straight Flush, 9 high")) {
			c.power = 297;
	    }else
	    if(c.getName().equals("Straight Flush, 10 high")) {
			c.power = 298;
	    }else
	    if(c.getName().equals("Straight Flush, Jack high")) {
			c.power = 299;
	    }else
	    if(c.getName().equals("Straight Flush, Queen high")) {
			c.power = 300;
	    }else
	    if(c.getName().equals("Straight Flush, King high")) {
			c.power = 301;
	    }else if(c.getName().equals("Royal Flush")) {
			c.power = 302;
	    }
	    	
	}
	
	
	
}
