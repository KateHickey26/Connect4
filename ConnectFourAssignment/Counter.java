//Kate Hickey
//2032000H

public class Counter {
	
	//references Player object
	private Player player;
	
	//constructor
	Counter(Player player){
		this.player = player;
	}
	
	//getter
	Player getPlayer() {
		return player;
	}

	public String toString() {
		return "" + player.getCounterSymbol();	
	}

	/* 
	 * equals() method takes object o, tests if o is an instance of type Counter, 
	 * AND if o.getPlayer (o casted to Counter) points at the same object/memory location 
	 * as the player object being checked against.
	 */
	
	public boolean equals(Object o) {
		if(o instanceof Counter && ((Counter)o).getPlayer() == getPlayer()) {
			return true;
		}else {
			return false;
		}
	}
}
