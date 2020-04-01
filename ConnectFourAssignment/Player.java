//Kate Hickey
//2032000H

public class Player {
	
	private String playerName;
	char counterSymbol;
	
	//constructor
	Player(String playerName, char counterSymbol) {
		this.playerName = playerName;
		this.counterSymbol = counterSymbol;
	}
	
	public String toString() {
		return playerName;
	}
	
	//getter
	char getCounterSymbol() {
		return counterSymbol;	
	}


}
