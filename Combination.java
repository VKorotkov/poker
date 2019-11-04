import java.util.ArrayList;

public class Combination {
	
	int power;
	int subPower;
	int subPower2;
	int subPower3;
	int subPower4;
	int subPower5;
	String name;
	ArrayList<Card> comb = new ArrayList<Card>();
	
	public Combination(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPower() {
		return power;
	}
	
	public int getSubPower() {
		return subPower;
	}
	
	public int getSubPower2() {
		return subPower2;
	}
	
	public int getSubPower3() {
		return subPower3;
	}
	
	public int getSubPower4() {
		return subPower4;
	}
	
	public int getSubPower5() {
		return subPower5;
	}
}
