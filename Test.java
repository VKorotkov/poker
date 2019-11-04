import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int w = 0; w < 100; w++) {
		Table table = new Table();
		table.players = new Player[9];//;
		table.cardsOnTable = new Card[5];
		Deck d = new Deck();
		table.players[0] = new Player("Player1");
		table.players[1] = new Player("Player2");
		table.players[2] = new Player("Player3");
		table.players[3] = new Player("Player4");
		table.players[4] = new Player("Player5");
		table.players[5] = new Player("Player6");
		table.players[6] = new Player("Player7");
		table.players[7] = new Player("Player8");
		table.players[8] = new Player("Player9");
		Card[] deck = d.getDeck();
		
		Deck.reshuffle(deck);
		table.setHands(deck);
		
		for(int i = 0; i < table.players.length; i++) {
			table.players[i].printHand();
		}
		System.out.println();
		
		table.setFlop(deck);
		table.printFlop();
		table.setTurn(deck);
		table.printTurn();
		table.setRiver(deck);
		table.printRiver();
		
		System.out.println();
		
		
		
		table.players[0].checkCombination();
		System.out.println(table.players[0].combination.getName());
		Combination c0 = table.players[0].combination;
		table.players[0].setPower(c0);
		System.out.println(table.players[0].combination.getPower());
		
		table.players[1].checkCombination();
		System.out.println(table.players[1].combination.getName());
		Combination c1 = table.players[1].combination;
		table.players[1].setPower(c1);
		System.out.println(table.players[1].combination.getPower());
		
		table.players[2].checkCombination();
		System.out.println(table.players[2].combination.getName());
		Combination c2 = table.players[2].combination;
		table.players[2].setPower(c2);
		System.out.println(table.players[2].combination.getPower());
		
		table.players[3].checkCombination();
		System.out.println(table.players[3].combination.getName());
		Combination c3 = table.players[3].combination;
		table.players[3].setPower(c3);
		System.out.println(table.players[3].combination.getPower());
		
		table.players[4].checkCombination();
		System.out.println(table.players[4].combination.getName());
		Combination c4 = table.players[4].combination;
		table.players[4].setPower(c4);
		System.out.println(table.players[4].combination.getPower());
		
		table.players[5].checkCombination();
		System.out.println(table.players[5].combination.getName());
		Combination c5 = table.players[5].combination;
		table.players[5].setPower(c5);
		System.out.println(table.players[5].combination.getPower());
	
		table.players[6].checkCombination();
		System.out.println(table.players[6].combination.getName());
		Combination c6 = table.players[6].combination;
		table.players[6].setPower(c6);
		System.out.println(table.players[6].combination.getPower());
	
		table.players[7].checkCombination();
		System.out.println(table.players[7].combination.getName());
		Combination c7 = table.players[7].combination;
		table.players[7].setPower(c7);
		System.out.println(table.players[7].combination.getPower());
		
		table.players[8].checkCombination(); 
		System.out.println(table.players[8].combination.getName());
		Combination c8 = table.players[8].combination;
		table.players[8].setPower(c8);
		System.out.println(table.players[8].combination.getPower());
		
		table.checkWinner(table.players);
	}
	}

}
