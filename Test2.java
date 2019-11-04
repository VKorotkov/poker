
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   Table table = new Table();
	   table.cardsOnTable = new Card[5];
	   Deck d = new Deck();
	   table.players = new Player[2];
	   table.players[0] = new Player("Player 1");
	   table.players[1] = new Player("Player 2");
	   Card[] deck = d.getDeck();
	   
	   Card c0 = new Card(2, "Spades");
	   Card c01 = new Card(6, "Diamonds");
	   Card c1 = new Card(14, "Spades");
	   Card c11 = new Card(8, "Hearts");
	   Card f1 = new Card(2, "Hearts");
	   Card f2 = new Card(10, "Diamonds");
	   Card f3 = new Card(4, "Crosses");
	   Card t = new Card(7, "Crosses");
	   Card r = new Card(9, "Hearts");
	   
	   table.players[0].setHand(c0, c01);
	   table.players[1].setHand(c1, c11);
	   table.players[0].printHand();
	   table.players[1].printHand();
	  
	   table.setFlop(f1, f2, f3);
	   
	  
	   table.setTurn(t);
	   
	   table.setRiver(r);
	   System.out.println();
	   table.printFlop();
	   table.printTurn();
	   table.printRiver();
	   System.out.println();
	   table.players[0].checkCombination();
	   table.players[0].setPower(table.players[0].combination);
	   System.out.println(table.players[0].combination.getName());
	   System.out.println(table.players[0].combination.getPower());
	   
	   table.players[1].checkCombination();
	   table.players[1].setPower(table.players[1].combination);
	   
	   System.out.println(table.players[1].combination.getName());
	   System.out.println(table.players[1].combination.getPower());
	   System.out.println();
	   for(int i = 0; i < 5; i++) {
	       System.out.print(table.players[0].combination.comb.get(i).getValue()+ " of " + table.players[0].combination.comb.get(i).getSuit() + " ");
	   }
	   System.out.println();
	  
	   for(int i = 0; i < 5; i++) {
	       System.out.print(table.players[1].combination.comb.get(i).getValue()+ " of " + table.players[1].combination.comb.get(i).getSuit() + " ");
	   }
	   System.out.println();
	   
	   table.checkWinner(table.players);

	}

}
