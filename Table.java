import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Table {
	
	Player[] players;
	Card[] cardsOnTable;
	ArrayList<Hand> winnerHands;
	int bank;
	
	
    

	public void setSB(Player p) {
		p.money = p.money - 5;
		bank = bank + 5;
	}
	public void setBB(Player p) {
		p.money = p.money - 10;
		bank = bank + 10;
	}
	
	public void setHands(Card[] d) {
		for(int i = 0; i < players.length; i++) {
			players[i].setHand(d[i], d[i + players.length]);
		}
		System.out.println("First round");
	}
	
	
	
	public void setFlop(Card[] d) {
	    for(int i = players.length * 2, a = 0; i < players.length * 2 + 3; i++, a++) {
	    	cardsOnTable[a] = d[i];
	    	for(int j = 0; j < players.length; j++) {
	    		players[j].playerCombCards.add(d[i]);
	    	}
	    }
	    System.out.println("Second round");
	}
	
	public void setFlop(Card c1, Card c2, Card c3) {
		cardsOnTable[0] = c1;
		cardsOnTable[1] = c2;
		cardsOnTable[2] = c3;
		for(int j = 0; j < players.length; j++) {
    		players[j].playerCombCards.add(c1);
    		players[j].playerCombCards.add(c2);
    		players[j].playerCombCards.add(c3);
    	}
	}
	
	public void printFlop() {
		System.out.println(cardsOnTable[0].getValue() + " of " + cardsOnTable[0].getSuit()
				+ " + " + cardsOnTable[1].getValue() + " of " + cardsOnTable[1].getSuit()
				+ " + " + cardsOnTable[2].getValue() + " of " + cardsOnTable[2].getSuit());
	}
	
	public void setTurn(Card[] d) {
		cardsOnTable[3] = d[players.length * 2 + 5];
		for(int j = 0; j < players.length; j++) {
    		players[j].playerCombCards.add(cardsOnTable[3]);
    	}
		System.out.println("Third round");
	}
	public void setTurn(Card c) {
		cardsOnTable[3] = c;
		for(int j = 0; j < players.length; j++) {
    		players[j].playerCombCards.add(c);
    	}
	}
	
	public void printTurn() {
		System.out.println(cardsOnTable[3].getValue() + " of " + cardsOnTable[3].getSuit());
	}
	
	public void setRiver(Card[] d) {
		cardsOnTable[4] = d[players.length * 2 + 7];
		for(int j = 0; j < players.length; j++) {
    		players[j].playerCombCards.add(cardsOnTable[4]);
    	}
		System.out.println("Last round");
	}
	public void setRiver(Card c) {
		cardsOnTable[4] = c;
		for(int j = 0; j < players.length; j++) {
    		players[j].playerCombCards.add(c);
    	}
	}
	
	public void printRiver() {
		System.out.println(cardsOnTable[4].getValue() + " of " + cardsOnTable[4].getSuit());
	}
	
	public void checkWinner(Player[] p) {
		int m = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		ArrayList<Integer> list5 = new ArrayList<Integer>();
		ArrayList<Integer> list6 = new ArrayList<Integer>();
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		int s4 = 0;
		int s5 = 0;
		for (int i = 0; i < p.length; i++) {
			if(p[i].combination.power > m) {
				m = p[i].combination.power;
			}
		}
		for(int i = 0; i < p.length; i++) {
			if(p[i].combination.power == m) {
				list.add(i);
			}
		}
		if(list.size() == 1) {
			System.out.println("The winner is " + p[list.get(0)].name);
			//db
			
			int combP = p[list.get(0)].combination.power;
			try {
				updateWinners(combP);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else
			
		if(list.size() > 1) {
			for(int i = 0; i < list.size(); i++) {
				if(p[list.get(i)].combination.subPower > s1) {
					s1 = p[list.get(i)].combination.subPower;
				}
			}
			for(int i = 0; i < list.size(); i++) {
				if(p[list.get(i)].combination.subPower == s1)
					list2.add(list.get(i));
			}
			if(list2.size() == 1) {
				System.out.println("The winner is " + p[list2.get(0)].name);
				//db
				
				int combP = p[list2.get(0)].combination.power;
				try {
					updateWinners(combP);
					updateHand(p[list2.get(0)].hand.card1, p[list2.get(0)].hand.card2);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else
			if(list2.size() > 1) {
				for(int i = 0; i < list2.size(); i++) {
					if(p[list2.get(i)].combination.subPower2 > s2) {
						s2 = p[list2.get(i)].combination.subPower2;
					}
				}
				for(int i = 0; i < list2.size(); i++) {
					if(p[list2.get(i)].combination.subPower2 == s2)
						list3.add(list2.get(i));
				}
				if(list3.size() == 1) {
					System.out.println("The winner is " + p[list3.get(0)].name);
					//db
					
					int combP = p[list3.get(0)].combination.power;
					try {
						updateWinners(combP);
						updateHand(p[list3.get(0)].hand.card1, p[list3.get(0)].hand.card2);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else
				if(list3.size() > 1) {
					for(int i = 0; i < list3.size(); i++) {
						if(p[list3.get(i)].combination.subPower3 > s3) {
							s3 = p[list3.get(i)].combination.subPower3;
						}
					}
					for(int i = 0; i < list3.size(); i++) {
						if(p[list3.get(i)].combination.subPower3 == s3)
							list4.add(list3.get(i));
					}
					if(list4.size() == 1) {
						System.out.println("The winner is " + p[list4.get(0)].name);
						//db
						
						int combP = p[list4.get(0)].combination.power;
						try {
							updateWinners(combP);
							updateHand(p[list4.get(0)].hand.card1, p[list4.get(0)].hand.card2);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else
					if(list4.size() > 1) {
						for(int i = 0; i < list4.size(); i++) {
							if(p[list4.get(i)].combination.subPower4 > s4) {
								s4 = p[list4.get(i)].combination.subPower4;
							}
						}
						for(int i = 0; i < list4.size(); i++) {
							if(p[list4.get(i)].combination.subPower4 == s4)
								list5.add(list4.get(i));
						}
						if(list5.size() == 1) {
							System.out.println("The winner is " + p[list5.get(0)].name);
							//db
							
							int combP = p[list5.get(0)].combination.power;
							try {
								updateWinners(combP);
								updateHand(p[list5.get(0)].hand.card1, p[list5.get(0)].hand.card2);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}else
							if(list5.size() > 1) {
								for(int i = 0; i < list5.size(); i++) {
									if(p[list5.get(i)].combination.subPower5 > s5) {
										s5 = p[list5.get(i)].combination.subPower5;
									}
								}
								for(int i = 0; i < list5.size(); i++) {
									if(p[list5.get(i)].combination.subPower5 == s5)
										list6.add(list5.get(i));
								}
								if(list6.size() == 1) {
									System.out.println("The winner is " + p[list6.get(0)].name);
									//db
									
									int combP = p[list6.get(0)].combination.power;
									try {
										updateWinners(combP);
										updateHand(p[list6.get(0)].hand.card1, p[list6.get(0)].hand.card2);
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}else
									for(int i = 0; i < list6.size(); i++) {
										System.out.println("The winner is " + p[list6.get(i)].name);
										//db
									
										int combP = p[list6.get(i)].combination.power;
										try {
											updateWinners(combP);
											updateHand(p[list6.get(i)].hand.card1, p[list6.get(i)].hand.card2);
										} catch (Exception e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
					}
				}
			}
		}
		}}
	
	public static Connection getConnection() throws Exception{
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/pokerbrain?useSSL=false";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, "root", "root");
			System.out.println("Connection completed");
			return con;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public static void updateWinners(int a) throws Exception{
		try {
			Connection con = getConnection();
			int m = winnersCount(a) + 1;
			PreparedStatement update = con.prepareStatement("UPDATE winners SET count = "+m+" WHERE power = "+a+"");
			update.executeUpdate();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static int winnersCount(int a) throws Exception{
		try {
			Connection con = getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT count FROM winners WHERE power = "+a+"");
			while (rs.next()) {
				int count = rs.getInt("count");
				return count;
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
		
	}
	
	public static int handCount(Card c1, Card c2) throws Exception{
		try {
			int v1;
			int v2;
			Connection con = getConnection();
			Statement st = con.createStatement();
			if(c1.getValue() <= c2.getValue()) {
				v1 = c1.getValue();
				v2 = c2.getValue();
			}else {
				v1 = c2.getValue();
				v2 = c1.getValue();
			}
			ResultSet rs = st.executeQuery("SELECT id FROM hand WHERE "
					+ "card1 = '"+v1+"'and card2 = '"+v2+"'");
			while(rs.next()) {
				int id = rs.getInt("id");
				return id;
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
		
	}
	
	public static void updateHand(Card c1, Card c2) throws Exception{
		try {
			
			int v = handCount(c1, c2);
			
			Connection con = getConnection();
			PreparedStatement update = con.prepareStatement("UPDATE hand SET"
					+ " count = count + '1' WHERE id = '"+v+"'");
			update.executeUpdate();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	

}
